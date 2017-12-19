public class StringUtils {

    private String word;
    private String searched;

    public static boolean included(String word, String searched){
        if(word.contains(searched.trim())){
            return true;
        } else if(word.toUpperCase().contains(searched.trim())){
            return true;
        } else if (word.toUpperCase().contains(searched.trim().toUpperCase())){
            return true;
        }
        return false;
    }
}
