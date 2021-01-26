class Solution {
    public boolean isRobotBounded(String instructions) {
        if(instructions.length() == 1){
        return false;
    }
    
    
    int x =0;
    int y =0;
    int dir = 0;
    for(int i =0;i<instructions.length();i++){
        char ch = instructions.charAt(i);
        if(ch == 'R')
        {
            dir = (dir + 1) % 4;
            continue;
        }
        if(ch == 'L'){
            dir = (4+(dir-1))%4;
            continue;
        }
        if(dir == 0){
            y++;
        }
        if(dir == 1){
            x++;
        }
        if(dir == 2){
            y--;
        }
        if(dir == 3){
            x--;
        }
    }
    
    
    if(dir != 0  || ( x == 0 && y == 0 )){
        return true;
    }else{
        return false;
    }
    }
}
