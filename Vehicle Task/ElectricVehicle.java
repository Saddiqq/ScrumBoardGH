package smartPark;

public class ElectricVehicle extends Vehicle {

	// Properties //
	private Integer batteryCapacity;
	private Integer chargeLevel;

	// Methods //
	public void charge() {
		chargeLevel++; 
	}

	
	@Override 
	public void drive(int miles) {
		super.drive(miles);
		System.out.println("Electric vehicle driven" +miles+ "miles");
	}


	// Getter and Setter //
	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Integer getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(Integer chargeLevel) {
		this.chargeLevel = chargeLevel;
	};

}
