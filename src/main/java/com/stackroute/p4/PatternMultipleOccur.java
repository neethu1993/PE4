/**
 * Program to find out the multiple occurrences of the given word in a ​ string​ using Matcher
 * methods.
 */
package com.stackroute.p4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMultipleOccur {

    /*Method find the location of pattern*/
    public List<String> patternMultipleOccurMethod(String string) {
        Pattern pattern = Pattern.compile("se");
        Matcher match =pattern.matcher(string);
        List<String> outputList = new ArrayList<>();

        //Finds the pattern locations in the string
        while (match.find())
        {
            outputList.add("Found at: " + match.start() + " - " + match.end());
        }

        //Checks whether the output is empty or not
        if(outputList.isEmpty()) {
            return null;
        }
        else {
            return outputList;
        }

    }
}
