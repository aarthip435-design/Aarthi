class Bank{
double amount;
Methods(double amount){
this.amount=amount;
}
double withdrawalAmount(double x){
amount=amount-x;
if(amount>=x){
System.out.println("Withdrawal successful");
}else{
System.out.println("Insufficient Balance");
}
return amount;
}
double depositAmount(double y){
amount=amount+y;
return amount;
}
public static void main(String[] args){
Methods m=new Methods(1000);
System.out.println("After withdrawal total amount is: "+m.withdrawalAmount(300));
System.out.println("Total Balance after deposit is: "+m.depositAmount(1000));
}
}