
public class CarApp {

	public static void main(String[] args) {
		
		 Car blueJeta = new Car("starting", "going 50 mph", "stopped", "accelerating", 
				 "Jeta", "blue", 50); 
		 
		 Car redPorsche = new Car("starting", "going 50 mph", "stopped", "accelerating", 
				 "Porsche", "red", 50); 
		 
		 System.out.println(blueJeta.getDisplayText(blueJeta.getStart()));

	}

}
