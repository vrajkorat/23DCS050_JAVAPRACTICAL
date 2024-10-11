import java.util.*;

class Member{
    String name = new String();
    String addr = new String();
    String  phone_no = new String();
    int age ;
    Double salary;

    Scanner sc = new Scanner(System.in);
    void setdata(){
        System.out.print("Name     : ");
        name = sc.nextLine();
        System.out.print("Age      : ");
        age = sc.nextInt();
        System.out.print("Phone No : ");
        sc.nextLine();    
        phone_no = sc.nextLine();
        System.out.print("Salary   : ");
        salary = sc.nextDouble();
        System.out.print("Address  : ");
        sc.nextLine(); 
        addr = sc.nextLine();
        
    }
    void getdata()
    
    {
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Phone No : " + phone_no);
        System.out.println("Address  : " + addr);
        System.out.println("Salary   : " + salary);
    }
}

public class p18{

    public static void main(String[] args) {
        Member m1 = new Member();       
        m1.setdata();
        m1.getdata();
    }
}