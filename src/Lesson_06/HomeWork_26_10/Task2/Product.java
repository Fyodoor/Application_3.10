package Lesson_06.HomeWork_26_10.Task2;

public class Product {
//    Создать класс Товар, имеющий переменные имя, цена, рейтинг.

    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        setName(name);
        setPrice(price);
        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
