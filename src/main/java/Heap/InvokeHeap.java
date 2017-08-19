package Heap;

public class InvokeHeap {

    public static void main(String[] args) {
        invokeHeap();
        //invokeHeapOnArray();
    }

    private static void invokeHeap(){
        Heap heap = new Heap();
        heap.addToHeap(10);
        heap.addToHeap(12);
        heap.addToHeap(15);
        heap.printHeap();
        System.out.println(heap.isEmpty());
        System.out.println(heap.getPeakOfHeap());
        heap.removeFromHeap();
        System.out.println(heap.isEmpty());
        heap.printHeap();

    }

    public static void  invokeHeapOnArray(){
        HeapOnArray heap = new HeapOnArray(5);
        heap.addToHeap(10);
        heap.addToHeap(12);
        heap.addToHeap(15);
        heap.printHeap();
        System.out.println(heap.isEmpty());
        System.out.println(heap.getPeakOfHeap());
        heap.removeFromHeap();
        System.out.println(heap.isEmpty());
        heap.printHeap();
    }
}
