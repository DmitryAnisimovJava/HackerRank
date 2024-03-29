package threads;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> linkedList = new LinkedList<>();

		ProducerThread producerThread = new ProducerThread(linkedList);
		ConsumerThread consumerThread = new ConsumerThread(linkedList);

		producerThread.start();
		consumerThread.start();

		producerThread.join();
		consumerThread.join();
	}

}
