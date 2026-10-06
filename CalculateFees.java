public class CalculateFees {
    private Member member;

    public CalculateFees(Member member) {
        setMember(member);
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public double calculateFees() {
        return member.calculateFees();
    }

    @Override
    public String toString() {
        return "Member: " + member + "\n" +
                "Fee: " + calculateFees();
    }
}
