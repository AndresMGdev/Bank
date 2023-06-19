public class CreateAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.holder = "Carlos Mendoza";
        account.agency = 01;
        account.money = Double.valueOf(1000);
        account.number = 13;

        System.out.println(account.holder+" "+account.number+" "+account.money+" "+account.agency);

        System.out.println(account);
    }
}
