class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        boolean sign = false;
        int res = 0;
        int i = 0;

        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(0) == '-') {
            sign = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            int digit = Character.getNumericValue(c);
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + digit;
        }

        return sign ? -res : res;
    }
}
