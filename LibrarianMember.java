public class LibrarianMember extends Member {
    public LibrarianMember() {
    }

    public LibrarianMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFees() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Librarian Member\n" +
                "Name: " + getName() + "\n" +
                "ID: " + getId() + "\n" +
                "Fee: " + calculateFees();
    }
}
