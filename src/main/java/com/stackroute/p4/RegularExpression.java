/**
 * Program with the implementation of ​ Regular Expression​ to find the presence of the name
 * Harry in a ​ string​ .
 */
package com.stackroute.p4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    /*Method to check the pattern present or not*/
    public Boolean regularExpressionMethod(String string) {
        Pattern pattern = Pattern.compile("Harry"); //gives pattern as Harry
        Matcher match =pattern.matcher(string);
        if (match.find()){
            return true;
        }
        else {
            return false;
        }
    }
}
