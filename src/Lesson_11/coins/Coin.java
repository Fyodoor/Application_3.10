package Lesson_11.coins;

public class Coin {
    private int nominal;
    private double diametr;
    private String country;
    private int year;

    public Coin() {
    }

    public Coin(int nominal, double diametr, String country, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.country = country;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Coin coin = (Coin) object;

        if (nominal != coin.nominal) return false;
        if (Double.compare(diametr, coin.diametr) != 0) return false;
        if (year != coin.year) return false;
        return country.equals(coin.country);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + country.hashCode();
        result = 31 * result + year;
        return result;
    }
}
