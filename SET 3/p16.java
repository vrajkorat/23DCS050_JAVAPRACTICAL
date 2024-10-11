import java.util.*; 
 
class Complex{ 
    Scanner s = new Scanner(System.in);     
    int real;     
    int img; 
 
    void get_data(){ 
        System.out.print("Enter Real and Imagenary Part : ");         
        real = s.nextInt();         
        img = s.nextInt(); 
    } 
 
    void add(Complex o){         
        int sumr = real + o.real;         
        int sumi = img + o.img;         
        if(sumi>=0) 
        System.out.println("Sum : " + sumr + "+" + sumi + "i");         
        else 
        System.out.println("Sum : " + sumr + sumi + "i"); 
    } 
 
    void sub(Complex o){ 
        int subr = real - o.real; 
        int subi = img - o.img;         
        if(subi>=0) 
        System.out.println("Difference : " + subr + "+" + subi + "i");         
        else 
        System.out.println("Difference : " + subr + subi + "i"); 
    } 
 
    void pro(Complex o){         
        int pror = real*o.real - img*o.img;         
        int proi = real*o.img - img*o.real;         
        if(proi>=0) 
        System.out.println("Product : " + pror + "+" + proi + "i");         
        else 
        System.out.println("Product : " + pror + proi + "i"); 
    } 
} 
 
public class p16 { 
    public static void main(String arg[]){         
        Complex c1 = new Complex();         
        c1.get_data(); 
        Complex c2 = new Complex();         
        c2.get_data();         
        c1.add(c2);         
        c1.sub(c2);         
        c1.pro(c2); 
    } 
} 
