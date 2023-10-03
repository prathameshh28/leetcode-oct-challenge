class day3{
    // I thought of two approaches to solve this problem

    // Using Arrays --> Time Complexity : O(N^2) , Space Complexity : O(1)

    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]) cnt++;
            }
        } 
       return cnt; 
    }

    //  Using HashMap --> Time Complexity : O(N) , Space Complexity : O(N)

    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                cnt+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
       return cnt; 
    }
}