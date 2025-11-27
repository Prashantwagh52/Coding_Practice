
public class Singelton {

	private static Singelton instance;

	private Singelton() {

	}

	public static Singelton get() {

		if (instance == null) {
			instance = new Singelton();
		}

		return instance;
	}
}
