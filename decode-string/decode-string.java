class Solution {
    int index = 0;
    public String decodeString(String s) {
    StringBuilder result = new StringBuilder();
        
            while(index < s.length() && s.charAt(index) != ']'){
             if(!Character.isDigit(s.charAt(index))){
                 result.append(s.charAt(index++));
             }else{
                 int k = 0;
                 while(index < s.length() && Character.isDigit(s.charAt(index)))
                     k = k*10 + s.charAt(index++) - '0';
                     index++;
                     String decodedstring = decodeString(s);
                     index++;
                     while(k-- > 0)
                         result.append(decodedstring);
                 }
          }
        return new String(result);
    }
}
            
        
    
