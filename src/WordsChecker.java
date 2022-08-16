import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] values = text.split("\\P{IsAlphabetic}+");
        Set<String> words = new HashSet<>(Arrays.asList(values));
        if (words.contains(word)) {
            return true;
        } else {
            return false;
        }

    }
}
