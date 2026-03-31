abstract class OrganizationComponent {

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void showDetails();

    public abstract double getBudget();

    public abstract int getEmployeeCount();
}