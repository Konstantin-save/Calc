import java.util.Scanner;
public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = sc.nextLine(); //сканируем строку
        System.out.println(calc(str));
    }

    public static char[] calc(String str) throws Exception {

        String[] words = str.split(" ");   //делим по пробелу
        int length = words.length;
        if (length != 3) {
            throw new LengthExeption("Формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }
        String a = words[0];
        String b = words[2];

        int num1;
        int num2;

        if (!Roman.isRoman(words[0]) && !Roman.isRoman(words[2])) {
            num1 = Integer.parseInt(words[0]);
            num2 = Integer.parseInt(words[2]);
            String oper = words[1];

            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                throw new Exception("Калькулятор принимает только числа от 1 до 10 включительно");
            }
            int result = Sign(num1, num2, oper);
            System.out.println(result);

        } else if (Roman.isRoman(words[0]) && Roman.isRoman(words[2])) {
            int numRom1 = Roman.convertToArabian(words[0]);
            int numRom2 = Roman.convertToArabian(words[2]);
            String oper = words[1];
            num1 = numRom1;
            num2 = numRom2;
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                throw new Exception("Калькулятор принимает только числа от 1 до 10 включительно");

            }
            int result = Sign(num1, num2, oper);
            if (result < 0) {
                throw new Exception("В римской системе нет отрицательных чисел");
            }
            if (result == 0) {
                throw new Exception("В системе римских цифр отсутствует ноль");
            }
            String resultRom = Roman.convertToRoman(result);
            System.out.println(resultRom);
        } else {
            throw new Exception("Одновременная работа возможна только или с арабскими, или с римскими числами");
        }

        return new char[0];
    }

    public static int Sign(int num1, int num2, String oper) {
        int result;
        switch (oper) {
            case ("+"):
                result = num1 + num2;
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
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }

    public static class Roman {
        static String[] romanArray = new String[]{
                "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
                "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
                "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
                "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        public static boolean isRoman(String val) {
            for (int i = 0; i < romanArray.length; i++) {
                if (val.equals(romanArray[i])) {
                    return true;
                }
            }
            return false;
        }

        public static int convertToArabian(String roman) {
            for (int i = 0; i < romanArray.length; i++) {
                if (roman.equals(romanArray[i])) {
                    return i;
                }
            }
            return -1;
        }

        public static String convertToRoman(int arabian) {
            return romanArray[arabian];
        }
    }
    public static class LengthExeption extends Exception{      //создаем свое исключение,наследуется от класса Exception
        public LengthExeption (String discription){     // определяем конструктор, который принимает в себя аргумент (строка)
            super(discription);
        }
    }
}
