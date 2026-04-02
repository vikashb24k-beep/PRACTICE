package DSA;
class MinHeap{
    int [] arr;
    int size=0;
    MinHeap(int capacity){
        arr=new int [capacity];
        size=0;
    }
    public void add(int x){
        if(size==arr.length){
            throw new IllegalStateException("Heap is full");
        }
        arr[size]=x;
        size++;
        upHeapify(size-1);
    }
    public int remove(){
        if(size==0){
            throw new IllegalStateException("Heap is empty");
        }
        int peek=arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }

    public void upHeapify(int child){
        if(child==0){
            return;
        }
        int parent=(child-1)/2;
        if(arr[parent]>arr[child]){
            swap(parent,child);
            upHeapify(parent);
        }
    }
    public void downHeapify(int parent){
        int left=2*parent+1;
        int right=2*parent+2;
        int minIndex=parent;
        if(left<size && arr[left]<arr[minIndex]){
            minIndex=left;
        }
        if(right<size && arr[right]<arr[minIndex]){
            minIndex=right;
        }
        if(minIndex!=parent){
            swap(parent,minIndex);
            downHeapify(minIndex);
        }
    }
    public void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if(size==0){
            throw new IllegalStateException("Heap is empty");
        }
        return arr[0];
    }

    }

public class heapArrayImplementation {

    public static void main(String[] args) {
        MinHeap pq=new MinHeap(10);
        pq.add(6);
        pq.add(1);
        pq.add(6);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        
}

    }

