package Queue;

public class QueueOnArray {

    private int[] quaue;
    private int currentIndex = 0;

    public  QueueOnArray(int size){
        this.quaue = new int[size];
    }

    public void addToQueue(int item){
        if (currentIndex < this.quaue.length-1) {
            this.quaue[currentIndex] = item;
        }
    }

    public boolean isEmpty() {
        if (this.currentIndex == 0) {
            return true;
        }

        return false;
    }
}
