public abstract class Aircraft {
    private String model;
    private int capacity; // Passenger capacity
    private double cargoWeight; // Cargo capacity in tons
    private int flightRange; // Flight range in kilometers
    private double fuelConsumption; // Fuel consumption in liters per hour

    public Aircraft(String model, int capacity, double cargoWeight, int flightRange, double fuelConsumption) {
        this.model = model;
        this.capacity = capacity;
        this.cargoWeight = cargoWeight;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Capacity: %d, Cargo: %.2f tons, Range: %d km, Fuel: %.2f L/h",
                model, capacity, cargoWeight, flightRange, fuelConsumption);
    }
}
