class Solution {
    public boolean isValid(String s) {
        
        boolean ans = false;
       // int count = 0;
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        
        if(s.equals("")) {
            ans=true;
        }
        
        if(s.length()%2!=0){
            return false;
        }
            
      Stack st = new Stack();
        
      for(int i =0;i < s.length();i++){
          
          if(hm.values().contains(s.charAt(i))){
              st.push(s.charAt(i));
          }
          
          if(hm.keySet().contains(s.charAt(i))){
              if((st.size()> 0) && ((st.peek().equals(hm.get(s.charAt(i))))))
                  st.pop();
              else
            	 return false;
              
          }
         
      }
        if(st.size()==0)
            ans = true;
      
        return ans;
        
    }
}