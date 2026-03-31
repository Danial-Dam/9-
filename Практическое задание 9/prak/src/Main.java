public class Main {

    public static void main(String[] args) {

        System.out.println("===== FACADE PATTERN =====");

        HotelFacade hotel = new HotelFacade();

        // 1. Бөлме + тамақ + уборка
        hotel.bookRoomWithServices(101, "Pizza");

        System.out.println();

        // 2. Іс-шара ұйымдастыру
        hotel.organizeEvent("Conference Hall", "Projector", 102);

        System.out.println();

        // 3. Ресторан + такси
        hotel.reserveRestaurantWithTaxi("Daniyal");

        System.out.println();

        // 4. Бронь отмена
        hotel.cancelRoom(101);

        // 5. Уборка сұрау
        hotel.requestCleaning(102);


        System.out.println("\n===== COMPOSITE PATTERN =====");

        // Employees
        Employee e1 = new Employee("Ali", "Developer", 3000);
        Employee e2 = new Employee("Dana", "Manager", 5000);

        // Contractor
        Contractor c1 = new Contractor("Arman", "Designer", 1500);

        // Departments
        Department it = new Department("IT Department");
        it.add(e1);
        it.add(c1);

        Department management = new Department("Management");
        management.add(e2);

        Department company = new Department("Company");
        company.add(it);
        company.add(management);

        // Organization structure
        company.showDetails();

        System.out.println("\nTotal Budget: " + company.getBudget());
        System.out.println("Total Employees: " + company.getEmployeeCount());
    }
}