import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LengthExeption {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = sc.nextLine(); //сканируем строку
        String[] words = str.split(" ");   //делим по пробелу

        int length = words.length;
        if (length != 3) {
            throw new LengthExeption("Формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }     //выбрасываем созданное в методе LengthExeption исключение и передаем ему в аргументы описание
    }
}













            //String[] arab = {"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
           // String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
            //считывать файл до пробела с помощью sc.next() :
            //Int a= Integer.valueOf(sc.next()) ;
            //так же остальные символы

      //  for (int i = 0; i < words.length; i++) {
         //   int[] numArr = new int[0];
           // numArr[i] = Integer.parseInt(words[i]);
            //int num1 = Integer.parseInt(words[0]), num2 = Integer.parseInt(words[2]);
            //System.out.println((num1 ) + (num2));
//
//
//
//
//
//atic boolean isDigit(String words) throws NumberFormatException {
//
//arseInt(words);
//eturn true;
//ch (NumberFormatException e) {
//eturn false;
//
//
//
//
//


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
