import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;


public class zadanie_2 {

    public static void main(String[] args) throws IOException {
        InputData inputData = new InputData();
        List<Produkt> produkts = new ArrayList<>();
        inputData.ReadData(produkts);
        System.out.println(produkts);
        obliczNetto(produkts);
    }


    private static void obliczNetto(List<Produkt> produkts) {
        for (Produkt produkt : produkts) {
            BigDecimal sto = new BigDecimal("100");
            BigDecimal jeden = new BigDecimal("1");
            BigDecimal vat1 = (produkt.vat.divide(sto)).add(jeden);
            produkt.nettoPrice = produkt.bruttoPrice.divide(vat1, 2, RoundingMode.HALF_UP);
            System.out.println(produkt.toString());
        }
    }


}
