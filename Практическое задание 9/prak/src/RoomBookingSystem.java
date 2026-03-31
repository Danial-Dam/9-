class RoomBookingSystem {

    public void checkAvailability(int roomNumber) {
        System.out.println("Checking availability for room " + roomNumber);
    }

    public void bookRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " booked");
    }

    public void cancelBooking(int roomNumber) {
        System.out.println("Booking for room " + roomNumber + " cancelled");
    }
}