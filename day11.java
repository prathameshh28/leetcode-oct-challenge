import java.util.Arrays;

public class day11 {
     public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n]; 
        int[] ans = new int[people.length];
        for(int i=0;i<n;i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        } 
        Arrays.sort(start);
        Arrays.sort(end);

        for(int i=0;i<people.length;i++){
            int startIndex = upperBound(start,people[i]);
            int endIndex = lowerBound(end,people[i]);
            ans[i] = startIndex - endIndex;
        }
       return ans; 
    }
    public int upperBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]>target){
                ans = mid;
                // loooking for more smaller value in left
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
       return ans; 
    }
    
    public int lowerBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]>=target){
                ans = mid;
                // loooking for more smaller value in left
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
       return ans; 
    }   
}
