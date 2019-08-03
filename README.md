# Word Anagram

## Function
1. Find all the possible English words from the dictionary that could be composed of input characters (casee-insenesitive & same length). i.e., `dog` has these anagrams: God, dog, god.
2. Run with test cases. You can custom the test case by modify test file in `src/Test` or directly input test case in terminal after running it.
3. Dictionary file is in `src/Dictionary` folder, see https://raw.githubusercontent.com/lad/words/master/words for original file.
4. Words in dictionary is case-sensitive, such as "Sue" and "sue", they are two words in dictionary and are treated as two words in  anagram. The input char set, however, is treated as case-insensitive. For instance, input "Dog" and "dog" are treated as same input.

## How to run
1. Clone `https://github.com/yyzhou95/word-anagrams.git` to local machine.
2. Open a Terminal Window under code folder, and run `chmod u+x runme.sh` to make it executable.
3. Run `./runme.sh` to run the test cases.
4. If you want to try customized test case, modify the test file in `src/Test/test1.txt` or directly input in Terminal when promot comes up are both OK.
5. If you want to modify dictionary, you can modify the dictionary file itseelf, or replace dictionary file in `src/Dictionary` with same name, or edit file path in `src/Entry.java`.
