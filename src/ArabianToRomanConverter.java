public class ArabianToRomanConverter {
    public static String arab2Roman(int x) {
        int ten = Math.abs(x / 10);
        int one = Math.abs(x % 10);
        String rTen = null;
        String rOne = null;
        switch (ten) {
            case 0 -> rTen = "";
            case 1 -> rTen = "X";
            case 2 -> rTen = "XX";
            case 3 -> rTen = "XXX";
            case 4 -> rTen = "XL";
            case 5 -> rTen = "L";
            case 6 -> rTen = "LX";
            case 7 -> rTen = "LXX";
            case 8 -> rTen = "LXXX";
            case 9 -> rTen = "XC";
            case 10 -> rTen = "C";
        }
        switch (one) {
            case 0 -> rOne = "";
            case 1 -> rOne = "I";
            case 2 -> rOne = "II";
            case 3 -> rOne = "III";
            case 4 -> rOne = "IV";
            case 5 -> rOne = "V";
            case 6 -> rOne = "VI";
            case 7 -> rOne = "VII";
            case 8 -> rOne = "VIII";
            case 9 -> rOne = "IX";
        }
        return rTen + rOne;
    }
}
