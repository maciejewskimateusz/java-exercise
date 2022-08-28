package klimatyzacja;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(4);
        BuildingController buildingController = new BuildingController(building);
        buildingController.controlLoop();
    }
}
