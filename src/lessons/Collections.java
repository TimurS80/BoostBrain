package lessons;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class Collections {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream("c:/BoostBrain1/src/lessons/NOTICE.csv");
        {
            int length = stream.available();
            byte[] data;
            data = new byte[length];
            stream.read(data);
            String text = new String(data);
            //System.out.println(text);

            ArrayList<String[]> lineWords = new ArrayList<>();
            String[] lines = text.split("\n");
            for (String line : lines) {  // тип переменной в массиве это стринг

                // System.out.println(line);
                // System.out.println("________________________________________________");
                String[] words = line.split(",");
                lineWords.add(words);
            }

            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            for (String[] words : lineWords) {
                if (map.containsKey(words[0])) {
                    Integer k = map.get(words[0]);
                    k = k + 1;
                    map.put(words[0], k);
                } else {
                    map.put(words[0], 1);
                }
                System.out.println(map.get("Qt Gui"));

                for (String key : map.keySet()) {
                    System.out.println("1: " + key + "  2 : " + map.get(key));

                }

             /*   for (String[] words : lineWords) {
                    if (words[0].equals("Qt Gui")) {

                        for (String word : words) {
                            System.out.println(word);
                            System.out.println("####");
                        }
                        System.out.println("_________________");
                    }

                } */
            }

        }
    }
}


