/**
 * Program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
 * a. Extract the words from the text and sort them into alphabetical order.
 * b. Display the sorted list of words.
 */
package com.stackroute.p4;

public class SortWords {

    /*Method to sort the words in a paragraph*/
    public String wordSortMethod(String paragraph) {
        String para = "";
        String[] words=paragraph.split("\\s");
        for(int i=0;i<words.length-1;i++){
            for (int j=i+1;j<words.length;j++){

                //Swapping words based on the comparison
                if(words[i].compareTo(words[j])>0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        //Converting the sorted words to string
        for (String w:words)
            para = para + w + " ";
        return para.trim();
    }
}
