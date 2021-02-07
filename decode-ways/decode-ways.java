class Solution {
    
    Map<Integer,Integer> hmp = new HashMap<>();
    
    public int numDecodings(String s) {
        return recursivecall(0,s);
    }
    
    public int recursivecall(int index, String str){
        
        if(hmp.containsKey(index)){
            return hmp.get(index);
        }
        
        if(index == str.length()){
            return 1;
        }
        
        
        
        if(str.charAt(index) == '0'){
            return 0;
        }
        
        if(index == str.length() - 1){
            return 1;
        }
        
        int ans = recursivecall(index+1,str);
        
            if(Integer.parseInt(str.substring(index,index + 2))<=26){
                ans += recursivecall(index+2,str);
            }
        
        hmp.put(index,ans);
        
        return ans;
    }
}