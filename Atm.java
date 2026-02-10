package atm;

public class Atm {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // constructor
    public Atm() {
        super();
    }
    //getters and setters
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount=depositAmount;
    }
    public double getWithdrawAmount(){
        return withdrawAmount;
    }
    public void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }

    //toString method
    @Override
    public String toString() {
        return "Atm{" +
                "balance=" + balance +
                ", depositAmount=" + depositAmount +
                ", withdrawAmount=" + withdrawAmount +
                '}';
    }
}
