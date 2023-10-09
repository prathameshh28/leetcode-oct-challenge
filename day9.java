class day9{
    public int[] searchRange(int[] nums, int target){
        int ans[] = new int [2];
        ans[0] = lowerBound(nums,target);
        ans[1] = higherBound(nums,target);
        return ans;
    }
    private int lowerBound(int[]nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MIN_VALUE;
        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]>target){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
       return ans; 
    }

    private int higherBound(int[]nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MIN_VALUE;
        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
       return ans; 
    }
}