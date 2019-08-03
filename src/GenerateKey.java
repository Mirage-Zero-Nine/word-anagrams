import java.util.Arrays;

/**
 * Generate key of each word based on char appearance in each word.
 * The key is the combination of each char appearance count.
 *
 * @author Yueyang Zhou
 * Time: 2019/08/02 09:40
 * Created with IntelliJ IDEA
 */

class GenerateKey {
    private static final int numOfAlpha = 26;

    /**
     * Generate key that to be put in map.
     *
     * @param word word in dictionary
     * @return pair key
     */
    public static String generateKey(String word) {

        StringBuilder result = new StringBuilder();     // key
        int[] lower = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};       // count occurrence

        for (int i = 0; i < word.length(); i++) {
            int letter = word.charAt(i);

            if (letter <= 'z' && letter >= 'a') {
                lower[letter - 'a'] += 1;       // count char appearance
            }

            if (letter <= 'Z' && letter >= 'A') {
                lower[letter - 'A'] += 1;
            }
        }

        /* Convert letters and appearance into string */
        for (int i = 0; i < numOfAlpha; i++) {
            if (lower[i] != 0) {
                result.append(Character.toChars(i + 'a'));      // char
                result.append(lower[i]);                // count of appearance
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(GenerateKey.generateKey("yueyang"));
    }
}
