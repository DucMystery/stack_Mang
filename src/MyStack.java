public class MyStack {

    public int[] arr;
    private int size;
    private int index=0;

    public MyStack(int size){
        this.size =size;
        arr = new int[size];
    }

    boolean isFull(){
        if (index==size)
            return true;
        return false;
    }

    boolean isEmpty(){
        if (index==0)
            return true;
        return false;
    }

    int push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full !");
        }
        arr[index] =element;
        index++;
        return arr[index];
    }

    int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    int getSize(){
        return index;
    }

}
