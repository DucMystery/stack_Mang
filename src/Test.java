public class Test {

    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1 . Size of stack after push operation :"+stack.getSize());
        System.out.println("2 . Pop elements from stack:");

        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }

        System.out.printf("\n3 . Size of stack after pop operation : "+stack.getSize());
    }
}