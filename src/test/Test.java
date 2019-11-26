/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Guinand
 */
public class Test {

    private String item;
    private String description;
    private int quantity;

    public Test(String item, String description, int quantity) {
        this.item = item;
        this.description = description;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Test{" + "item=" + item + ", description=" + description + ", quantity=" + quantity + '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Test> groceryItems = new ArrayList<>();
        groceryItems.add(new Test("Apple" , "Red", 5));
         groceryItems.add(new Test("Carrot" , "Orange", 3));
          groceryItems.add(new Test("Detergent" , "Green", 7));
          
        ArrayList secondList = new ArrayList();
        secondList.add(new Test("Cookies" , "Brown", 10));
        secondList.add(new Test("Toothpaste", "Colgate", 2));
        
       groceryItems.addAll(secondList);
       String search = "Apple";
       
       for(int i = 0; i< groceryItems.size(); i++){
           Test t = groceryItems.get(i);
           if(t.getItem().equalsIgnoreCase(search)){
               System.out.println(true);
               groceryItems.remove(i);
           }
           
       }
       
        JOptionPane.showMessageDialog(null,groceryItems.toString());

    }
    
}
