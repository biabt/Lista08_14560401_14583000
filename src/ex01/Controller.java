package ex01;

import java.math.BigDecimal;

public class Controller {
    public static BigDecimal calculaFatorial(int numero) {
        BigDecimal fatorial = BigDecimal.ONE;
        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial.multiply(BigDecimal.valueOf(i));
        }
        return fatorial;
    }
}

