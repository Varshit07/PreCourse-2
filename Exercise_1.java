// Time Complexity:  O(Logn) Space Complexity: O(Logn)
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        // check if search space is valid
		if (l <= r) { 
          // calculate mid to avoid integer addition overflow  
          int mid = l + (r - l) / 2; 

          // Check if the element is at mid if yes then return mid
          if (arr[mid] == x) 
              return mid; 

          // if x is on the right of arr[mid] then discard left half
          if (x > arr[mid]) 
              return binarySearch(arr, mid + 1, r, x);

          // if x is on the left side of arr[mid] then discard right half
          return binarySearch(arr, l, mid - 1, x); 
        } 

        // if x is not present in arr[]
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
