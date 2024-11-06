import java.util.Stack;

public class questions3{
    public static void main(String[] args) {
        //time complexity = O(N)
        //Auxiliary space = O(1)
        // Initialise array
        int arr[] = { 1, 2, 3, 4 };

        // size of array
        int N = arr.length;

        // Traverse the element of arr[]
        for (int i = 0; i < N; i++) {

            // Print the element
            System.out.print(arr[i] + " ");
        }

        //time complexity = O(N)
        //Auxiliary space = O(1)
        // Initialise stack
        Stack<Integer> St = new Stack<>() ;

        // Insert Element in stack
        St.add(4);
        St.add(3);
        St.add(2);
        St.add(1);

        // Print elements in stack
        printStack(St);

    }
    static void printStack(Stack<Integer> St){

        // Traverse the stack
        while (!St.isEmpty()) {

            // Print top element
            System.out.print(St.peek() +" ");

            // Pop top element
            St.pop();
        }
    }
}