/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_4_queue;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {
   

	public static void main(String[] args) {
		
            
             Scanner sc = new Scanner(System.in);
             Queue customerQueue = new Queue();

             while(true) {
                 System.out.println("Hello there, hehe!");
                 
                 System.out.println("Choose what you want:"
                         + " 1. Display Queue."
                         + " 2. Add Customer. "
                         + " 3. Serve Customer."
                         + " 4. Exit");
                 int choices = sc.nextInt();
                 switch(choices) {
                     case 1:
                           System.out.println();
                           customerQueue.displayQueue();
                           break;
                     case 2:
                           //To accepts another string input
                           sc.nextLine();
                           System.out.println("Enter new customer: ");
                           String name = sc.nextLine();
                           customerQueue.enqueue(new Customer(name));
                           break;
                 }
             }
	}

}