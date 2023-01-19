package smartPark;

public class Vehicle extends Engine implements Honkable {

	// Properties //
	private String make;
	private String model;
	private Integer year;
	private String color;
	private Integer numberOfWheels;
	private Integer weight;

	// Methods //
	public void start() {
		System.out.println("Vehicle started");
	};

	public void stop() {
		System.out.println("Vehicle stopped.");
	}

	public void drive(int miles) {
		System.out.println("Vehicle driven" + miles + "miles");
	}

	public void honkV() {
		System.out.println("honk honk!");
	}

	// Getter and Setter //
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	// Implementation of abstract class Engine
	@Override
	public void startEngine() {

	}

	// implementation of the "Honkable" interface method
	@Override
	public void honk() {

	}

}
