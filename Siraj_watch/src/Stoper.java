import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stoper implements watchState {
	Scanner sc = new Scanner(System.in); // Create a Scanner object

	long startTime;
	long stopTime;
	long elapsed;

	public Stoper() {
		Stop();
		alert();
	}

	public void alert() {
		System.out.println("00:00:00");
	}

	public void Start() {
		startTime = System.currentTimeMillis();
	}

	public void Pause() {
		stopTime = System.currentTimeMillis();
		elapsed = stopTime - startTime;
	}

	public void Resume() {
		startTime = elapsed + System.currentTimeMillis();
	}

	public void Stop() {
		startTime = stopTime = System.currentTimeMillis();
		elapsed = 0;
	}

	public void elapsedTime() {
		Date result = new Date(elapsed);
		DateFormat simple = new SimpleDateFormat("hh:mm:ss");
		System.out.println(simple.format(result));
	}

	@Override
	public void buttonB() {

		boolean flag = true;
		System.out.println("Press anything to start");
		char value = sc.next().charAt(0);
		Start();

		while (flag) {
			System.out.println("Press anything to Pause");
			value = sc.next().charAt(0);
			Pause();
			elapsedTime();

			System.out.println("Press anything to Resume or E-to Exit");
			value = sc.next().charAt(0);
			if (value == 'E') {
				flag = false;
			}
		}
	}

	@Override
	public void buttonC() {
		Stop();
		alert();
	}

}
