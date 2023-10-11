import java.util.Arrays;

public class day10 {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int uniqueLen = 1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[uniqueLen++] = nums[i];
            }
        } 
        int ans = nums.length;
        for(int i=0,j=0;i<uniqueLen;i++){
            while(j<uniqueLen && nums[j]-nums[i]<=n-1){
                j++;
            }
           ans = Math.min(ans,nums.length - (j-i)); 
        }  
       return ans; 
    }
}
