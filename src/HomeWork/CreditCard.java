package HomeWork;

public class CreditCard {
    private double currentSum;
    private String accountNumber;

    public CreditCard() {
        currentSum = 0;
        accountNumber = "5555 1111 2222 4444";
    }

    public CreditCard(double currentSum, String accountNumber) {
        this.currentSum = currentSum;
        this.accountNumber = accountNumber;
    }

    public void depositAccount(double sum) {
        this.currentSum += sum;
    }

    public void withdrawMoney(double sum) {
        this.currentSum -= sum;
    }

    public void getAccountBalance() {
        System.out.println("Card #" + accountNumber + ", balance - " + this.currentSum);
    }
}
