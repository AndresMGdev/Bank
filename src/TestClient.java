public class TestClient {
    public static void main(String[] args) {
        //Client carlos = new Client();
        //carlos.name = "Carlos Mendoza";
        //carlos.phone = "3014436545";
        //carlos.document = "1007230208";

        Account accountOfCarlos = new Account(-23);
        //accountOfCarlos.holder = carlos;
        accountOfCarlos.setAgency(1);
        accountOfCarlos.setNumber(13);
        System.out.println(accountOfCarlos.getHolder());
    }
}
