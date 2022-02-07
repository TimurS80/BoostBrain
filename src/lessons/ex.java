package lessons;

public class ex {
        public static void main(String[] args) {
            String str = "I love Java";
            String[] words = str.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }

