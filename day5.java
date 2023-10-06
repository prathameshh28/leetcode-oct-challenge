class day5{
    // problem statement : find element that apperar more than n/3 times .

    // approach 1 (Using HashMap)  TC : O(N) as unordered hashing takes constant time  , SC : O(N)

    public static List<Integer> majorityElement(int[] nums){
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int min = (int)n/3 + 1;
        for(int i=0;i<n;i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);

            if(map.get(nums[i])==min){
                ans.add(nums[i]);
            }
            if(ans.size()==2) break;
        }
       return ans;
    }


    // approach 2 (Extended Boyer Moore’s Voting Algorithm ) TC : O(2N) , SC : O(1).

     public static List<Integer> majorityElement(int[] nums){
        int n = nums.length;
        int cnt1 = 0; int cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                el1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2==0 && nums[i]!=el1){
                el2 = nums[i];
                cnt2=1;
            }
            else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        int min = (int) n/3 +1;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
        }
        if(cnt1>=min) ans.add(el1);
        if(cnt2>=min) ans.add(el2);
        return ans;
     }
}