package threads;

import java.util.Queue;
import java.util.Random;

public class ProducerThread extends Thread {

	private final Queue<Integer> warehouse;

	public ProducerThread(Queue<Integer> warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void run() {

		Random random = new Random();

		synchronized (warehouse) {
			while (true) {
				int size = warehouse.size();
				for (int i = 0; i < 10 - size; i++) {
					int number = random.nextInt(11);
					warehouse.add(number);
					System.out.println(String.format("Producer добавил число %d в хранилище", number));
				}
				warehouse.notifyAll();
				int timeToWait = 5000;
				try {
					warehouse.wait(timeToWait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
