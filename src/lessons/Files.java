package lessons;

import java.io.*;

public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dir = new File("."); //создали новый объект
        String [] names = dir.list(); // создали массив строк
        for (int i = 0; i < names.length; i++){
        System.out.println(names[i]);//вывели на экран все элементы массива
        }
        File file = new File("example.txt");//создали новый объект
               System.out.println(file.length()); // вывели длину файла Boost*

        FileInputStream input = new FileInputStream(file);//создали новый объект
        int length = input.available();
        System.out.println(length);
        byte [] data = new byte [length];//создали массив длинной length
        input.read(data);
       /* for (int i = 0; i < data.length; i++){ // создали цикл по массиву
        System.out.println(data[i]);
       } */
        String text = new String(data);
        /* System.out.println(text); */

        FileOutputStream output = new FileOutputStream(file, true);
        String newText = "Владивосток лучший город земли!";
        byte [] newTextBytes = newText.getBytes(); // конструкция которая превращает текст в массив байт
        output.write(newTextBytes);
        System.out.println(text);
        output.close();
  }
}