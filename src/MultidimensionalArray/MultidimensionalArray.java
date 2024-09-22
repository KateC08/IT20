/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultidimensionalArray;

/**
 *
 * @author HP
 */
public class MultidimensionalArray {
     public static void main(String[] args) {
         
         //
         String[][] programAndyear ={
             {"BSIT", "First year"},
             {"BSBA", "Second year"},   
             {"BSED", "Third year"}
         };
         for(int i = 0; i < programAndyear.length; i++) {
             for(int j = 0; j < programAndyear[i].length; j++ ) {
                 System.out.print(programAndyear[i][j] + " ");
             }
             System.out.println();
         }
     }
}
