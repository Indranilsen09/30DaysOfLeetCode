package ArrayGFG;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack
{
    int max =5;
   public static int top =-1;
    static int[] arr;

    //Implementing Integer type of Stack using array
    public Stack()
    {
        arr = new int[5];
        Arrays.fill(arr,0);
    }
    //pushing Integer element into the top
    static void push(int i)
    {
        if(top >=5){
            throw new StackOverflowError();
        }
        top++;
        arr[top] = i;
    }
    static int peek()
    {
        return arr[top];
    }

    static int pop()
    {
        if(top==-1){
            throw new EmptyStackException();
        }
        int temp = top;
        top--;
        return arr[temp];

    }

}