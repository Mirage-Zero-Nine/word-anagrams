import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Yueyang Zhou
 * Time: 2019/08/01 20:48
 * Created with IntelliJ IDEA
 */

public class DictionaryMap {
    private HashSet<String> set;      // all unique words in dictionary

    public DictionaryMap(String dictionaryPath) {
        set = new Reader(dictionaryPath).readFile();
    }

    public HashMap<String, ArrayList<String>> getMap() {
        return generateMap();
    }

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
