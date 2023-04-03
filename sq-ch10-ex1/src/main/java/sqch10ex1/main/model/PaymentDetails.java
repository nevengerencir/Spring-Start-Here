package sqch10ex1.main.model;

public class PaymentDetails {
    private double amount;

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "amount=" + amount +
                '}';
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
