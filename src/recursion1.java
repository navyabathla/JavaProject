import java.util.ArrayList;
import java.util.Arrays;

public class recursion1{
    public static void main(String[] args) {
//        int[] arr = {1,3,4,4,5,6,8,12,34};
//        int[] arr={5,6,7,8,1,2,3};
//        System.out.println(search(arr,8,0, arr.length));
//        ArrayList<Integer> ans = findAllindex(arr,4,0,new ArrayList<>());
//        System.out.println(ans);
//        System.out.println(findAllindex2(arr,4,0));
//        System.out.println(sorted(arr,0));
//        System.out.println(find(arr,6,0));
//        System.out.println(findindex(arr,6,0));
//        findAllindex(arr,4,0);
//        System.out.println(list);
//        triangle1(4,0);
//        triangle2(4,0);
//        int[] arr = {4,3,2,1};
//        bubble(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));

    }
//    //check whether the array is sorted or not
//    static boolean sorted(int[] arr, int index){
//        //base condition
//        if (index == arr.length-1){
//            return true;
//        }
//        return arr[index] < arr[index+1] && sorted(arr,index+1);
//    }
//    //check whether the element is present in the array or not
//    static boolean find(int arr[], int target,int index){
//        if (index==arr.length){
//            return false;
//        }
//        return arr[index]==target || find(arr,target,index+1);
//    }
//    static int findindex(int arr[], int target,int index) {
//        if (index == arr.length) {
//            return -1;
//        }
//        if (arr[index] == target) {
//            return index;
//        }
//        else{
//            return findindex(arr,target,index+1);
//        }
//    }
//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllindex(int[] arr, int target,int index) {
//        if (index == arr.length) {
//            return ;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        findAllindex(arr,target,index+1);
//
//    }
//    static ArrayList<Integer> findAllindex(int[] arr, int target,int index,ArrayList<Integer> list) {
//        if (index == arr.length) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        return findAllindex(arr,target,index+1,list);
//    }
//    static ArrayList<Integer> findAllindex2(int[] arr, int target,int index) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if (index == arr.length) {
//            return list;
//        }
//        //this will contain ans for that function call only
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        ArrayList<Integer> ansFrromBelowCalls = findAllindex2(arr, target, index+1);
//        list.addAll(ansFrromBelowCalls);
//        return list;
//    }
//    static int search(int[] arr,int target,int s,int e){
//        if (s>e){
//            return -1;
//        }
//        int m = s+(e-s)/2;
//        if (arr[m]==target){
//            return m;
//        }
//        if (arr[s]<=arr[m]){
//            if (target>=arr[s] && target<=arr[m]){
//                return search(arr,target,s,m-1);
//            }
//            else{
//                return search(arr,target,m+1,e);
//            }
//        }
//        if (target>=arr[m] && target<=arr[e]){
//            return search(arr,target,m+1,e);
//        }
//        return search(arr,target,s,m-1);
//    }
//    static void triangle1(int r, int c){
//        if (r==0){
//            return;
//        }
//        if (c<r){
//            System.out.print("* ");
//            triangle1(r,c+1);
//        }
//        else{
//            System.out.println();
//            triangle1(r-1,0);
//        }
//    }
//    static void triangle2(int r, int c){
//        if (r==0){
//            return;
//        }
//        if (c<r){
//            triangle2(r,c+1);
//            System.out.print("* ");
//
//        }
//        else{
//            triangle2(r-1,0);
//            System.out.println();
//        }
//    }
//    static void bubble(int[] arr, int r, int c){
//        if (r==0){
//            return;
//        }
//        if (c<r){
//            if (arr[c]>arr[c+1]){
//                //swap
//                int temp = arr[c];
//                arr[c]= arr[c+1];
//                arr[c+1]=temp;
//            }
//            bubble(arr,r,c+1);
//        }
//        else{
//            bubble(arr,r-1,0);
//
//        }
//    }

}