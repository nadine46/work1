public class StudentMember extends Member {
    public StudentMember() {
    }

    public StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFees() {
        return 5000;
    }

    @Override
    public String toString() {
        return "Student Member\n" +
                "Name: " + getName() + "\n" +
                "ID: " + getId() + "\n" +
                "Fee: " + calculateFees();
    }
}
