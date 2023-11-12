package Lesson_06.HomeWork_26_10.Task2;

import java.util.Arrays;

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

    public void addProductCategory(Product product) {
        Product[] productsNew = new Product[this.products.length + 1];
        for (int i = 0; i < this.products.length; i++) {
            productsNew[i] = this.products[i];
        }
        productsNew[productsNew.length - 1] = product;
        setProducts(productsNew);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(getProducts()) +
                '}';
    }
}
