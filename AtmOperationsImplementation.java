package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationsImplementation implements AtmInterface{
    // object creation
   Atm atm = new Atm();
   // map to store the transactions/data
   Map<Double,String> ministmt = new HashMap<>();
   // to check the available balance
    public void viewBalance() {
        System.out.println("Available Balance:" + atm.getBalance());
    }
    // logic for amount withdrawal
    public void withdrawAmount(double withdrawAmount) {
        // validation logic
        if(withdrawAmount%500 == 0){
            if(withdrawAmount<=atm.getBalance()){
                System.out.println("Collect the Cash:" + withdrawAmount);
                atm.setBalance(atm.getBalance()-withdrawAmount);
                ministmt.put(withdrawAmount, "Amount Withdrawn");
                viewBalance();
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        // validation fails
        else {
            System.out.println("Enter the amount in terms of 500");
        }

    }

    // for amount deposits
    public void depositAmount(double depositAmount) {
        System.out.println("Deposited Amount is :" + depositAmount);
        atm.setBalance(atm.getBalance()+depositAmount );
        ministmt.put(depositAmount,"Deposited Successfully");
        viewBalance();

    }

    // for viewing mini statements
    public void viewMiniStatement() {
        Set<Double> set = ministmt.keySet();
        for(Double d : set){
            System.out.println(d + "--->" + ministmt.get(d));
        }


    }
}
