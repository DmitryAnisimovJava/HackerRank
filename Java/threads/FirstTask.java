package threads;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FirstTask {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService threads = Executors.newFixedThreadPool(3);
		ThreadLocal<Integer> local = new ThreadLocal<>();
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextInt()) {
				int seconds = scanner.nextInt();
				if (seconds < 0) {
					break;
				}
				threads.submit(() -> {
					Integer integer = local.get();
					local.set(integer == null ? 1 : ++integer);
					try {
						Thread.sleep(seconds * 1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Я спал %d секунд".formatted(seconds));
					System.out
							.println("%s выполнил задач: %d".formatted(Thread.currentThread().getName(), local.get()));
				});
			}
		} finally {
			threads.shutdown();
			threads.awaitTermination(10, TimeUnit.MINUTES);

		}
	}

}
