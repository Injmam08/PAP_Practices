import java.util.*;

class Main{
    public static void main(String []args){
       int arr[] = {1,2,3,4,5};
        //Have to use only sorted array else we can use sorting method to sort it 
       Arrays.sort(arr);
       Scanner sc = new Scanner(System.in);
       int key = sc.nextInt();
       int low = 0;
       int high = arr.length-1;
       int flag = 0;
       
       while(low<high){
           int sum = arr[low] + arr[high];
           
           if(sum==key){
               System.out.print("Target is found");
               flag++;
               break;
           }
           
           else if(sum<key){
               low++;
           }
           else{
               high--;
           }
       }
       
       if(flag==0){
            System.out.print("Target is not found");

       }
    }
}