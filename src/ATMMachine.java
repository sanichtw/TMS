public class ATMMachine {
    int numberOf20Notes;
    int numberOf50Notes;
    int numberOf100Notes;
    int allMoney = numberOf20Notes + numberOf50Notes + numberOf100Notes;


//    public void checkMoney(int sum) {
//        if (sum >= 20)
//    }
    public void addMoney(int money) {

    }

    public ATMMachine(int twenty, int fifty, int hundred) {
        this.numberOf20Notes = twenty;
        this.numberOf50Notes = fifty;
        this.numberOf100Notes = hundred;
    }

    public boolean withdrawMoney(int money) {
        switch (money) {
            case 20:
                if (numberOf20Notes >= money) {
                    numberOf20Notes -= money;
                    System.out.println("Снятие " + money / 20 + " купюр номинала 20");
                    return true;
                } else {
                    return false;
                }
            case 50:
                if (numberOf20Notes >= money) {
                    numberOf20Notes -= money;
                    System.out.println("Снятие " + money / 50 + " купюр номинала 50");
                    return true;
                } else {
                    return false;
                }
            case 100:
                if (numberOf20Notes >= money) {
                    numberOf20Notes -= money;
                    System.out.println("Снятие " + money / 100 + " купюр номинала 100");
                    return true;
                } else {
                    return false;
                }
        }
        return true;
    }
}
