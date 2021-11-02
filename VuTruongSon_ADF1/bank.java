package thi;

public class bank {
    private double balance;
    private double rate;

    public bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest() {
        double interest;
        interest = balance * (rate / 1200);
        return interest;
    }

    public static void main(String[] args) {
        bank bank = new bank(1000, 10);
        double interest = bank.calculateInterest();
        System.out.printf("%.2f\n", interest);
    }

}
