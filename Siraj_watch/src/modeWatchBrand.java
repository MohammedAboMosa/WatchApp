import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class modeWatchBrand implements watchState {

	public modeWatchBrand() {
		alert();
	}

	public void alert() {
		System.out.println("The One s2!");
	}

	@Override
	public void buttonB() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
			writer.write("The One s2!\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buttonC() {

	}

}
