package chain;

public class Salary {
    final double amount;
    final double increase;

    public Salary(double amount, double increase) {
        this.amount = amount;
        this.increase = increase;
    }

    public double getAmount() {
        return amount;
    }

    public double getIncrease() {
        return this.increase;
    }
}
