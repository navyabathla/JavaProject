import java.util.Arrays;

public class sort{
    public static void main(String[] args) {
        //bubble sort
//        int[] arr = {5,4,3,2,1};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
//        //selection sort
//        int[] arr = {4,5,1,2,3};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//        //insertion sort
//        int[] arr = {5,3,4,1,2};
//        insertion(arr);
//        System.out.println(Arrays.toString(arr));
        //cycle sort
        int[] arr = {3,5,2,1,4};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));




    };
    //cyclic sort
    static void cyclesort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
//    //insertion sort
//    static void insertion(int[] arr){
//        for (int i = 0; i < arr.length-1; i++){
//            for (int j = i+1; j > 0; j--){
//                if (arr[j]<arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//                else{
//                    break;
//                }
//            }
//        }
//    }
//    //selecyion sort
//    static void selection(int[] arr){
//        for (int i = 0; i < arr.length;i++){
//            //find the max element in the remaining array and swap it with the correct index
//            int last = arr.length - i - 1;
//            int maxindex = getmaxindex(arr,0,last);
//            swap(arr,maxindex,last);
//        }
//    }
    //swap
    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
//    // to get the index of max element
//    private static int getmaxindex(int[] arr, int start, int end) {
//        int max = start;
//        for (int i = start; i<=end; i++){
//            if (arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }


    //bubble sort
//    static void bubble(int[] arr){
//        boolean swapped;
//        //run this step n-1 times
//        for (int i = 0; i < arr.length; i++){
//            swapped = false;
//            //for each step,max element will come at the last respective index
//            for (int j = 1; j < arr.length-i; j++){
//                //swap if the item is smaller than the previous element
//                if (arr[j] < arr[j-1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    swapped = true;
//                }
//            }
//            //if we did not swap for a particular value of i,this means that the array is sorted and we can stop the program
//            if (!swapped){
//                break;
//            }
//
//        }
//    }
}