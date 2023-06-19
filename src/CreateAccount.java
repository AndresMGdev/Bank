public class CreateAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.holder = "Carlos Mendoza";
<<<<<<< HEAD
        account.agency = 01;
        account.money = Double.valueOf(1000);
=======
        account.agency = 1;
        account.money = 1000;
>>>>>>> faf5af4 (Add Values To Method)
        account.number = 13;

        System.out.println(account.holder+" "+account.number+" "+account.money+" "+account.agency);

        System.out.println(account);
    }
}
