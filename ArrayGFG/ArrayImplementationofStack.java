package ArrayGFG;

public class ArrayImplementationofStack
{
    public static void main(String args[])
    {
        Stack st = new Stack();
        st.push(1);
        st.push(10);
        st.push(6);
        st.push(8);
        st.push(12);
        System.out.println("top element :"+ st.peek());
        st.pop();
        System.out.println("top element :"+ st.peek());
        st.pop();
        System.out.println("top element :"+ st.peek());
        st.pop();
        System.out.println("top element :"+ st.peek());
        st.pop();
        System.out.println("top element :"+ st.peek());
        st.pop();
        System.out.println("top element :"+ st.peek());


    }
}
