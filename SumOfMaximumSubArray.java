public class SumOfMaximumSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // int max_sum = 0;
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {

        //     sum = 0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum += arr[j];
        //     }

        //     System.out.println();
        //     if (max_sum < sum) {
        //         max_sum = sum;
        //     }

        //     System.out.println(max_sum);

        //}


       int sum=0;
       int max_sum=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum>max_sum){
            max_sum=sum;        }
       } 
       if(sum<0){
        sum=0;
       }
       System.out.println(max_sum);
    }
}
