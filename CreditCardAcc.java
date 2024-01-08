//Nouf Tariq Alfaris
//444200531
//lab time: Sunday 10:00AM to 11:50AM

public class CreditCardAcc{


private String cardNo;
private String name;
private double pLimit;
private double balance;
private double points;
private double[] trans;
private int nOfT;
public static int NumOfAccounts;

public CreditCardAcc(String cNo, String n){

cardNo = cNo;
name = n;
trans = new double[100];
pLimit = 2000;
balance = 0;
points = 0;
nOfT = 0;
NumOfAccounts++;

}

public double calculateRewardPoints(double amount){
double points = 0;
points = 10 * (amount/100);
return points;
}

public void addTransaction(double amount){

if(amount<0){
if (nOfT<100 && amount <=pLimit){
trans[nOfT++] = amount;
balance+=amount;
points+=calculateRewardPoints(Math.abs(amount));
}
else if(amount>pLimit)
System.out.println("transaction declined, " + amount + "is greater than "+ pLimit);
else if(nOfT>=100)
System.out.println("transaction declined, the transactions you've made has reached limit");
}

if(amount>0){
if (nOfT<100){
trans[nOfT++] = amount;
balance+=amount;}
else
System.out.println("transaction declined, the transactions you've made has reached limit");
}
}

public void upgradePurchaseLimit(double amount){
pLimit = amount;

}

public void printInfo(){
System.out.printf("Card Number: %s-%s-%s-%s - %s%n", cardNo.substring(0,4),cardNo.substring(4,8) , cardNo.substring(8,12) , cardNo.substring(12), name.toUpperCase());
System.out.printf("Balance/Points: %.1f/%.1f%n", balance, points);
System.out.printf("Purchase Limit: %.1f%n", pLimit);

double sumPayment = 0;
double sumPurchase = 0;
for(int i = 0; i<nOfT; i++)
if(trans[i]>0)
sumPayment+=trans[i];
else if(trans[i]<0)
sumPurchase+=trans[i];
System.out.printf("Number of transactions: %d, total payments: %.1f, total purchases: %.1f%n", nOfT, sumPayment, sumPurchase);
for(int i =0; i<30; i++)
System.out.print("-");

System.out.println();

}




}