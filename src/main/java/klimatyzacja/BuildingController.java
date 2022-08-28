package klimatyzacja;

public class BuildingController {

    private Building building;

    public BuildingController(final Building building) {
        this.building = building;
    }

    public void controlLoop() {

        while (!building.areAllRoomsCool()) {
            System.out.println(building);
            building.cool();
            freeze();
        }
    }

    private void freeze() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
