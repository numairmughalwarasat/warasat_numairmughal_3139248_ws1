package griffith;

public class Words {

    private char[] letters;

    // Constructor to initialize the letters attribute
    public Words(char[] letters) {
        if (letters == null) {
            throw new IllegalArgumentException("letters cannot be null");
        }
        this.letters = letters;
    }

    // Method to check if the word contains the given symbol
    public boolean contains(char symbol) {
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }

    // Method to return the length of the word
    public int length() {
        return letters.length; // Return the length of the array
    }

    // Method to return the letters of the word
    public char[] getLetters() {
        return letters; // Return the letters array
    }
}


