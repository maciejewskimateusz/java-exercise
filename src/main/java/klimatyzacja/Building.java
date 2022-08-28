package klimatyzacja;

import java.util.Arrays;
import java.util.Random;

public class Building {

    private Room[] rooms;
    private Random random = new Random();

    public Building(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        generateRoom();

    }

    private void generateRoom() {
        for (int i = 0; i < rooms.length; i++) {
            AirConditioner airConditioner = generateRandomAirConditioner();
            int roomSize = random.nextInt(30) + 20;
            int currentTemperature = random.nextInt(10) + 20;
            int targetTemperature = currentTemperature - random.nextInt(4);
            rooms[i] = new Room(i + 1, roomSize, currentTemperature, targetTemperature, airConditioner);
        }
    }

    private AirConditioner generateRandomAirConditioner() {
        double value = random.nextDouble();
        return value < 0.5 ? new BasicAirConditioner() : new ProAirConditioner();
    }

    public boolean areAllRoomsCool() {
        for (final Room room : rooms) {
            if (room.getCurrentTemperature() > room.getTargetTemperature())
                return false;
        }
        return true;
    }

    public void cool() {
        for (final Room room : rooms) {
            room.cool();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (final Room room : rooms) {
            sb.append(room).append("\n");
        }
        return sb.toString();
    }

}
