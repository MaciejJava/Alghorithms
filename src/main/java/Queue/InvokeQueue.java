package Queue;

public class InvokeQueue {
    public static void main(String[] args) {
       invokeQueue();
        // invokeQueueOnArray();
    }

    public static void invokeQueue(){
        Queue queue = new Queue();
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        queue.printQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.getPeakOfQueue());
        System.out.println(queue.getLastAdded());
        System.out.println(queue.removeFromQueue());
        System.out.println(queue.getPeakOfQueue());

    }

    public static void invokeQueueOnArray(){
        QueueOnArray queue = new QueueOnArray(5);
        System.out.println(queue.isEmpty());
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        System.out.println(queue.getLastAdded());
        System.out.println(queue.getPickOfQueue());
        System.out.println(queue.removeFromQueue());
        System.out.println(queue.getPickOfQueue());
        System.out.println(queue.isEmpty());
    }
}
