import java.util.Scanner;

public class Bitwise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt();

        System.out.println("a & b  = " + (a & b));  

        System.out.println("a | b  = " + (a | b));  

        System.out.println("a ^ b  = " + (a ^ b)); 

       

   
        System.out.println("a << b = " + (a << b)); 
        System.out.println("b << a = " + (b << a)); 

     
        System.out.println("a >> b = " + (a >> b)); 
        System.out.println("b >> a = " + (b >> a)); 

      
       

        scanner.close();
    }
}
