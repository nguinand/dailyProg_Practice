/*
Challenge: the Havel-Hakimi algorithm
Perform the Havel-Hakimi algorithm on a given sequence of answers. This algorithm will return true if the answers are consistent (i.e. it's possible that everyone is telling the truth) and false if the answers are inconsistent (i.e. someone must be lying):
1) Remove all 0's from the sequence (i.e. warmup1).
2) If the sequence is now empty (no elements left), stop and return true.
3) Sort the sequence in descending order (i.e. warmup2).
4) Remove the first answer (which is also the largest answer, or tied for the largest) from the sequence and call it N. The sequence is now 1 shorter than it was after the previous step.
5) If N is greater than the length of this new sequence (i.e. warmup3), stop and return false.
6) Subtract 1 from each of the first N elements of the new sequence (i.e. warmup4).
7) Continue from step 1 using the sequence from the previous step.

Eventually you'll either return true in step 2, or false in step 5.
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Nicolas Guinand
 * Bruh you wrote it all in main like that. Try to make a recursive call next time. Cheers
 * https://www.reddit.com/r/dailyprogrammer/comments/bqy1cf/20190520_challenge_378_easy_the_havelhakimi/?utm_source=BD&utm_medium=Search&utm_name=Bing&utm_content=PSR1
 * https://en.wikipedia.org/wiki/Havel–Hakimi_algorithm
 */
public class HavelHakimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Running Havel Hakimi Algo");
        Integer [] dataSet = {5, 3, 0, 2, 6, 2, 0, 7, 2, 5};
        System.out.println(Arrays.toString(dataSet));
        ArrayList<Integer> dataList = new ArrayList<>(Arrays.asList(dataSet));
        boolean valid = true;
        while(valid){
            System.out.println("New Run");
            removeZeros(dataList);
            if(dataList.size() == 0){
                System.out.println("END PROGRAM list is none");
                System.exit(0);
            }
            sortDesc(dataList);
            System.out.println("SortDesc" +dataList);
        
            int n = dataList.get(0);
            dataList.remove(0);
            System.out.println(n);
            System.out.println(dataList);

            if(n> dataList.size()){
                valid=false;
                System.out.println("END PROGRAM number greater than list size");
                System.exit(0);
            }
            else{
                System.out.println(true);
            }
            subtractOne(dataList);
            System.out.println(dataList);
            System.out.println("End run");
        }
        
    }
    
    public static ArrayList<Integer> removeZeros(ArrayList<Integer> list){
        for(int i=list.size() -1; i>0; i--){
            if(list.get(i) == 0){
                list.remove(i);
            }
        }
        System.out.println("remove zeros" +list);
        return list;
    }
    
    public static void sortDesc(ArrayList<Integer> list){
        Collections.sort(list);
        Collections.reverse(list);
    }
    
    public static void subtractOne(ArrayList<Integer> list){
        for(int i =0; i<list.size(); i++){
            list.set(i, list.get(i) -1);
        }
    }
    
}
