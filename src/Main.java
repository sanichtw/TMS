import VerifyAuthentication.Authentication;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Authentication().verifyAuthentication(
                        "sanichtw",
                        "password111",
                        "password111")
        );
    }
}
