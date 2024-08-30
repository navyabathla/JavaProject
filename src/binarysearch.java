public class binarysearch{
    public static void main(String[] args) {
        //sorted array
//        int[] arr = {-23,-19,-5,-1,0,3,5,8,34,96,1000};
//        int target = 34;
//        int ans= orderagnosticbs(arr,target);
//        System.out.println(ans);
        //int ans = binarysearchalgo(arr,target);
        //System.out.println(ans);
    }
    //return -1 if element not found
    //return the index
//    static int binarysearchalgo(int[] arr,int target){
//         int start=0;
//         int end=arr.length - 1;
//         while(start<=end){
//             int mid = start + (end-start)/2;  //this is equal to (start+end)/2
//             if (target<arr[mid]){
//                 end=mid-1;
//             }
//             if (target>arr[mid]){
//                 start=mid+1;
//             }
//             //ans found
//             if (target==arr[mid]){
//                 return mid;
//             }
//         }
//         return -1;
//    }

//    //order algnostic binear search
//    static int orderagnosticbs(int[] arr,int target){
//         int start=0;
//         int end=arr.length - 1;
//         boolean isAsc = arr[start]<=arr[end];
//         while(start<=end){
//             int mid = start + (end-start)/2;//this is equal to (start+end)/2
//             if (target==arr[mid]){  //ans found
//                 return mid;
//             }
//             if (isAsc){
//                 if (target<arr[mid]){
//                     end=mid-1;
//                 }
//                 if (target>arr[mid]){
//                     start=mid+1;
//                 }
//             }else{
//                 if (target>arr[mid]){
//                     end=mid-1;
//                 }
//                 if (target<arr[mid]){
//                     start=mid+1;
//                 }
//             }
//         }
//         return -1;
//    }

}