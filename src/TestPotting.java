public class TestPotting {
    public static void main(String[] args) {
        Account account = new Account(555);
        Account account2 = new Account(545);
        Client client = new Client();
        client.setName("Andrés Mendoza");
        client.setDocument("1007230207");
        client.setPhone("3014436545");
        account.setAgency(-5);
        account.setHolder(client);
        System.out.println(account.getAgency());
        System.out.println(client.getName());
        System.out.println(account.getHolder().getName());
    }
}
