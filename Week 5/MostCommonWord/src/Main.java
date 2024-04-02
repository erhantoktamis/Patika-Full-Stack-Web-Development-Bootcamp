import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String commonWord = null;

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");
        String text = scan.nextLine();

        String[] words = text.split("\\s+");
        System.out.println(Arrays.toString(words));


        HashMap<String, Integer> counterMap = new HashMap<>();

        for (String word : words){
            counterMap.put(word,counterMap.getOrDefault(word,0)+1);
        }

        System.out.println(counterMap);

        for(Map.Entry<String, Integer> entry : counterMap.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
                commonWord = entry.getKey();
            }
        }

        if(commonWord != null){
            System.out.println("Most frequent word: " + commonWord + " ," + " Count: " + count);
        }else{
            System.out.println("No words found!");
        }
    }
}