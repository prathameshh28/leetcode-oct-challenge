class day6{
    // can solved by DP but still i am not that efficient on it. So this Mathameatical approach.
       public int integerBreak(int n) {
        if(n<=3) return n-1;
        int quo = n/3;
        int rem = n%3;
        if(rem==0){
            return (int) Math.pow(3,quo);
        }
        else if(rem == 1){
            return (int) (Math.pow(3,quo-1) * 4);
        }
        else{
            return (int) (Math.pow(3,quo) * 2);
        }
    }
}