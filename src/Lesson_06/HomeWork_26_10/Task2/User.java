package Lesson_06.HomeWork_26_10.Task2;

public class User {
    //    Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
    private String login;
    private  String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        setLogin(login);
        setPassword(password);
        setBasket(basket);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
