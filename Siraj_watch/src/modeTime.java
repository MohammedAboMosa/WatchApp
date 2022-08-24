import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class modeTime implements watchState {

	Date currentTime;
	SimpleDateFormat a;
	WatchContext mt;

	public modeTime() {
		currentTime = new Date();
		a = new SimpleDateFormat("hh:mm");
		alert();
	}

	@Override
	public void alert() {
		System.out.println(a.format(currentTime));
	}

	@Override
	public void buttonB() {
		a = new SimpleDateFormat("hh:mm a");
		System.out.println(a.format(currentTime));
	}

	@Override
	public void buttonC() {
		try {
			TimeUnit.SECONDS.sleep(120);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currentTime = new Date();
		System.out.println("Alaaaaaarm " + a.format(currentTime));

	}

}
