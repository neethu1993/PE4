import java.util.Arrays;

public class SortWords {
    public String wordSortMethod(String paragraph) {
        String[] words=paragraph.split("\\s");
        for(int i=0;i<words.length-1;i++){
            for (int j=i+1;j<words.length;j++){
                if(words[i].compareTo(words[j])>0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        String para = "";
        for (String w:words)
            para = para + w + " ";
        //System.out.println(para);
        return para.trim();
    }
}
