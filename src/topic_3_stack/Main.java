/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_3_stack;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       Stack stack = new Stack(5);

       System.out.println("Hello there!");
       
       while(true) {
           System.out.println("Choose what you want to do: "
                    + " 1. Size"
                    + " 2. Push"
                    + " 3. Pop"
                   +  " 4. Exit");
            int choice = sc.nextInt();
        switch(choice) {
            case 1:
                      System.out.println("Stack size is: " + stack.size());
                      System.out.println("~~~~~~~~~~~~~~~~~~");
                      break;

        }    
       }
   }       
}
