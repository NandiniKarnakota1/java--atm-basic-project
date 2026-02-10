package atm;

import java.util.Scanner;

public class Main {
    private static int status;
    public static void main(String args[]) {
        //object creation
        AtmOperationsImplementation imple = new AtmOperationsImplementation();
        //scanner class
        Scanner sc = new Scanner(System.in);
        // user atm number
        int atmNumber = 13579;
        // user atm pin
        int atmPin = 1120;

        System.out.println("***** WELCOME TO ATM MACHINE *****");
        System.out.println("ENTER THE ATM NUMBER : ");
        //storing the atm number entered by the user
        int atmNum2 = sc.nextInt();
        System.out.println("ENTER THE ATM PIN");
        //storing the atm pin entered by the user
        int atmPin2 = sc.nextInt();

        // validation logic
        if (atmNumber == atmNum2 && atmPin == atmPin2) {
            while (true) {
                System.out.println(" 1. VIEW AVAILABLE BALANCE \n 2. WITHDRAW AMOUNT \n 3. DEPOSIT AMOUNT \n 4. VIEW MINI STATEMENT \n 5. EXIT");
                System.out.println("ENTER THE CHOICE : ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    imple.viewBalance();
                } else if (choice == 2) {
                    System.out.println("ENTER THE AMOUNT TO WITHDRAW : ");
                    double withdrawAmt = sc.nextDouble();
                    imple.withdrawAmount(withdrawAmt);
                } else if (choice == 3) {
                    System.out.println("ENTER THE AMOUNT TO DEPOSIT : ");
                    double depositAmt = sc.nextDouble();
                    imple.depositAmount(depositAmt);
                } else if (choice == 4) {
                    imple.viewMiniStatement();
                } else if (choice == 5) {
                    System.out.println("COLLECT YOUR ATM CARD \n  *** THANK YOU ***");
                    System.exit(status);
                }
            }
        }
        // if validation fails
        else{
                System.out.println("Incorrect ATM Number Or Pin.. \n --- RETRY AGAIN!! ---");
            }

        }
}

