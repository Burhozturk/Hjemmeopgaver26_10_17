/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave12_2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author burhan
 */
public class Opgave12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        boolean continueInput=true;
        
        do
        {
            try
            {
                System.out.println("Indtast et integer");
                int number=input.nextInt();
                System.out.println("Indtast næste integer");
                int number2=input2.nextInt();
                int sum=number+number2;
                System.out.println("Sum er " +sum);
                continueInput=false
                
            
            
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Try again. Incorrect input");
                input.nextLine();
                input2.nextLine();
            }
            while(continueInput);
        }
    }
        
}