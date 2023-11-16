package Consultation;

//add, get, toString, count, remove

public class MyLinkedList {
    private String value;
    private MyLinkedList next;
    private MyLinkedList prev;

    public MyLinkedList add(String newValue) {
        next = new MyLinkedList(newValue, null, null);
        return this;
    }

    public MyLinkedList(String value) {
        this.value = value;
    }

    public MyLinkedList(String value, MyLinkedList next, MyLinkedList prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MyLinkedList getNext() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }

    public MyLinkedList getPrev() {
        return prev;
    }

    public void setPrev(MyLinkedList prev) {
        this.prev = prev;
    }
}
