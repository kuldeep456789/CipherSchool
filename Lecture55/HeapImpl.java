package PriorityQueueAndHeap;
class maxHeap{
    final int capacity = 10;
    int arr[] = new int[capacity];
    int size = 0;


    int getParentIndex(int i){
        return (i-1)/2;
    }
    int getleftChildIndex(int i){
        return 2*i+1;
    }
    int getRightChildIndex(int i){
        return 2*i+1;
    }
    //function to check if the parent / childeren exit 
    boolean hashParent(int i){
        return getParentIndex(i)>=0;
    }
    boolean hashleftChild(int i){
        return getleftChildIndex(i)<size;
    }
    boolean hashRightChild(int i){
        return getRightChildIndex(i)<size;
    }
    int parent (int i){
        return arr[getParentIndex(i)];
    }
    int leftChild(int i){
        return arr[getleftChildIndex(i)];
    }
    int RightChild(int i){
        return arr[getRightChildIndex(i)];
    }
    boolean isEmpty(){
        return size == 0;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("the empty is empty . nothingf to peek");
            return -1;
        }
        return arr[0];
    }
    void add(int data){
        arr[size++] = data;
        heapifyUp();
    }
    void heapifyUp(){
        int currIndex = size-1;
        while(hashParent(currIndex)<arr[currIndex] && hashParent(currIndex)){
            Swap(getParentIndex(currIndex),currIndex);
            currIndex = getParentIndex(currIndex);
        }
    }
    void swap (int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2 ] = temp ;
    }
}

public class HeapImpl{
    public static void main(Stirng args[]){
        Myheap = new Myheap();
        System.out.println(heap.isEmpty());
        System.out.println(heap.peek());
        heap.add(7);
        System.out.println(heap.isEmpty());
        System.out.println(heap.peek());
        heap.add(5);
        System.out.println(heap.peek());
    }
}