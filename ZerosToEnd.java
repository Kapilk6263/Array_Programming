public class ZerosToEnd {
    public static void main(String[] args) {
        int []arr={5,6,0,7,5,0,0,8};

        int z=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==0){
                z=i;
               break;
            }
            i++;
        } 
        for(int nz=z+1;nz<arr.length;nz++){
           if (arr[nz] != 0) {
                int temp = arr[z];
                arr[z] = arr[nz];
                arr[nz] = temp;
                z++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
