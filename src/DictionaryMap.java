import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Generate a hash map that use char appearance in words as key, and a list contains anagrams as value.
 * Two words are anagram iff one can be composed by moving char position in the other word.
 * Therefore, char appearance can be used as key.
 *
 * @author Yueyang Zhou
 * Time: 2019/08/01 20:48
 * Created with IntelliJ IDEA
 */

public class DictionaryMap {
    private HashSet<String> set;      // all unique words in dictionary

    /**
     * Initialization of class and obtain all words in dictionary.
     *
     * @param dictionaryPath given dictionary path
     */
    public DictionaryMap(String dictionaryPath) {
        set = new Reader(dictionaryPath).readFile();
    }

    /**
     * Obtain a hash map that contains all anagrams under char appearance count.
     *
     * @return map contains all anagrams in dictionary.
     */
    public HashMap<String, ArrayList<String>> getMap() {
        return generateMap();
    }

    /**
     * Generate a hash map that contains all anagrams under char appearance count.
     *
     * @return map contains all anagrams in dictionary.
     */
    private HashMap<String, ArrayList<String>> generateMap() {
        HashMap<String, ArrayList<String>> dictMap = new HashMap<>();

        for (String word : this.set) {
            String key = GenerateKey.generateKey(word);
            if (dictMap.containsKey(key)) {
                dictMap.get(key).add(word);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(word);
                dictMap.put(key, temp);
            }
        }

        return dictMap;
    }

    /**
     * Unit test.
     *
     * @param args given argument
     */
    public static void main(String[] args) {
        System.out.println(new DictionaryMap("src/Dictionary/tinyDictionary.txt").getMap());
    }
}
