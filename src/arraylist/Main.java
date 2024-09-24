/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        //Creating object of the class to access all the methods on the Item Manager
        ItemManager list = new ItemManager();
        
        //Inializing variables 
        String item, newItem, finditem;
        int index;
        
        //Displays the list
        list.displayItems();
    
        //To read and store the input in the variable named item
        System.out.println("Enter an item you want to add: ");
        item = sc.nextLine();
        //Displays the new Item
        list.addItems(item);
        System.out.println("~~~~~~~~");
        

       
    }
}
