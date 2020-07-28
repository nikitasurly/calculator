public class CharUtils {
    static boolean flagOp = false;
    public static String check(String s1, String s2) {
        String result1 = null;
        String result2 = null;
        String result = null;
        String[] arrArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] arrRoman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String k : arrArab) {
            if (s1.equals(k)) {
                result1 = "arabian";
                break;
            }
        }
        for (String m : arrRoman) {
            if (s1.equals(m)) {
                result1 = "roman";
                break;
            }
        }
        for (String n : arrArab) {
            if (s2.equals(n)) {
                result2 = "arabian";
                break;
            }
        }
        for (String p : arrRoman) {
            if (s2.equals(p)) {
                result2 = "roman";
                break;
            }
        }
        assert result1 != null;
        if (result1.equals(result2) && result1.equals("arabian")) {
            result = "arabian";
            flagOp = true;
        }
        if (result1.equals(result2) && result1.equals("roman")) {
            result = "roman";
        }
        return result;
    }
}


