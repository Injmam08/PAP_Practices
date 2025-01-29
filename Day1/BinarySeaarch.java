import java.util.Scanner;

class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[]arr={1,2,3,4,5};
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int flag = 0;
        
        while(low<=high){
        int mid = (low+high)/2;
            
            if(arr[mid]==key){
                System.out.print("Element found at position "+mid);
                flag = flag+1;
                break;
            }
            
            else if(arr[mid]<key){
                low = mid+1;
            }
            
            else{
                high = mid-1;
            }
            
        }
        
        if(flag==0){
            System.out.println("Element not found");
        }
        
    }
}
//OUTPUT


// PS C:\Users\asus\OneDrive\Desktop\PAP\Day1> java BinarySearch.java
// 2
// Element found at position 1

// PS C:\Users\asus\OneDrive\Desktop\PAP\Day1> java BinarySearch.java
// 7
// Element not found

// PS C:\Users\asus\OneDrive\Desktop\PAP\Day1> java BinarySearch.java
// 6
// Element not found


