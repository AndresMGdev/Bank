public class Account {
    private double money;
    private int agency;
    private int number;
    private Client holder = new Client();
    private static int total = 0;

    public Account(int agency) {
        if (agency <= 0) {
            System.out.println("no permision 0");
            this.agency = 1;
        } else {
            this.agency = agency;
        }
        total++;
        System.out.println("Here Create New Account " + total);
    }

    public void deposit(double value) {
        this.money += value;
    }

    public void withdraw(double value) {
        if (this.money >= value) {
            this.money -= value;
            System.out.println("Retiro realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transfer(double value, Account account) {
        if (this.money >= value) {
            this.money -= value;
            account.deposit(value);
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Saldo a transferir insuficiente");
        }
    }

    public double getMoney() {
        return this.money;
    }

    public void setAgency(int agency) {
        if (agency > 0) {
            this.agency = agency;
        }
    }

    public int getAgency() {
        return this.agency;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    public int getNumber() {
        return this.number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }
}
