import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
    private List<Aircraft> fleet;

    public Airline() {
        fleet = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    public int calculateTotalCapacity() {
        return fleet.stream().mapToInt(Aircraft::getCapacity).sum();
    }

    public double calculateTotalCargoWeight() {
        return fleet.stream().mapToDouble(Aircraft::getCargoWeight).sum();
    }

    public void sortFleetByFlightRange() {
        fleet.sort(Comparator.comparingInt(Aircraft::getFlightRange));
    }

    public List<Aircraft> findAircraftByFuelConsumption(double minFuel, double maxFuel) {
        List<Aircraft> result = new ArrayList<>();
        for (Aircraft aircraft : fleet) {
            if (aircraft.getFuelConsumption() >= minFuel && aircraft.getFuelConsumption() <= maxFuel) {
                result.add(aircraft);
            }
        }
        return result;
    }

    public void printFleet() {
        for (Aircraft aircraft : fleet) {
            System.out.println(aircraft);
        }
    }
}
