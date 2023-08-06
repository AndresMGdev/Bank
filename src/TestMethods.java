public class TestMethods {
    public static void main(String[] args) {
        Account myAccount = new Account(-44);
        System.out.println("valor que tengo en mi cuenta: "+myAccount.getMoney());
        myAccount.deposit(400);
        System.out.println("deposito de mi cuenta: "+myAccount.getMoney());
        myAccount.withdraw(600);
        System.out.println("dinero restante despues del retiro: "+myAccount.getMoney());

        Account jimenaAccount = new Account(-7);
        System.out.println("valor que Jimena tiene en su cuenta: "+jimenaAccount.getMoney());
        jimenaAccount.deposit(1000);
        System.out.println("deposito de la cuenta de Jimena: "+jimenaAccount.getMoney());
        jimenaAccount.transfer(300, myAccount);
        System.out.println("restante de Jimena despues de depositarme: "+jimenaAccount.getMoney());
        System.out.println("midinero actual: "+myAccount.getMoney());

    }
}
