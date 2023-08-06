public class TestAccess {
    public static void main(String[] args) {
        Account account = new Account(-334);
        account.deposit(400);
        account.withdraw(300);
        account.setNumber(-13);
        account.setAgency(-4);
        System.out.println(account.getMoney());
        System.out.println(account.getAgency());
        System.out.println(account.getNumber());
    }
}
