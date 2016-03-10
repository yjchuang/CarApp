

public class Car extends Vehicle 
{
	private String model;
	private String color;
	private int speed;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Car(String start, String run, String stop, String accelerate, String model, String color, int speed) {
		super(start, run, stop, accelerate);
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public Car() {
		super();
		
	}
	public Car(String start, String run, String stop, String accelerate) {
		super(start, run, stop, accelerate);
	
	}
	
	@Override
	public String getDisplayText(String operating)
	{
		return "The " + color + " " + model + " is "+ operating + "\n";
		
	}
	
}

