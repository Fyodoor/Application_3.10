package Lesson_06.HomeWork_26_10.Task2;

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
}
