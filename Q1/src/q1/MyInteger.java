package q1;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger != null && isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger != null && isOdd(myInteger.getValue());
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger != null && isPrime(myInteger.getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger != null && this.value == myInteger.getValue();
    }

    public static int parseInt(char[] chars) {
        int result = 0;
        for (char ch : chars) {
            if (ch < '0' || ch > '9') {
                throw new NumberFormatException("Geçersiz karakter: " + ch);
            }
            result = result * 10 + (ch - '0');
        }
        return result;
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}

