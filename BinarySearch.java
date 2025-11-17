public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};

        int target=7;
        
        System.out.println("index of target :"+isAvaialble(arr, target));

    }

    static int isAvaialble(int arr[],int target){
          int st=0;
          int end=arr.length-1;
            int mid=0;
          while(st<=end){
            mid=(st+end)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) st=mid+1;
            else end=mid-1;
          }
          return -1;
    }

}
