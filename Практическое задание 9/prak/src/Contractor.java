class Contractor extends OrganizationComponent {

    private String name;
    private String role;
    private double payment;

    public Contractor(String name, String role, double payment) {
        this.name = name;
        this.role = role;
        this.payment = payment;
    }

    public void showDetails() {
        System.out.println(name + " - Contractor (" + role + ")");
    }

    public double getBudget() {
        return 0;
    }

    public int getEmployeeCount() {
        return 1;
    }
}