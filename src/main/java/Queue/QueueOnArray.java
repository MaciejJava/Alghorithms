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
            currentIndex++;
        }
    }

    public int removeFromQueue() {
        if (currentIndex > 0) {
            int temp = this.quaue[0];
            for (int i = 1; i <this.quaue.length; i++){
                this.quaue[i-1] = this.quaue[i];
            }
            currentIndex--;
            return temp;
        }
        return -1;
    }

    public int getLastAdded(){
        if (currentIndex > 0) {
            return this.quaue[currentIndex-1];
        }
        return  -1;
    }

    public void printQueue(){
        for (int i = 0; i< this.currentIndex; i++){

            System.out.println(this.quaue[i]);

        }
    }

    public int getPickOfQueue(){
        if (currentIndex > 0) {
            return this.quaue[0];
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.currentIndex == 0) {
            return true;
        }

        return false;
    }
}
