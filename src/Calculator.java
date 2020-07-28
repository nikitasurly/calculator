public class Calculator {

    public static void calc(int num1, int num2, char op) {
        int result = 0;
        if (CharUtils.flagOp) {
            switch (op) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }
            System.out.println(result);
        } else {
            switch (op) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }
            String romanRes = ArabianToRomanConverter.arab2Roman(result);
            if (result < 0) {
                System.out.println("minus " + romanRes);
            } else if (result > 0) {
                System.out.println(romanRes);
            } else {
                System.out.println("null");
            }
        }
    }
}