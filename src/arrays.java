import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of primitives
//        int[] arr= new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        System.out.println(Arrays.toString(arr));
//
//        for (int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i=0;i<arr.length;i++){   // this for loop can be used to print the array istead of using the arrays.tostring method
//            System.out.println(arr[i]+" ");
//        }
//        for (int num : arr){   // this for loop is for printing the array
//            System.out.println(num+" "); //here num represent every element in array
//        }
        //array of objects
//        String[] arr = new String[5];
//        for (int i=0;i<5;i++){
//            arr[i]= sc.next();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int[][] arr2D = new int[3][];
//        int[][] ARR2D = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
//        //input
//        int arr[][] = new int[3][3];
////        System.out.println(arr.length); // will give number of rows
//        for (int row=0;row<arr.length;row++ ){
//            for (int col=0; col<arr[row].length;col++){
//                arr[row][col]=sc.nextInt();
//            }
//        }
//        //output
//        for (int row=0;row<arr.length;row++ ) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        //output
//        for (int row=0; row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for (int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }


        //ArrayList -> this for when we do not know what size of array we have to create
//        ArrayList<Integer> list= new ArrayList<>(2);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        System.out.println(list);
//        System.out.println(list.contains(4));
//        list.set(1, 100);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
        //input
//        for (int i=0;i<5;i++) {
//            list.add(sc.nextInt());
//        }
//        //get item at any index
//        for (int i=0; i<5;i++) {
//            System.out.print(list.get(i) + " "); //pass index here list[index] will not work here
//        }
        //multiD arraylist
//        ArrayList<ArrayList<Integer>> list2D= new ArrayList<>();
        //initialisation
//        for (int i=0;i<3;i++){
//            list2D.add(new ArrayList<>());
//        }
        //add elements
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                list2D.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list2D);















    }
}