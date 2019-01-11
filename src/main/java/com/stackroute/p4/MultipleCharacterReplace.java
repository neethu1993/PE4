/**
 * Program to replace all d with f and all l with t in the given String
 */
package com.stackroute.p4;

public class MultipleCharacterReplace {

    /*Method to replace the characters*/
    public String multipleCharacterReplaceMethod(String string) {
        String string1 = string.replace('d','f');
        return string1.replace('l','t');
    }

}
