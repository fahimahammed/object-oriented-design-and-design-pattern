package Problem4;

public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("Boikali, Khulna");

        Housing floor1 = new Housing("Boikali, Khulna - 1st floor");
        int firstFloor = building.addStructure(floor1);
        System.out.println("Component Number: " + firstFloor);

        Room bedRoom1 = new Room("Master Bed Room");
        Room bedRoom2 = new Room("Common Bed Room");
        Room washRoom1 = new Room("Washroom");
        int firstBedRoom = floor1.addStructure(bedRoom1);
        int secoundBedRoom = floor1.addStructure(bedRoom2);
        int firstWashRoom = floor1.addStructure(washRoom1);

        building.enter();

        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter();

        Room currentRoom = (Room) currentFloor.getStructure(firstBedRoom);
        currentRoom.enter();
        currentRoom.exit();

        currentRoom = (Room) currentFloor.getStructure(firstWashRoom);
        currentRoom.enter();
        currentRoom.exit();

        currentFloor.exit();
        building.exit();
    }
}
