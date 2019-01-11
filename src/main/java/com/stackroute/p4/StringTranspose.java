/**
 * Program to transpose the given string​ .
 */
package com.stackroute.p4;

public class StringTranspose {

    /*Method to transpose each words in a string*/
    public String stringTransposeMethod (String string) {
        String[] words = string.split("\\s");
        String output = "";

        //Reversing the words
        for (int i=0;i<words.length;i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            output = output + sb.toString() + " ";
        }
        return output.trim();
    }
}
