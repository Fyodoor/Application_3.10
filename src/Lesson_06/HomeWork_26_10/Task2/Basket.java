package Lesson_06.HomeWork_26_10.Task2;

import java.util.Arrays;

public class Basket {
    // Создать класс Basket, содержащий массив купленных товаров.

    private Product[] purchasedProduct;

    public Basket(Product[] purchasedProduct) {
        setPurchasedProduct(purchasedProduct);
    }

    public Product[] getPurchasedProduct() {
        return purchasedProduct;
    }

    public void setPurchasedProduct(Product[] purchasedProduct) {
        this.purchasedProduct = purchasedProduct;
    }

    public void addProduct(Product product) {
        Product[] productsNew = new Product[this.purchasedProduct.length + 1];
        for (int i = 0; i < this.purchasedProduct.length; i++) {
            productsNew[i] = this.purchasedProduct[i];
        }
        productsNew[productsNew.length - 1] = product;
        setPurchasedProduct(productsNew);
    }

    @Override
    public String toString() {
        return "Продукты в корзинке{" +
                Arrays.toString(getPurchasedProduct()) +
                '}';
    }
}
