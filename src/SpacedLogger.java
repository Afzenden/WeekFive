
public class SpacedLogger implements Logger {

	@Override
	public void Log(String l) {
		String spacedString = "";
		for (int i = 0; i < l.length(); i++) {
			spacedString += l.charAt(i) + " ";
		}
		
		System.out.println(spacedString);
		
	}

	@Override
	public void Error(String e) {
		String spacedString = "ERROR: ";
		for (int i = 0; i < e.length(); i++) {
			spacedString += e.charAt(i) + " ";
		}
		
		System.out.println(spacedString);
		
	}

}
