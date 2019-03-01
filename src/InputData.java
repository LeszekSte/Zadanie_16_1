import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class InputData {

    public List<Produkt> ReadData(List produkt) throws IOException {
        FileReader fileReader = new FileReader("magazyn.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
      //  List<Produkt> produkt = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split(";");
            String nazwa = String.valueOf(split[0]);
            BigDecimal brutto = new BigDecimal(split[1]);
            BigDecimal vat = new BigDecimal(split[2]);
            produkt.add(new Produkt(nazwa, brutto, vat));
        }
        return produkt;
    }
}



