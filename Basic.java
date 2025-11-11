public class Basic {
    public static void main(String[] args) {
        int arr[]={2,5,6,7,5,4,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
