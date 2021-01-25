class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if (d > jobDifficulty.length) return -1;
        int[][] dp = new int[d + 1][jobDifficulty.length];
        for(int[] p: dp){
            Arrays.fill(p,-1);
        }
        return dfs(dp,jobDifficulty,d,0);
    }      
    
    public int dfs(int[][] dp,int[] jobDifficulty,int d, int idx){
        if(d==1){
            int max = 0;
            for(; idx < jobDifficulty.length; idx++){
                    max = Math.max(max,jobDifficulty[idx]);
            }
            return max;  
        }
        
        if(dp[d][idx] != -1){
            return dp[d][idx];
        }
        
        int maxval = 0;
        int res = Integer.MAX_VALUE;
        for(int i = idx; i < jobDifficulty.length-d+1; i++){
            maxval = Math.max(maxval,jobDifficulty[i]);
            res = Math.min(res, maxval + dfs(dp,jobDifficulty,d-1,i+1));
        }
        dp[d][idx] = res;
        return dp[d][idx]; 
   }
        
}
