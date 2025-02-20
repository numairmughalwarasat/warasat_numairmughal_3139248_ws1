package griffith;

public class Words {

    private char[] letters;

    public Words(char[] letters) {
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
        return letters.length;
    }

    // Method to return the letters of the word
    public char[] getLetters() {
        return letters;
    }
}

