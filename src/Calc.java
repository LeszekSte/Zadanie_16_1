import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static java.math.RoundingMode.*;

public class Calc {
    public void obliczNetto(List<Produkt> produkts) {
        for (Produkt produkt : produkts) {
            BigDecimal sto = new BigDecimal("100");
            BigDecimal jeden = new BigDecimal("1");
            BigDecimal vat1 = (produkt.getVat().divide(sto)).add(jeden);
            produkt.nettoPrice = produkt.bruttoPrice.divide(vat1, 2, HALF_UP);
            System.out.println(produkt.toString());
        }
    }

    public BigDecimal sumA(List<Produkt> produkts, BigDecimal bigDecimal) {
        BigDecimal sum = new BigDecimal("0");
        for (Produkt produkt : produkts) {
            sum = sum.add(bigDecimal);
        }
        return sum;
    }

    public BigDecimal sumBrutto(List<Produkt> produkts) {
        BigDecimal sum = new BigDecimal("0");
        for (Produkt produkt : produkts) {
            sum = sum.add(produkt.bruttoPrice);
        }
        return sum;
    }

    public BigDecimal sumNetto(List<Produkt> produkts) {
        BigDecimal sum = new BigDecimal("0");
        for (Produkt produkt : produkts) {
            sum = sum.add(produkt.nettoPrice);
        }
        return sum;
    }

    public BigDecimal sumVat(List<Produkt> produkts) {
        BigDecimal sum = new BigDecimal("0");
        BigDecimal sto = BigDecimal.valueOf(100);
        BigDecimal jed = BigDecimal.valueOf(1);
        for (Produkt produkt : produkts) {
            BigDecimal vat = (produkt.getVat().add(sto)).divide(sto, 2, HALF_EVEN);
            sum = sum.add(produkt.nettoPrice.multiply(vat)).divide(jed,2,HALF_UP);


        }
        return sum;
    }


}
