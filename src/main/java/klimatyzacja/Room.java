package klimatyzacja;

public class Room {

    private int number;
    private double roomSize;
    private double currentTemperature;
    private double targetTemperature;
    private AirConditioner airConditioner;


    public Room(final int number, final double roomSize, final double currentTemperature, final double targetTemperature, final AirConditioner airConditioner) {
        this.number = number;
        this.roomSize = roomSize;
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.airConditioner = airConditioner;
    }

    public int getNumber() {
        return number;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void cool() {
        if (currentTemperature > targetTemperature) {
            currentTemperature = airConditioner.lowerTemperature(currentTemperature, roomSize);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", roomSize=" + roomSize +
                ", currentTemperature=" + String.format("%.2f", currentTemperature) +
                ", targetTemperature=" + targetTemperature +
                ", airConditioner=" + airConditioner +
                '}';
    }
}
