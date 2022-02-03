package lessons;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.ArrayList;

import java.util.TreeMap;

public class Collections { // создали класс коллекция
    public static void main(String[] args) throws IOException { // обозначили исключения

        FileInputStream stream = new FileInputStream("C:/Users/Timur/IdeaProjects/BoostBrain/src/lessons/schools.csv");
        { // объявили и присвоили значение объекту стрим, в который внесли данные из файла
            int length = stream.available(); // задали переменную длинна размером в объем стрима
            byte[] data; //объявили массив "дата"
            data = new byte[length]; // присвоили массиву данные из length
            stream.read(data); // прочитали массив "data"

            String text = new String(data); // создали переменную text и перевели в text значения из "data
            //System.out.println(text); // вывели на экран "text

            String[] lines = text.split("\n"); // объявили и создали массив сток "lines" из переменной "text" в котором осуществили \n - перенос строки

            ArrayList<String[]> lineWords = new ArrayList<>(); // объявили список строк "lineWords"

            for (String line : lines) {  // цикл для переменной line (типа стринг) в массиве lines

                // System.out.println(line);
                // System.out.println("________________________________________________");

                 String[] words = line.split(","); // объявили и создали массив сток "words" из переменной "line" в котором осуществили разделение ",
                    lineWords.add(words); // в список lineWords добавили массив "words
            }

            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            for (String[] word : lineWords) {
                if (map.containsKey(word[3])) {
                    Integer k = map.get(word[3]);
                    k = k + 1;
                    map.put(word[3], k);
                } else {
                    map.put(word[3],1);
                }
               System.out.println("слов Москва  " + map.get("Уфа"));

                /*for (String key : map.keySet()) {
                    System.out.println("Director: " + key + "    Ещё что-то: " + map.get(key));

                }

                for (String[] words : lineWords) {
                    if (words[0].equals("Адрес")) {

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



