

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger aLog = new AsteriskLogger();
		aLog.Log("Well Noted");
		aLog.Error("Stop, there is an Error!");
		
		SpacedLogger aSpace = new SpacedLogger();
		aSpace.Log("To Space and Beyond! And even more.");
		aSpace.Error("This is a Mistake!");

	}

}
