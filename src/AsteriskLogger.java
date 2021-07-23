
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String l) {
		System.out.println("***" + l + "***");
		
	}

	@Override
	public void Error(String e) {
		String extraAsterisk = "";
		
		for (int i = 0; i < e.length() + 3; i++) {
			extraAsterisk += "*";
		}
		
		System.out.println("**********" + extraAsterisk);
		System.out.println("***Error: " + e + "***");
		System.out.println("**********" + extraAsterisk);
	}

}
