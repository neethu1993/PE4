public class CountCharacterString {

    public int countCharacterMethod(String string, String character){
        return string.length()-string.replace(character,"").length();
    }

}
