/**
 * Entry point.
 *
 * @author Yueyang Zhou
 * Time: 2019/08/01 20:06
 * Created with IntelliJ IDEA
 */

public class Entry {
    /**
     * Main function.
     *
     * @param args given arguments
     */
    public static void main(String[] args) {
        Anagram small;      // small dictionary
        Anagram large;      // large dictionary

        System.out.println("====== Small Dict ======");
        small = new Anagram("src/Dictionary/tinyDictionary.txt");
        small.getAnagrams("src/Test/Test1.txt");

        System.out.println("====== Large Dict ======");
        large = new Anagram("src/Dictionary/Dictionary.txt");
        large.getAnagrams("src/Test/Test1.txt");
        large.getSingleWordAnagrams("poll");
    }
}
