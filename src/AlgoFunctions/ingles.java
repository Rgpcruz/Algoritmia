public class BatteryManagementSystem {
    private double capacityKWh;
    private double soc; // State of Charge in %
    private double temperatureC; // Temperature in Celsius

    public BatteryManagementSystem(double capacityKWh) {
        this.capacityKWh = capacityKWh;
        this.soc = 100.0; // Initially set to 100%
        this.temperatureC = 25.0; // Initial temperature in Celsius
    }


    public String monitorTemperature(double newTemperatureC) {
        this.temperatureC = newTemperatureC;
        if (temperatureC > 60) {
            return "ALERT: Critical Temperature!";
        } else if (temperatureC < 0) {
            return "ALERT: Risk of Freezing!";
        }
        return "Temperature is within safe range.";
    }
}