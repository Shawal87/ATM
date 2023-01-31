import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu  extends  Account{

    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();

    public void getLogin() throws IOException{

         int x = 1;
         do {
            try{
                data.put(952141,191904);
                data.put(989947, 71976);

                System.out.println("Welcome to the ATM project!");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter uour PIN number: ");
                setPinNumber(menuInput.nextInt());


            }catch (Exception e){
                System.out.println("\n" + "Invalid Character(s). Only Numbers" + "\n");
                x = 2;
            }

            /*for(Map.Entry<Integer,Integer> it: data.entrySet()){
             *if(it.getkey()==getCustomerNumber() && it.getValue()==getPinNumber){
             * getAccountType();}}
             */

             int cn = getCustomerNumber();
             int pn = getPinNumber();
             if (data.containsKey(cn) && data.get(cn) ==pn){
                 getAccountType();
             }else
                 System.out.println("\n"+"Wrong Cutimer NUmber or Pin Number"+ "\n");
        } while( x==1);
    }






    private void getAccountType() {
        System.out.println("Select the Account you want to access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1 :
              getChecking();
              break;
              
            case 2 :
                getSaving();
                break;

            case 3 :
                System.out.println("Thank You using our service. \n");
                break;

            default:
                System.out.println();
        }
    }


    private void getChecking() {
    }
    private void getSaving() {
    }



}



