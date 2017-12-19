public class Change {

    private final char fromCharacter;
    private final char toCharacter;
    //private String characterString;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        //String newCharacterString = characterString.replace(this.fromCharacter,this.toCharacter);
        return characterString.replace(fromCharacter,toCharacter);
    }
}
