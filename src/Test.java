

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
        int myArr[] = new int[5];
        while (!stack.isEmpty()) {
            myArr[index1] = stack.pop();
            System.out.print(myArr[index1]+"\t");
            index1++;
        }

        System.out.println("==========================");


        MyStack stack1 = new MyStack(5);
        stack1.push(111);
        swapNhiPhan(111);

    }

   public static void swapNhiPhan(int number){
        int myArr[] =new int[100];
        int index =0;
        if (number<=0){
            return;
        }
        while (number!=0){
            if (number%2!=0){
                number=number/2;
                myArr[index] =1;
                index++;
            }else if (number%2==0 && number>=2){
                number =number/2;
                myArr[index] = 0;
                index++;
            }else if (number<2){
                myArr[index]=1;
                return;
            }
        }
        for (int i=0;i<index;i++){
            System.out.print(""+myArr[i]);
        }
   }

}

