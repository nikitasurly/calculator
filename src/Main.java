import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String in = input.replaceAll(" ","");
        int op = 0;
        for (int i = 0; i < in.length() - 1; i++) {
            switch (in.charAt(i)) {
                case '+', '-', '*', '/' -> op = i;
            }
        }
        String number1 = in.substring(0, op);
        String number2 = in.substring(op + 1);
        char operator = in.charAt(op);
        int firstNumber = 0;
        int secondNumber = 0;
        try {
            if (CharUtils.check(number1, number2).equals("arabian")) {
                firstNumber = Integer.parseInt(number1);
                secondNumber = Integer.parseInt(number2);
            } else {
                if (CharUtils.check(number1, number2).equals("roman")) {
                    firstNumber = RomanToArabianConverter.roman2Arab(number1);
                    secondNumber = RomanToArabianConverter.roman2Arab(number2);
                }
            }
        }
        catch (NullPointerException error) {
            System.err.println("Invalid input");
            return;
        }
        Calculator.calc(firstNumber, secondNumber, operator);
    }
}
