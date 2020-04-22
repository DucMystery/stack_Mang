

public class Test {

    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(6);
        int index = 0;

        for (int i = 1; i < 6; i++) {
            stack.push(i);
            System.out.print(stack.arr[index] + "\t");
            index++;
        }
        System.out.println("\n");
        int index1 = 0;
        int myArr[] = new int[7];
        while (!stack.isEmpty()) {
            myArr[index1] = stack.pop();
            System.out.print(myArr[index1]+"\t");
            index1++;
        }
    }

}

