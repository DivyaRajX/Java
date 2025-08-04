public class Queue {

    private int[] arr;
    private int front = 0;
    private int size = 0;

    public Queue(){
        arr = new int[5];
    }

    public Queue(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void Enqueue(int item){
        //int idx = front+size; linear queue
        int idx = (front+size)%arr.length;
        arr[idx] = item;
        size++;
    }

    public int Dequeue(){
        int rv = arr[front];
        // front++ linear queue
        front = (front+1)%arr.length;
        size--;
        return rv;
    }

    public int getQueue(){
        return arr[front];
    }

    public int size(){
        return size;
    }
}
