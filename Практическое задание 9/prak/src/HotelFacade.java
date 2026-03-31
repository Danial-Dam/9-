class HotelFacade {

    private RoomBookingSystem roomSystem;
    private RestaurantSystem restaurantSystem;
    private EventManagementSystem eventSystem;
    private CleaningService cleaningService;
    private TaxiService taxiService;

    public HotelFacade() {
        roomSystem = new RoomBookingSystem();
        restaurantSystem = new RestaurantSystem();
        eventSystem = new EventManagementSystem();
        cleaningService = new CleaningService();
        taxiService = new TaxiService();
    }

    public void bookRoomWithServices(int roomNumber, String food) {

        roomSystem.checkAvailability(roomNumber);
        roomSystem.bookRoom(roomNumber);

        restaurantSystem.orderFood(food);

        cleaningService.scheduleCleaning(roomNumber);

        System.out.println("Room booked with restaurant and cleaning services");
    }

    public void organizeEvent(String hall, String equipment, int roomNumber) {

        eventSystem.bookConferenceHall(hall);
        eventSystem.orderEquipment(equipment);

        roomSystem.bookRoom(roomNumber);

        System.out.println("Event organized with room booking");
    }

    public void reserveRestaurantWithTaxi(String name) {

        restaurantSystem.reserveTable(name);

        taxiService.callTaxi(name);

        System.out.println("Restaurant reserved and taxi ordered");
    }

    public void cancelRoom(int roomNumber) {
        roomSystem.cancelBooking(roomNumber);
    }

    public void requestCleaning(int roomNumber) {
        cleaningService.cleanRoom(roomNumber);
    }
}