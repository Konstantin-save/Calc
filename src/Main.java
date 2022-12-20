import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = sc.nextLine(); //сканируем строку
        String[] words = str.split(" ");   //делим по пробелу

        int num1 = Integer.parseInt(words[0]), num2 = Integer.parseInt(words[2]); String oper = words[1];
        if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10){
            throw new Exception("Калькулятор принимает только числа от 1 до 10 включительно");
        }

            switch (words[1]) {
                case ("+"):
                    System.out.println((num1) + (num2));
                    break;
                case ("-"):
                    System.out.println((num1) - (num2));
                    break;
                case ("*"):
                    System.out.println((num1) * (num2));
                    break;
                case ("/"):
                    System.out.println((num1) / (num2));
                    break;
                default:
                    throw new IllegalArgumentException("Не верный знак операции");
            }
        }
    }
