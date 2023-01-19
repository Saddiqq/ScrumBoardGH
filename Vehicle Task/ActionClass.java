package smartPark;

public class ActionClass {

	public static void main(String[] args) {
		
		
Vehicle newVehicle = new Vehicle();  

newVehicle.setMake("Toyota"); 
newVehicle.setModel("Camry");
newVehicle.setYear(2015);
newVehicle.setColor("Red");
newVehicle.setWeight(2);

System.out.println(newVehicle.getMake()); 
System.out.println(newVehicle.getModel());
System.out.println(newVehicle.getYear());
System.out.println(newVehicle.getColor());
System.out.println(newVehicle.getWeight());

	}

}