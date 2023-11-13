package Lesson_08.HomeWork.Task1;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private int telephone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, int telephone) {
        setFullName(fullName);
        setLibraryCardNumber(libraryCardNumber);
        setFaculty(faculty);
        setDateOfBirth(dateOfBirth);
        setTelephone(telephone);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void takeBook(int numberOfBooks){
        System.out.println(getFullName() + " взял " + numberOfBooks + " книги");
    }
    public void takeBook(String... nameOfbook) {
        System.out.print(getFullName() + " взял: " );
        for (String b: nameOfbook) {
            System.out.print(b + ", ");
        }
    }
    public void takeBook(Book... books){
        System.out.print(getFullName() + " взял: ");
        for (Book b: books){
            System.out.print(b + " ");
        }
    }

    public void returnBook(int numberOfBooks){
        System.out.println(getFullName() + " вернул " + numberOfBooks + " книгу");
    }

    public void returnBook(String... nameOfbook) {
        System.out.print(getFullName() + " вернул: " );
        for (String b: nameOfbook) {
            System.out.print(b);
        }
    }

    public void returnBook(Book... books){
        System.out.print(getFullName() + " вернул: ");
        for (Book b: books){
            System.out.print(b + " ");
        }
    }
}
