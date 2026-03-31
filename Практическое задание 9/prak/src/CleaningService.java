class CleaningService {

    public void scheduleCleaning(int roomNumber) {
        System.out.println("Cleaning scheduled for room " + roomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " cleaned");
    }
}