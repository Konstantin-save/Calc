import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    String[] arab = {"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���������: ");
        String str = sc.nextLine(); //��������� ������
        String[] words = str.split(" ");

        //������� ����� ��������� ������ ������ �� �������. �� ����������� � ������� sc.next() :

        //Int a= Integer.valueOf(sc.next()) ;

        //����� ����� ����� ����������� ������ ������, ������, � ������� ����� � ������
        for (int i = 0; i < words.length; i++) {
            int[] numArr = new int[0];
            numArr[i] = Integer.parseInt(words[i]);
            int num1 = Integer.parseInt(words[0]), num2 = Integer.parseInt(words[2]);
            System.out.println((num1 ) + (num2));

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
