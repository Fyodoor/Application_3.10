package Lesson_06.HomeWork_26_10.Task2;

public class Category {
    //    Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        setName(name);
        setProducts(products);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
