package q8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        int precision = 25;

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = calculateE(i, precision);
            System.out.println("i = " + i + ": " + e);
        }
    }

    public static BigDecimal calculateE(int n, int precision) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            term = term.divide(BigDecimal.valueOf(i), precision, RoundingMode.HALF_UP);
            result = result.add(term);
        }

        return result.setScale(precision, RoundingMode.HALF_UP);
    }
}

