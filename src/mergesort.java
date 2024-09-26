import java.lang.reflect.Array;
import java.util.Arrays;

public class mergesort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        mergesort(arr);
//        System.out.println(Arrays.toString(arr));
//        mergesortinplace(arr,0,arr.length); ///wrong output
//        System.out.println(Arrays.toString(arr));



    }
//    static int[] mergesort(int[] arr){
//        if (arr.length==1){
//            return arr;
//        }
//        int mid = arr.length/2;
//        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
//        return merge(left,right);
//    }
//
//    private static int[] merge(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i<first.length && j<second.length){
//            if (first[i]<second[j]){
//                mix[k]=first[i];
//                i++;
//            }
//            else{
//                mix[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//        //it may be possible that one the arrays may not be complete
//        //copy the remaining elemnets
//        while (i< first.length){
//            mix[k]=first[i];
//            i++;
//            k++;
//        }
//        while (j< second.length){
//            mix[k]=second[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }
//
//    static void mergesortinplace(int[] arr,int s ,int e){   //wrong output
//        if (e-s == 1){
//            return;
//        }
//        int mid = (s+e)/2;
//
//        mergesortinplace(arr,s,mid);
//        mergesortinplace(arr,mid,e);
//        mergeinplace(arr,s,mid,e);
//    }
//
//    private static void mergeinplace(int[] arr,int s, int mid,int e) {
//        int[] mix = new int[e-s];
//        int i = s;
//        int j = mid;
//        int k = 0;
//        while (i<mid && j<e){
//            if (arr[i]<arr[j]){
//                mix[k]=arr[i];
//                i++;
//            }
//            else{
//                mix[k]=arr[j];
//                j++;
//            }
//            k++;
//        }
//        //it may be possible that one the arrays may not be complete
//        //copy the remaining elemnets
//        while (i< mid){
//            mix[k]=arr[i];
//            i++;
//            k++;
//        }
//        while (j< e){
//            mix[k]=arr[j];
//            j++;
//            k++;
//        }
//        for (int l = 0;l<mix.length;l++){
//            arr[s+l]=arr[l];
//
//
//        }
//    }
}
