import java.math.BigDecimal;

public class Produkt {
    String nazwa;
    BigDecimal bruttoPrice;
    BigDecimal nettoPrice;
    private BigDecimal vat;

    public Produkt(String nazwa, BigDecimal bruttoPrice, BigDecimal vat) {
        this.nazwa = nazwa;
        this.bruttoPrice = bruttoPrice;
        this.setVat(vat);
    }

    public Produkt(String nazwa, BigDecimal bruttoPrice, BigDecimal nettoPrice, BigDecimal vat) {
        this.nazwa = nazwa;
        this.bruttoPrice = bruttoPrice;
        this.nettoPrice = nettoPrice;
        this.setVat(vat);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public BigDecimal getBruttoPrice() {
        return bruttoPrice;
    }

    public void setBruttoPrice(BigDecimal bruttoPrice) {
        this.bruttoPrice = bruttoPrice;
    }

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(BigDecimal nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {


        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", bruttoPrice=" + bruttoPrice +
                ", nettoPrice=" + nettoPrice +
                ", vat=" + getVat() +
                '}';
    }
}
