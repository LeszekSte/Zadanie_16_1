
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class zadanie_2 {

    public static void main(String[] args) throws IOException {
        InputData inputData = new InputData();
        List<Produkt> produkts = new ArrayList<>();
        inputData.ReadData(produkts);
        System.out.println(produkts);
        Calc calc = new Calc();

        calc.obliczNetto(produkts);

        System.out.printf("Suma cena Brutto %s\n", calc.sumBrutto(produkts));
        System.out.printf("Suma cena Netto  %s\n", calc.sumNetto(produkts));
        System.out.printf("Suma cena Vat    %s\n", calc.sumVat(produkts));

    }

}