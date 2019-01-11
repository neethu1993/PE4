/**
 * Program to count the total number of occurrences of a given character in a ​ string
 * without using any loop.
 */
package com.stackroute.p4;

public class CountCharacterString {

    /*Method counts the number of occurance of a given character*/
    public int countCharacterMethod(String string, String character){
        return string.length()-string.replace(character,"").length();
    }

}
