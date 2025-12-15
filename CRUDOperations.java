import java.util.HashMap;
import java.util.Scanner;
class Student{
    private int sNo;
    private String sname;
    private int age;
    public Student(int sNo, String sname, int age) {
        this.sNo = sNo;
        this.sname = sname;
        this.age = age;
    }
    public int getSNo(){
        return sNo;
    }
    public void setSNo(int sNo){
        this.sNo=sNo;
    }
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
       return "[Student No.= "+sNo+", Student Name= "+sname+", Student Age= "+age+"]";
    }    
}
public class CRUDOperations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashMap<Integer,Student> database=new HashMap<Integer,Student>();
        int opt=0,sNo=0,age=0;
        String sname=null;
        Student s1=null;
        do{
            System.out.println("1. Add");        
            System.out.println("2. Find");        
            System.out.println("3. Update");        
            System.out.println("4. Delete");        
            System.out.println("5. View");
            System.out.println("6. Exit");
            System.out.print("Enter the option:");        
            opt=scan.nextInt();
            switch (opt) {
                case 1:
                        System.out.print("Student No:\t");
                        sNo=scan.nextInt();
                        scan.nextLine();
                        System.out.print("Student Name:\t");
                        sname=scan.nextLine();
                        System.out.print("Student Age:\t");
                        age=scan.nextInt();
                        System.out.println(sNo);
                        System.out.println(sname);
                        System.out.println(age);
                        s1=new Student(sNo,sname,age);
                        database.put(sNo, s1);
                        System.out.println("Student details are inserted successfully");
                    break;
                case 2:
                        System.out.print("Enter Student No. to find:\t");
                        sNo=scan.nextInt();
                        s1=database.get(sNo);
                        if(s1!=null)
                            System.out.println(s1);
                        else
                            System.out.println("Student Not Found");
                        break;
                case 3:
                            System.out.print("Enter Student No. to update:\t");
                            sNo=scan.nextInt();
                            s1=database.get(sNo);
                            if(s1!=null){
                                System.out.println("Student found");
                                 System.out.println(s1);
                                 System.out.println("what do you want to update:\t");
                                 System.out.println("1. Student Name");
                                 System.out.println("2. Student Age");
                                 System.out.println("3. Both"); 
                                 int opt2=scan.nextInt();
                                 scan.nextLine();  //to read new line
                                 switch (opt2) {
                                     case 1:
                                            System.out.print("Enter Student Name:\t");
                                            s1.setSname(scan.nextLine());
                                            System.out.println("Student Name is modified...");
                                     case 2:
                                            System.out.print("Enter Student Age:\t");
                                            s1.setAge(scan.nextInt());
                                            System.out.println("Student Age is modified...");
                                     case 3:
                                        System.out.print("Enter Student Name:\t");
                                            s1.setSname(scan.nextLine());
                                            System.out.println("Student Name is modified...");
                                            System.out.print("Enter Student Age:\t");
                                            s1.setAge(scan.nextInt());
                                            System.out.println("Student Age is modified...");
                                     default:
                                        System.out.println("Invalid Option");
                                 }
                            }

                            break;
                case 4:
                            System.out.println("..........DataBase........");
                            System.out.println(database);
                            System.out.println("Enter Student No. to delete...");
                            int sno=scan.nextInt();
                            if(database.remove(sno)!=null)
                                System.out.println("deleted successfully...");
                            else
                                System.out.println("Details not found.....");
                            break;
                case 5:
                        System.out.println(database);
                        break;
                case 6:
                        System.out.println("Operations Completed....");
                        break;
                
                default:
                    System.out.println("Invalid Option");
            }

        }while(opt!=6); 
    }
}


