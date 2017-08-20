package ListSort;

public class List {
    private ListElement first = null;
    private ListElement last = null;
    private ListElement prev = null;

    public void addToList(int value) {
        ListElement newItem = new ListElement(value);

        if (this.first == null) {
            this.first = newItem;
        }

        if (this.last != null) {
            this.last.setNext(newItem);
        }
        this.last = newItem;
    }

    public void RemoveFirst() {
        if (this.first != null) {
            this.first = first.getNext();
        }
    }

    public void RemoveLast() {
        if (this.last != null) {
            this.last = this.last.getPrev();
        }
    }

    public int removeByValue(int value) {
        if (this.first != null) {
            do {
                if (first.getValue() == value) {
                    first.getPrev().setNext(first.getNext());
                    first.getNext().setPrev(first.getPrev());
                }
                first = first.getNext();
            } while (first.getNext() != null);

            ListElement temp = this.last;
            do {
                this.first = temp.getPrev();
                temp = temp.getPrev();
            } while (last.getPrev() != null);
        }

        return -1;
    }


}

