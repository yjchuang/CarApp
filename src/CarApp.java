
public class CarApp {

	public static void main(String[] args) {
		
		 Car blueJeta = new Car("is starting", "is going 50 mph", "is stopped", "is accelerating", 
				 "Jeta", "blue", 50); 
		 Car blueJetaEmissionsPassed = new Car("is starting", "has passed its emissions", "ls stopped", "is accelerating", 
				 "Jeta", "blue", 50); 
		 Car blueJetaEmissionsCheck = new Car("is starting", "has just passed the red Porsche","has stopped to have its emissions checked", "is accelerating", 
				 "Jeta", "blue", 50); 
		 
		 Car redPorsche = new Car("is starting", "is going 50 mph", "is stopped", "is accelerating", 
				 "Porsche", "red", 50); 
		 
		 //String start, String run, String stop, String accelerate, String model, String color, int speed
		 
		 System.out.println(redPorsche.getDisplayText(blueJeta.getStart()));
		 System.out.println(blueJeta.getDisplayText(blueJeta.getStart()));
		 
		 System.out.println(redPorsche.getDisplayText(blueJeta.getAccelerate()));
		 System.out.println(blueJeta.getDisplayText(blueJeta.getAccelerate()));
		 
		 System.out.println(blueJetaEmissionsCheck.getDisplayText(blueJetaEmissionsCheck.getStop()));
		 System.out.println(blueJetaEmissionsPassed.getDisplayText(blueJetaEmissionsPassed.getRun()));
		 
		 System.out.println(redPorsche.getDisplayText(blueJeta.getRun()));
		 System.out.println(redPorsche.getDisplayText(blueJeta.getStop()));
		 
		 System.out.println(blueJetaEmissionsCheck.getDisplayText(blueJetaEmissionsCheck.getRun()));
		 

	}

}
