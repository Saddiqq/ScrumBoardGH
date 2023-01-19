package smartPark;

public class Car extends Vehicle {

	// Properties //
	private Integer numberOfDoors;

	// Methods //
	public void openTruck() {
		System.out.println("Truck Opened");
	};

	// Getter and Setter //
	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
