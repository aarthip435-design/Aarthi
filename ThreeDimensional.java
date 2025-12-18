import java.util.Scanner;
class TwoDimensional{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int age[]=new int[2][3][5];
for(int i=1;i<=age.length;i++){
for(int j=1;j<=age[i].length;j++){
for(int k=1;k<=age[i][j].length;k++){
System.out.println("Enter the age of student:"+k+"classroom"+j+"Branch"+i);
age[i][j][k]=sc.nextInt();
}
}
}
System.out.println("The ages are............");
for(int i=1;i<=age.length;i++){
for(int j=1;j<=age[i].length;j++){
for(int k=1;k<=age[i][j].length;k++){
System.out.println(age[i][j][k]);}
}
}
}
}
}