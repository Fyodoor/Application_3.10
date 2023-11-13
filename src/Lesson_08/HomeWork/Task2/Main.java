package Lesson_08.HomeWork.Task2;

public class Main {
//    2
//    Наследование Student, Aspirant
//    Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//    аспирант отличается от студента наличием некой научной работы.
//    Класс Student содержит переменные: String firstName, lastName, group.
//    А также, double averageMark, содержащую среднюю оценку.
//    Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//    Если средняя оценка студента равна 5, то сумма 2000 грн, иначе 1900. Переопределить этот метод в классе Aspirant.
//    Если средняя оценка аспиранта равна 5, то сумма 2500 грн, иначе 2200.
//    Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//    Вызвать метод getScholarship() для каждого элемента массива.

    public static void main(String[] args) {
        Student st1 = new Student("Alex", "Bolduin", "group A", 4.3);
        Student st2 = new Student("Chriss", "Hemstar", "group A", 5);
        Student st3 = new Student("Nicolas", "Keilee", "group C", 3.3);
        Aspirant aspirant1 = new Aspirant("Tomas", "Torantino", "group C", 4, "Melodrama");
        Aspirant aspirant2 = new Aspirant("Kevin", "Spicy", "group A", 5, "Teologi");

        Student[] students = {st1,st2,st3,aspirant1,aspirant2};
        for (Student s: students){
            System.out.println(s.getFirstName() + " получает степендию в размере: " + s.getScholarship() + " грн");
        }
    }


}
