public class StringTranspose {

    public String stringTransposeMethod (String string) {
        String[] words = string.split("\\s");
        String output = "";
        for (int i=0;i<words.length;i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            output = output + sb.toString() + " ";
        }
        return output.trim();
    }
}
