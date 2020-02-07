package zhang;

import java.util.LinkedList;
import java.util.Queue;

public class FileTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.poll();
		for (String string : queue) {
			System.out.println(string);
		}
	}
}
