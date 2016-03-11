
public abstract class Vehicle {
	private String start;
	private String run;
	private String stop;
	private String accelerate;

	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	public String getAccelerate() {
		return accelerate;
	}
	public void setAccelerate(String accelerate) {
		this.accelerate = accelerate;
	}
	public Vehicle(String start, String run, String stop, String accelerate) {
		super();
		this.start = start;
		this.run = run;
		this.stop = stop;
		this.accelerate = accelerate;
	}
	public Vehicle() {
		super();
		
	}

	
	abstract String getDisplayText(String _operation);
	
}
