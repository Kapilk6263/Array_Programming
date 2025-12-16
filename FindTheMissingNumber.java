public class FindTheMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,10};
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=i+1){
        //         System.out.println("Missing number is "+(i+1));
        //         break;
        //     }
        // } 

        
        //missing number from 1-N
        int n=10;
        int expected_sum=n*(n+1)/2;
        int sum=0;
        for(int k:arr){
            sum+=k;
        } 
        int missingNumber=expected_sum-sum;
        System.out.println(missingNumber);
    }
}
