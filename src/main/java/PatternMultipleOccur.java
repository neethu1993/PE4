import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMultipleOccur {

    public List<String> patternmultipleOccurMethod(String string) {
        Pattern pattern = Pattern.compile("se");
        Matcher match =pattern.matcher(string);
        List<String> stringList = new ArrayList<>();
        while (match.find())
        {
            stringList.add("Found at: " + match.start() + " - " + match.end());
        }
        //System.out.println(match.);
        if(stringList.isEmpty()) {
            return null;
        }
        else {
            return stringList;
        }

    }
}
