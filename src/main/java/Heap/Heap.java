package Heap;

public class Heap {

    private HeapElement top = null;

    public void addToHeap(int value){
        this.top = new HeapElement(value, this.top);
    }

    public int removeFromHeap(){
        if (this.top != null){
            int temp = top.getValue();
            this.top = top.getPrev();
            return temp;


        }
        return -1;
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        }
        return false;
    }

    public int getPeakOfHeap(){
        if(this.top != null){
            return this.top.getValue();
        }
        return -1;
    }

    public void printHeap(){

        HeapElement temp = new HeapElement(this.top);
        while(temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getPrev();
        }
    }
}
