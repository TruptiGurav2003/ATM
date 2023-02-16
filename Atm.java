package simple;
import java.util.Scanner;
public class Atm
{
    public static void main(String[]  args)
    {
        int balance=200000, x , y;
        //x=withdraw and y=deposit
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to the ATM ");
            System.out.println("Select 1 for CASH-WITHDRAWAL");
            System.out.println("Select 2 for CASH-DEPOSIT");
            System.out.println("Select 3 for Balance Checking");
            System.out.println("Select 4 for Exit");
            System.out.println("Select the process that you want to perform");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter money to be withdraw:");
                    x=sc.nextInt();
                    if(balance>=x)
                    {
                        balance=balance-x;
                        System.out.println("Please collect your cash");
                    }
                    else
                    {
                        System.out.println("Insufficient balance.....please check your balance");

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter amount to be deposited:");
                    y=sc.nextInt();
                    balance=balance+y;
                    System.out.println("Your amount has successfully deposited");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance:"+balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }


    }

}



