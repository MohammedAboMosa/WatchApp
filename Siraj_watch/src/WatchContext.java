
public class WatchContext {

	watchState currentState;
	int idState;

	public WatchContext() {
		currentState = new modeTime();
		idState = 0;
	}

	public void setState(watchState state, int id) {
		currentState = state;
		idState = id;
	}

	public void getState() {

		Class clazz = currentState.getClass();
		System.out.println(clazz);
	}

	public void nextState(int state) {
		switch (state) {
		case 0:
			currentState = new modeDate();
			setState(currentState, 1);
			break;

		case 1:
			currentState = new Stoper();
			setState(currentState, 2);
			break;

		case 2:
			currentState = new modeWatchBrand();
			setState(currentState, 3);
			break;

		case 3:
			currentState = new modeTime();
			setState(currentState, 0);
			break;
		}
	}

	public void onPress(char ch) throws InterruptedException {
		switch (ch) {
		case 'A':
			nextState(idState);
			break;

		case 'B':
			currentState.buttonB();
			break;

		case 'C':
			currentState.buttonC();
			break;

		}
	}
}
