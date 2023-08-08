import java.util.*;

public class AtmMachin {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.enterpin();

    }

}

class ATM {
    double balance = 500f;
    int pin = 5143;
    Scanner all = new Scanner(System.in);

    public void enterpin() {
        System.out.println("===============  WELCOME!, TO THE MINI ATM  ===============\n\nENTER YOUR ATM PIN");
        Scanner sc = new Scanner(System.in);
        int newpin = sc.nextInt();
        if (newpin == pin) {
            menu();

        }
        else{
            System.out.println("SORRY!, INVALID PIN");
        }

    }

    public void menu(){
        outer:
        while(true){
            System.out.println("\n----------MENU----------\n");
        System.out.println("choose 1: Withdrwal money");
        System.out.println("choose 2: Deposite money");
        System.out.println("choose 3: Check blance");
        System.out.println("choose 4: Exit");
        int choose;
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("\nwithdrwal money section");
                withdrwal();
                break;
            case 2:
                System.out.println("seposit section");
                Deposite();
                break;
            case 3:
                accountBal();
                break;
            case 4:
                System.out.println("welcome, come again");
                break outer;
                }
            }
}
    public void withdrwal(){
        System.out.println("\nenter amount");
        int ammount = all.nextInt();
        balance = (double) (balance-ammount);
        System.out.println("Rs. "+ammount+"CR. is debited from your bankaccount");

        
    }
    public void Deposite(){
        System.out.println("\nenter amount for deposite");
        int ammount = all.nextInt();
        balance = (double) (balance+ammount);
        System.out.println("Rs. "+ammount+"CR. is credited to your bankaccount");
    }
    public void accountBal(){
        System.out.println("balance: Rs. "+balance+"CR.");
    }
}