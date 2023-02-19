public class CreditCard {
    private double currentSum;
    private String accountNumber;

    CreditCard() {
        currentSum = 0;
        accountNumber = "5555 1111 2222 4444";
    }

    CreditCard(double currentSum, String accountNumber) {
        this.currentSum = currentSum;
        this.accountNumber = accountNumber;
    }

    void depositAccount(double sum) {
        this.currentSum += sum;
    }

    void withdrawMoney(double sum) {
        this.currentSum -= sum;
    }

    void getAccountBalance() {
        System.out.println("Card #" + accountNumber + ", balance - " + this.currentSum);
    }
}
