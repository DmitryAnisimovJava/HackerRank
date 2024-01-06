package threads;

import java.util.Queue;
import java.util.Random;

public class ConsumerThread extends Thread {

	private final Queue<Integer> warehouse;

	public ConsumerThread(Queue<Integer> warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void run() {

		Random random = new Random();

		synchronized (warehouse) {
			while (true) {
				if (!warehouse.isEmpty()) {
					int integerFromWarehouse = warehouse.poll();
					System.out.println(String.format("Consumer убрал из хранилища число %d", integerFromWarehouse));
					try {
						warehouse.wait(random.nextInt(10));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					try {
						warehouse.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}

}
