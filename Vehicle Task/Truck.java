package smartPark;

public class Truck extends Vehicle {

	// Properties //
	private Integer numberOfAxles;
	private Integer capacityInTons;

	// Methods //
	public void load(Integer weightOftruck) {
		System.out.println("Loaded" + weightOftruck + "tons");
	}

	// Getter and Setter //
	public Integer getNumberOfAxles() {
		return numberOfAxles;
	}

	public void setNumberOfAxles(Integer numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public Integer getCapacityInTons() {
		return capacityInTons;
	}

	public void setCapacityInTons(Integer capacityInTons) {
		this.capacityInTons = capacityInTons;
	}

}
