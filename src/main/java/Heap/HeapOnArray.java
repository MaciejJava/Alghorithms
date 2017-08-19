package Heap;

public class HeapOnArray {

    private int[] heap;
    private int currentIndex = 0;



        public HeapOnArray(int size){
        this.heap = new int[size];
        }

        public void addToHeap(int item) {
            if (currentIndex < this.heap.length -1) {
                this.heap[this.currentIndex] = item;
                this.currentIndex++;
            }

        }

        public int removeFromHeap(){
            if(currentIndex > 0) {
                currentIndex--;
                return this.heap[this.currentIndex];
            }
            return 0;
        }

        public boolean isEmpty(){
            if (this.currentIndex == 0) {
                return true;
            }
            return false;
        }
        public int getPeakOfHeap(){
            return this.heap[this.currentIndex-1];
        }

    public static void printInt(int n) {

            System.out.println(n);
    }

    public static void printString(int n) {

        System.out.println(n);
    }

        public void printHeap(){
            for(int i = 0; i < this.currentIndex;i++){
                printInt(this.heap[i]);
            }
        }



}
