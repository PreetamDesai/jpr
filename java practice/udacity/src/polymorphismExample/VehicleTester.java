package polymorphismExample;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] =  new Car();
        vehicles[1] = new Boat();
        
        for(int i=0;i<vehicles.length;i++){
            Vehicle vehicle = vehicles[i];
            vehicle.speed();
        }
    }
}
