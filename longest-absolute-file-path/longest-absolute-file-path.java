class Solution {
    public int lengthLongestPath(String input) {
        if (input.length() == 0)
            return 0;
        
        int max_length = 0;
        
        String[] p = input.split("\n");
        int[] a = new int[p.length + 1];
        for(String s:p){
            int depth = s.lastIndexOf("\t")+1;
            a[depth+1] = a[depth] + (s.length() - depth) + 1;
            int cur_len = a[depth+1];
            if(s.contains(".")){
                max_length = Math.max(max_length,cur_len -1);
            }
        }
        return max_length;
        
    }
}
