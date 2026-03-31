class Employee extends OrganizationComponent {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println(name + " - " + position + " Salary: " + salary);
    }

    public double getBudget() {
        return salary;
    }

    public int getEmployeeCount() {
        return 1;
    }
}