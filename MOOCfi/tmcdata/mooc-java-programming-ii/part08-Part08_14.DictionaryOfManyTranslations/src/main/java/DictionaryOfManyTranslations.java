
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations () {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            ArrayList<String> transaltions = new ArrayList<>();
            transaltions.add(translation);
            this.dictionary.put(word, transaltions);
        }

    }

    public ArrayList<String> translate(String word){
        return this.dictionary.getOrDefault(word, new ArrayList<String>());
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }


}
