package lessons;


import java.io.*;
import java.util.ArrayList;



public class Collections2 { // создали класс коллекция
    public static void main(String[] args) throws IOException { // обозначили исключения

        FileInputStream stream = new FileInputStream("C:/Users/Timur/IdeaProjects/BoostBrain/src/lessons/coord_1.csv");
        { // объявили и присвоили значение объекту стрим, в который внесли данные из файла
            int length = stream.available(); // задали переменную длинна размером в объем стрима
            byte[] data; //объявили массив "дата"
            data = new byte[length]; // присвоили массиву данные из length
            stream.read(data); // прочитали массив "data"

            String text = new String(data); // создали переменную text и перевели в text значения из "data

            //System.out.println(text); // вывели на экран "text

            ArrayList<String[]> lineWords = new ArrayList<>(); // объявили список строк "lineWords"

            String[] lines = text.split("\n"); // объявили и создали массив сток "lines" из переменной "text" в котором осуществили \n - перенос строки

            for (String line : lines) {  // цикл для переменной line (типа стринг) в массиве lines

                  String [] words = line.split(","); // строку побили на отдельные слова
                    lineWords.add(words); // сохраняем массив отдельных слов "words в наш список lineWords
            //    System.out.println(line);
            }
            for (String[] words : lineWords) {

                for (String word : words) {
                    System.out.println(word);
                    System.out.print("|");

                }
               System.out.println("________________________________________________"); // пока понятно
             }
            }
        }
    }





