import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    String[] arab = {"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = sc.nextLine(); //сканируем строку
        String[] words = str.split(" ");

        int length = words.length;
        if (length != 3) {
            System.out.print("throws Exception");










            //считывать файл до пробела с помощью sc.next() :
            //Int a= Integer.valueOf(sc.next()) ;
            //так же остальные символы

      //  for (int i = 0; i < words.length; i++) {
         //   int[] numArr = new int[0];
           // numArr[i] = Integer.parseInt(words[i]);
            //int num1 = Integer.parseInt(words[0]), num2 = Integer.parseInt(words[2]);
            //System.out.println((num1 ) + (num2));

        }
    }

    class Prov1 {
        public static boolean isDigit(String words) throws NumberFormatException {
            try {
                parseInt(words);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
}




//        while(!sc.hasNext())
//
//

//








//        int numArr[] = new int[3];
//        for (int i = 0; i < words.length; i++) {
//            numArr[i] = Integer.parseInt(words[i]);
//
//            int num1 = Integer.parseInt(words[0]), num2 = Integer.parseInt(words[2]);
//            System.out.println((num1 ) + (num2));

            // System.out.println(numArr[i]);
