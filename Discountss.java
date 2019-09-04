package Discountss;
import java.util.*;

public class Discountss {
    public static void main (String[]args)
    {
        int quant;
        int price;
          double discount,netpay, grosspay,GTotal;
          Scanner Input = new Scanner(System.in);
        System.out.println("Enter the quantity of your purchase");
         quant = Input.nextInt ();
         System.out.println ("Enter the value for price");
         price = Input.nextInt ();
         if (quant <= 5)
         {  
        grosspay = price * quant;
            System.out.println ("The grosspay is" + grosspay);
            discount = 0.03;
          //  
           
            netpay = (grosspay - GTotal); 
            System.out.println ("The netpay is" + netpay);
             GTotal = (grosspay * discount);
             System.out.println ("The dicount of bag of rice for " +  quant + " is 3%");
         }
         else if (quant <= 10)
         {  
        grosspay = price * quant;
            System.out.println ("The grosspay is" + grosspay);
            discount = 0.05;
            System.out.println ("The dicount of bag of rice for " +  quant + " is 7%");
            GTotal = (grosspay * discount);
            netpay = (grosspay - GTotal); 
            System.out.println ("The netpay is" + netpay);
         }
         else if (quant <= 20)
         {  
        grosspay = price * quant;
            System.out.println ("The grosspay is" + grosspay);
            discount = 0.07;
            System.out.println ("The dicount of bag of rice for " +  quant + " is 3%");
            GTotal = (grosspay * discount);
            netpay = (grosspay - GTotal); 
            System.out.println ("The netpay is" + netpay);
         }
        else
         {  
        grosspay = price * quant;
            System.out.println ("The grosspay is" + grosspay);
            discount = 0.10;
            System.out.println ("The dicount of bag of rice for " +  quant + " is 3%");
            GTotal = (grosspay * discount);
            netpay = (grosspay - GTotal); 
            System.out.println ("The netpay is" + netpay);
         }
    }    
}
