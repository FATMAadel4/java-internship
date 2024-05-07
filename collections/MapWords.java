import java.util.*;

public class  MapWords{
    private Map<Character, ArrayList<String>> wordsMap;

    public  MapWords() {
        wordsMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            wordsMap.put(c, new ArrayList<>());
        }
    }

    public void addWord(String word) {
        if (!word.isEmpty()) {
            char firstChar = Character.toLowerCase(word.charAt(0));//key
            if (firstChar >= 'a' && firstChar <= 'z') {
                 ArrayList<String> wordsList=  wordsMap.get(firstChar);//value
                wordsList.add(word);
                Collections.sort(wordsList);
            }
        }
    }

    public void printLettersAndWords() {
        for (char c = 'a'; c <= 'z'; c++) {
            List<String> wordsList = wordsMap.get(c);

            if (!wordsList.isEmpty()) {
                 System.out.println( c +", "+ wordsList);

            }
        }
    }

    public void printWordsOfLetter(char letter) {
        letter = Character.toLowerCase(letter);
        List<String> wordsList = wordsMap.get(letter);
        if (!wordsList.isEmpty()) {
            System.out.println(  wordsList);
        }
        else{
            System.out.println("not found");
        }
    }

    public static void main(String[] object) {
        MapWords  object1 = new  MapWords();
         object1.addWord("apple");
        object1.addWord("banana");
        object1.addWord("cat");
        object1.addWord("dog");
        object1.addWord("elephant");
        object1.addWord("bread");
        object1.addWord("car");
        object1.addWord("coffee");


        System.out.println("All letters and corresponding words:");
        object1.printLettersAndWords();

        System.out.println("Words of letter 'a':");
        object1.printWordsOfLetter('a');

        System.out.println("Words of letter 'b':");
        object1.printWordsOfLetter('b');

        System.out.println("Words of letter 'z':");
        object1.printWordsOfLetter('z');
    }
}
