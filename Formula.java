import java.util.*;

public class Formula{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);


     System.out.print("ENTER NUMBER A");
        int a = sc.nextInt();
        System.out.print("ENTER NUMBER B");
        int b = sc.nextInt();
        System.out.print("ENTER NUMBER C");
        int c = sc.nextInt();


    
    double root = Math.sqrt( (b*b) - 4*a*c );
System.out.println(root);
        if(0 < root){
        
            System.out.println("postive  : " +((-b)+root)/(2*a) );
            System.out.println("negative : " +((-b)-root)/(2*a) );
        
        }
        if(0 == root){
        
            System.out.println("real  : " +((-b)+root)/(2*a) );
        
        }
        if(0 > root){
        
            System.out.println("real and img part  : " +((-b)/(2*a))+"+"+root+"i");
            
        
        }



    }
}
