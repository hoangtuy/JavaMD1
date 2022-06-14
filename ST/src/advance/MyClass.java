package advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyClass {
  static final List<String> consonantList =
      Arrays.asList(
          "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w",
          "x", "y", "z");
  static final List<String> vowelList = Arrays.asList("u", "e", "o", "a", "i");

  public static void main(String[] args) {
    /* get input stream from file */
    InputStream inputStream = MyClass.class.getClassLoader().getResourceAsStream("F:\\Eclipse\\ST\\in.txt");
    List<String> wordList = new ArrayList<>();
    /* */
    try (InputStreamReader streamReader =
            new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader)) {

      String line;
      while ((line = reader.readLine()) != null) {
        /* split word of each line using string tokenizer */
        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
          final String word = st.nextToken();
          //          System.out.println(word);
          wordList.add(word.replace(".", "").replace(",", ""));
        }
      }
      /* filter word start with vowel from all */
      List<String> vowelWordList =
          wordList.stream()
              // vowelList đều là lowercase nên mình toLowerCase để xử được cả chữ in hoa
              // đây là lambda function rất hay dùng
              // stream xử lý list rất hiệu quả, đây là tính năng của java 8, nên học
              .filter((String word) -> vowelList.contains(word.substring(0, 1).toLowerCase()))
              .collect(Collectors.toList());
      /* filter word start with consonant from all */
      List<String> consonantWordList =
          wordList.stream()
              .filter((String word) -> consonantList.contains(word.substring(0, 1).toLowerCase()))
              .collect(Collectors.toList());
      /*=======================================================*/
      /* Java SE */
      Map<String, Long> frequencyByWord = new HashMap<>();
      wordList.forEach(
          word -> {
            if (frequencyByWord.containsKey(word)) {
              frequencyByWord.put(word, frequencyByWord.get(word) + 1);
            } else {
              frequencyByWord.put(word, 1L);
            }
          });
      /* Java 8 */
      Map<String, Long> otherFrequencyByWord =
          wordList.stream()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      /*=======================================================*/
      /*Java SE*/
      String maxFrequencyWord = null;
      Long maxFrequency = 0L;
      for (Map.Entry<String, Long> entry : otherFrequencyByWord.entrySet()) {
        if (entry.getValue() > maxFrequency) {
          maxFrequencyWord = entry.getKey();
          maxFrequency = entry.getValue();
        }
      }

      /*Java 8*/
      Map.Entry<String, Long> maxFrequencyWordEntry =
          frequencyByWord.entrySet().stream()
              .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
              .get();

      System.out.printf("Number of word: %d%n", wordList.size());
      System.out.printf("Number of word start with vowel: %d%n", vowelWordList.size());
      System.out.printf("Number of word start with consonant: %d%n", consonantWordList.size());
      System.out.printf(
          "Java SE::Largest frequency word is: %s and frequency is: %d%n",
          maxFrequencyWord, maxFrequency);
      System.out.printf(
          "Java 8::Largest frequency word is: %s and frequency is: %d%n",
          maxFrequencyWordEntry.getKey(), maxFrequencyWordEntry.getValue());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}