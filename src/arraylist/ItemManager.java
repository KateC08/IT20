/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ItemManager {
    
    private ArrayList<String> items;
    
    //Constructor to initialize the ArrayList
    public ItemManager() {
        items = new ArrayList<>();
    }
    //To display all the items in list
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
    //To add new items
    public void addItems(String item) {
        items.add(item);
        System.out.println("You Inserted: " + items);
    }
    
   
        
}
