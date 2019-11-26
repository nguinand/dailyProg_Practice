package test;

import javax.swing.JOptionPane;

public class CommonProblems{

    public CommonProblems(){}

    public void runPalindrome(String word){
        StringBuffer x = new StringBuffer(word);
        System.out.println(x);
    }
    public static void main(String args[]){
        //Instantiate the problems here
        System.out.println("Running");
        CommonProblems chemicalX = new CommonProblems();
        chemicalX.runPalindrome(JOptionPane.showInputDialog(null, "Enter a word"));
    }
}