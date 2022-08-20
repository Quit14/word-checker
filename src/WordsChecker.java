import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> words;

    public WordsChecker(String text) {
        String[] values = text.split("\\P{IsAlphabetic}+");
        this.words = new HashSet<>(Arrays.asList(values));
    }

    public boolean hasWord(String word) {
        return words.contains(word);

    }


}

