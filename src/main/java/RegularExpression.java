import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public Boolean regularExpressionMethod(String string) {
        Pattern pattern = Pattern.compile("Harry");
        Matcher match =pattern.matcher(string);
        if (match.find()){
            return true;
        }
        else {
            return false;
        }
    }
}
