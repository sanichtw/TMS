public class Main {
    public static void main(String[] args) {
        //  1. get credit card info
        HomeWork.CreditCard card1 = new HomeWork.CreditCard();
        HomeWork.CreditCard card2 = new HomeWork.CreditCard(512.24, "5555 1000 0000 0000");
        HomeWork.CreditCard card3 = new HomeWork.CreditCard(2000, "8888 6666 7777 6666");

        card1.depositAccount(1111);
        card2.depositAccount(2222);
        card3.withdrawMoney(1000);

        card1.getAccountBalance();
        card2.getAccountBalance();
        card3.getAccountBalance();
        System.out.println("_______________________________________");


        // 2. get computer info
        HomeWork.RAM ramInfo = new HomeWork.RAM("Samsung DDR4", 8);
        HomeWork.HDD hddInfo = new HomeWork.HDD("Kingston A400", "SATA", 1000);
        HomeWork.Computer computer1 = new HomeWork.Computer(1000, "Acer");
        HomeWork.Computer computer2 = new HomeWork.Computer(1200, "Lenovo", ramInfo, hddInfo);

        computer1.getFullInfo();
        computer2.getFullInfo();
    }
}

