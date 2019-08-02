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
        System.out.println("Running test files in src/Test ...");

        System.out.println("====== Small Dictionary in src/Dictionary/tinyDictionary.txt ======");
        small = new Anagram("Dictionary/tinyDictionary.txt");
        small.getAnagrams("Test/Test1.txt");

        System.out.println("====== Large Dictionary in src/Dictionary/Dictionary.txt ======");
        large = new Anagram("Dictionary/Dictionary.txt");
        large.getAnagrams("Test/Test1.txt");
        large.getSingleWordAnagrams("poll");

        if (args.length != 0) {
            for (String arg : args) {
                System.out.println("====== Finding anagrams of \"" + arg + "\" in src/Dictionary/Dictionary.txt ======");
                large.getSingleWordAnagrams(arg);
            }
        }
    }
}
