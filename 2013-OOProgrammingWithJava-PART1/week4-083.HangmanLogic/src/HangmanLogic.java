
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private String hiddenWord = "";

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if(!guessedLetters.contains(letter)){
            if(!word.contains(letter)){
                this.numberOfFaults++;
                this.guessedLetters += letter;
            } else {
                this.guessedLetters += letter;
            }
        }
        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        int y = 0;

        while(y<this.word.length()){
            char c = this.word.charAt(y);
            String cString = "" + c;
            if(this.guessedLetters.contains(cString)){
                this.hiddenWord += this.word.charAt(y);
            } else {
                this.hiddenWord += "_";
            }
            y++;
        }

        return this.hiddenWord;
    }
}
