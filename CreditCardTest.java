//Nouf Tariq Alfaris
//444200531
//lab time: Sunday 10:00AM to 11:50AM
import java.util.*;

public class CreditCardTest{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

CreditCardAcc acc1 = new CreditCardAcc("1234567890123456", "Nada Ahmad");

System.out.print("Enter a card number: ");
String cardNo = input.next();
input.nextLine();
System.out.print("Enter a card holder name: ");
String holderName = input.nextLine();
System.out.print("Enter an amount: ");
double amount = input.nextDouble();

CreditCardAcc acc2 = new CreditCardAcc(cardNo, holderName);

acc2.addTransaction(amount);
acc1.upgradePurchaseLimit(4000);

acc1.addTransaction(-500);
acc1.addTransaction(2000);


System.out.println();
System.out.println("Credit card accounts information:");
acc1.printInfo();
acc2.printInfo();
System.out.println();

System.out.println("Number of accounts:"+CreditCardAcc.NumOfAccounts);
}


}