public class PublisherMember extends Member {
    public PublisherMember() {
    }

    public PublisherMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFees() {
        return 5000 + (5000 * 0.05) + 20000;
    }

    @Override
    public String toString() {
        return "Publisher Member\n" +
                "Name: " + getName() + "\n" +
                "ID: " + getId() + "\n" +
                "Fee: " + calculateFees();
    }
}
