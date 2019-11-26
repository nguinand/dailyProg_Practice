/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Nicolas Guinand
 */
public class testStringToFloatNMG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float defaultValue = (0.0f);
         Float result = (0.0f);
         System.out.println(result == defaultValue);
         System.out.println(defaultValue);
         
        
    }
    
    public void receive(int portIndex, Object input) {
        if (input instanceof String) {
            String in = (String) input;
            Float result = (0.0f);
            try {
                
                result = Float.valueOf(in);
            } catch (Exception ex) {
                // Currently we eat the exception and return (0)
            }
            
        } 
        else {
            //Log.d(TAG, "Input not String");
            return;
        }
    }
}
