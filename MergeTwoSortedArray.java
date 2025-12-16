import java.util.Arrays;

public class MergeTwoSortedArray {
    
 public static void main (String args[]){
    int arr[]={1,2,4,6,8};
    int arr2[]={5,7}; 


    int [] result=merge(arr, arr2);
    System.out.println(Arrays.toString(result));
}

public static int[] merge(int []a,int []b){
 int n=a.length;
 int m=b.length;

int [] res=new int[n+m];
int i=0,k=0,j=0;

while(i<n && j<m){
  if(a[i]<b[j]){
  res[k++]=a[i++];
}else {
   res[k++]=b[j++];
}
}

while(i<n){
res[k++]=a[i++];
} 

while(i<m){
res[k++]=b[j++];
}

return res;


}
}
