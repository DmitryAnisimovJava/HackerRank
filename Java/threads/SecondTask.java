package threads;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SecondTask {

	public static void main(String[] args) throws InterruptedException {
		Random random = new Random();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		int[] array = new int[random.nextInt(1_000_000)];
		Arrays.setAll(array, number -> random.nextInt(3001));
		{
			LocalTime startTime = LocalTime.now();
			int max = Arrays.stream(array).max().getAsInt();
			System.out.println("Максимальное значение при одиночном %d".formatted(max));
			System.out.println((LocalTime.now().toNanoOfDay() - startTime.toNanoOfDay()) * Math.pow(10, -6));
		}
		newFixedThreadPool.submit(() -> {
			LocalTime startTime = LocalTime.now();
			int max = Arrays.stream(array).parallel().max().getAsInt();
			System.out.println("Максимальное значение при параллельном %d".formatted(max));
			System.out.println((LocalTime.now().toNanoOfDay() - startTime.toNanoOfDay()) * Math.pow(10, -6));
		});

		newFixedThreadPool.shutdown();
		newFixedThreadPool.awaitTermination(30L, TimeUnit.SECONDS);
	}
}
