package klimatyzacja;

public class BasicAirConditioner implements AirConditioner {

    private static final double CONDITIONER_PERFORMANCE = 1;


    @Override
    public double lowerTemperature(final double temperature, final double roomSize) {
        return temperature - (CONDITIONER_PERFORMANCE / roomSize);
    }

    @Override
    public String toString() {
        return "Basic";
    }
}
