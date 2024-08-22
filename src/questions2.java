import java.util.Arrays;
import java.util.Scanner;

public class questions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //16. to count the number of times a digit is there in a number
//        int a = 13839;
//        int count = 0;
//        while (a > 0) {
//            int rem = a % 10;
//            if (rem == 3) {
//                count++;
//            }
//            a = a / 10;
//        }
//        System.out.println(count);

//        //Q17. reverse a given number
//        int a=46783;
//        int reversednum = 0;
//        while(a>0){
//            int rem = a%10;
//            reversednum= reversednum*10 +rem;
//            a/=10;
//        }
//        System.out.println(reversednum);

//        // Q18. make a calculator
//        int ans=0;
//        while(true) {
//            System.out.print("Enter operator +,-,*,/ or x or X to stop: ");
//            char op = sc.next().trim().charAt(0);
//            if (op == '+' || op == '-' || op == '*' || op == '/') {
//                System.out.println("Enter two numbers: ");
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//                if (op == '+') {
//                    ans = a + b;
//                }
//                if (op == '-') {
//                    ans = a - b;
//                }
//                if (op == '*') {
//                    ans = a * b;
//                }
//                if (op == '/') {
//                    if (b != 0) {
//                        ans = a / b;
//                    } else {
//                        System.out.println("Division by zero is not defined");
//                    }
//                }
//            } else if (op == 'x' || op == 'X') {
//                break;
//            } else {
//                System.out.println("invalid operator");
//            }
//            System.out.println(ans);
//        }
//        //Q19. check if a number is prime or not
//        int n = sc.nextInt();
//        boolean ans = isprime(n);
//        System.out.println(ans);

//        //Q20. print all three digit amstrong numbers
//        for(int i=100;i<1000;i++){
//            if (isArmstrong(i)){
//                System.out.print(i+" ");
//            }

//       //Q21. swap two numbers in an array
//        int[] arr={1,2,3,4,5};
//        swap(arr,1,3);

//        System.out.println(Arrays.toString(arr));


//        //Q22. find max number from an array
//       int[] arr = {23,54,12,3,59};
//       reverse(arr);
//       System.out.println(Arrays.toString(arr));
//       System.out.println(max(arr));
//
   }
//    //Q23.
//    static void reverse(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//        while (start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//
//    }
//    //Q22.
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]>maxVal){
//                maxVal=arr[i];
//            }
//
//        }
//        return  maxVal;
//    }
//
//     //Q21
//   static void swap(int[] arr,int index1,int index2){
//        int temp= arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
////    //Q20
////    static boolean isArmstrong(int n){
////        int on=n;
////        int sum=0;
////        while(n>0){
////            int rem=n%10;
////            n/=10;
////            sum+= rem*rem*rem;
////        }
////        if (sum==on){
////            return true;
////        }
////        return false;
////    }
////    //Q19.
////    static boolean isprime(int n){
////        if (n<=1){
////            return false;
////        }
////        int c=2;
////        while ((c * c) <= n){
////            if (n % c == 0){
////                return false;
////            }
////            c++;
////        }
////        if((c * c) > n){
////            return true;
////        }
////        return false;
////        }
}


