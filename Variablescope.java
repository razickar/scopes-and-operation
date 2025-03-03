public class Variablescope {
    public static void main(String[] args) {
        int outsideVar = 10;
        if (outsideVar > 5) {
            int insideVar = 20; 
            System.out.println("Inside if block:");
            System.out.println("outsideVar = " + outsideVar);
            System.out.println("insideVar = " + insideVar);   
        }

       
        // System.out.println("insideVar = " + insideVar); 
    }
}
