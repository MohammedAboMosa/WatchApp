import java.util.*;
import java.text.*;

public class modeDate implements watchState {
	Date currentDate;
	SimpleDateFormat a = new SimpleDateFormat("dd/MM");

	public modeDate() {
		currentDate = new Date();
		alert();
	}

	public void alert() {
		System.out.println(a.format(currentDate));
	}

	@Override
	public void buttonB() {
		SimpleDateFormat a = new SimpleDateFormat("yyyy");
		System.out.println(a.format(currentDate));
	}

	@Override
	public void buttonC() {
		SimpleDateFormat a = new SimpleDateFormat("EEEE");
		System.out.println(a.format(currentDate));
	}

}
