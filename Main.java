import java.util.List;
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline();

        // Adding aircrafts to the fleet
        airline.addAircraft(new PassengerPlane("Boeing 737", 180, 3000, 2600));
        airline.addAircraft(new CargoPlane("Antonov AN-124", 120, 4800, 5200));
        airline.addAircraft(new PrivateJet("Gulfstream G550", 12, 12000, 1100));

        // Calculating total capacity and cargo weight
        System.out.println("Total Passenger Capacity: " + airline.calculateTotalCapacity());
        System.out.println("Total Cargo Weight: " + airline.calculateTotalCargoWeight() + " tons");

        // Sorting by flight range
        System.out.println("\nFleet sorted by flight range:");
        airline.sortFleetByFlightRange();
        airline.printFleet();

        // Finding aircraft by fuel consumption range
        System.out.println("\nAircraft with fuel consumption between 1000 and 3000 L/h:");
        List<Aircraft> foundAircraft = airline.findAircraftByFuelConsumption(1000, 3000);
        for (Aircraft aircraft : foundAircraft) {
            System.out.println(aircraft);
        }
    }
}
