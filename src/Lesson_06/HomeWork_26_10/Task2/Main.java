package Lesson_06.HomeWork_26_10.Task2;

public class Main {
//    2
//    Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//    Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//    Создать класс Basket, содержащий массив купленных товаров.
//    Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.

    public static void main(String[] args) {

        Product eggs = new Product("Яйца", 2.3,10);
        Product milk = new Product("Молоко", 3, 8);
        Product sourCream = new Product("Сметана", 3.2, 9);
        Product butter = new Product("Масло", 2.7,10);
        Product cheese = new Product("Сыр", 4, 7);

        Product potato = new Product("Картошка", 0.85, 8);
        Product carrot = new Product("Морковь", 1, 7);
        Product beet = new Product("Свекла", 1.5,9);
        Product radish = new Product("Редька", 1.15, 6);
        Product chicory = new Product("Цикорий", 1.1,9);

        Category animalProducts = new Category("Животные продукты", new Product[]{eggs, milk, sourCream, butter});
        Category vegetables = new Category("Овощи", new Product[]{potato, carrot, beet, radish});

        animalProducts.addProductCategory(cheese);
        vegetables.addProductCategory(chicory);

        Basket basket = new Basket(new Product[0]);
        User buyer = new User("Buyenator", "123456789", basket);
        basket.addProduct(eggs);
        basket.addProduct(milk);
        basket.addProduct(chicory);
        System.out.println(buyer.toString());






    }
}
