/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggernumber;

/**
 *
 * @author Montana
 */
import java.util.Scanner;
public class BiggerNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number =Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int biggest;
        if(number > number2)
        {
            biggest = number;
        }
        else
        {
            biggest = number2;
        }
        System.out.println("Largest of Two Numbers is " + biggest);
        
      // to be continued
    }
    
}
