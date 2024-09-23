public class recursion{
    public static void main(String[] args) {
//        int[] arr = {4,12,35,49,55,69,73,87,91};
//        int target = 87;
//        System.out.println(search(arr,target,0,arr.length));
//        //print numbers 1 2 3 4 5
//        print(1);
//        System.out.println(fibo(4));
        //basic questions
//        ntoone(5);
//        oneton(5);
//        both(5);
//        int ans = fact(5);
//        System.out.println(ans);
//        int a = sumofdigits(1342);
//        System.out.println(a);
//        int b = prodofdigits(5);
//        System.out.println(b);
//        concept(5);
//        reverse(1921);
//        System.out.println(sum);
//        ispalindrome(12321);
        




    }

    //basic questions
//     static void ntoone(int n){
//        if (n==0){
//            return;
//        }
//         System.out.print(n+ " ");
//        ntoone(n-1);
//     }
//    static void oneton(int n){
//        if (n==0){
//            return;
//        }
//        oneton(n-1);
//        System.out.print(n+ " ");
//    }
//    static void both(int n){
//        if (n==0){
//            return;
//        }
//        System.out.print(n+ " ");
//        both(n-1);
//        System.out.print(n+ " ");
//    }
//    static int fact(int n){
//        if (n<=1){
//            return 1;
//        }
//        return n*fact(n-1);
//    }
//    static int sumofdigits(int n){
//        if (n==0){
//            return 0;
//        }
//        return (n%10) + sumofdigits(n/10);
//    }
//    static int prodofdigits(int n){
//        if (n%10==n){
//            return n;
//        }
//        return (n%10) * prodofdigits(n/10);
//    }
//    static void concept(int n){
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//        //concept(n--);
//        concept(--n);
//    }
//    static int sum = 0;
//    static void reverse(int n){
//        if (n==0){
//            return;
//        }
//        int rem = n%10;
//        sum = sum*10+rem;
//        reverse(n/10);
//    }
//    static boolean ispalindrome(int n){            ////wrong
//        return n == reverse(n);
//    }




//    static int search(int[] arr, int target, int s,int e){
//        if (s>e){
//            return -1;
//        }
//        int m = s+(e-s)/2;
//        if (arr[m]==target){
//            return m;
//        }
//        if (target<arr[m]){
//            return search(arr,target,s,m-1);
//        }
//        return search(arr,target,m+1,e);
//    }
//    static int fibo(int n){
//        if (n<2){
//            return n;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
//    static void print(int n){
//        if (n==5){
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);
//        print(n+1);
//    }
}