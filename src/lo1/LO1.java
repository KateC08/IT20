/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lo1;

/**
 *
 * @author HP
 */
public class LO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Array 
        String[] names = {"Katelyn", "Katel", "keyt"};
        
        //Output to print the values of the Array
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        
        System.out.println("~~~~~~~");
        
        //Process to print all the values in the array using for Loops
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
    }
    
}
