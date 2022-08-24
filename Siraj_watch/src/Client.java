import java.util.Scanner;

public class Client {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		// I deduced from the question that design pattern is State

		WatchContext client1 = new WatchContext();
		boolean flage = true;

		while (flage) {
			System.out.println("please press a key: A / B / C  or E-to Exit and go to Hour Mode");
			char value = sc.next().charAt(0);
			if (value == 'E') {
				client1.nextState(3);
				flage = false;
			} else
				client1.onPress(value);
		}
	}

}
