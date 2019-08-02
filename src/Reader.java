import java.io.*;
import java.util.HashSet;

/**
 * Read files (dictionary, test file) and return a hash set with all non-duplicated words.
 *
 * @author Yueyang Zhou
 * Time: 2019/08/01 20:37
 * Created with IntelliJ IDEA
 */

public class Reader {
    private InputStreamReader reader;

    public Reader(String path) {
        try {
            reader = new InputStreamReader(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            System.out.println("Can not find file in " + path + "!");
        }
    }

    public HashSet<String> readFile() {
        return read();
    }

    private HashSet<String> read() {

        HashSet<String> s = new HashSet<>();
        BufferedReader newBufferRead = new BufferedReader(reader);      // read data and save to buffer

        /* Add every word in dictionary*/
        while (true) {
            String nextLine;
            try {
                nextLine = newBufferRead.readLine();
            } catch (IOException e) {
                break;
            }
            if (nextLine == null) {     // EOF
                break;
            } else if (!nextLine.equals("") && !nextLine.contains(" ")) {
                s.add(nextLine);        // add words to output set
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Reader("src/Dictionary/tinyDictionary.txt").readFile());
    }
}
