

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

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


        int num1 = Integer.parseInt(words[0]), num2 = Integer.parseInt(words[2]);

           if (words[0].matches("^[+\\-/*]$")){
        switch (words[0]) {
            case ("+"):
                Object result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("/"):
                result = num1 / num2;
                break;
                default:throw  new IllegalArgumentException("Не верный знак операции");
        }
        }
    }
}


        











            //String[] arab = {"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
           // String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
            //считывать файл до пробела с помощью sc.next() :
            //Int a= Integer.valueOf(sc.next()) ;
            //так же остальные символы


//        while(!sc.hasNext())

