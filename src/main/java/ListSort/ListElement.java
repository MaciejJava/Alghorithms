package ListSort;

public class ListElement {
    private int value;
    private ListElement first = null;
    private ListElement next = null;
    private ListElement prev = null;

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public ListElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListElement getFirst() {
        return first;
    }

    public void setFirst(ListElement first) {
        this.first = first;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}
