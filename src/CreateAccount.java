public class CreateAccount {
    public static void main(String[] args) {
        Account account = new Account(-8);
        // account.holder = "Carlos Mendoza";
        account.setAgency(1);
        account.setNumber(13);

        System.out.println(account.getHolder()+" "+account.getMoney());

        System.out.println(account);
    }
}
