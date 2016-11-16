public class Solution {
    public int reverse(int x) {
        if(x%10==x) return x;
        if(x==Integer.MAX_VALUE||x==Integer.MIN_VALUE) return 0;
        long newInt=0;
        boolean factor=true;
        if(x<0){
            factor=false;
            x=x*-1;
        }
        while(x>=10)
        {
        newInt=newInt*10+x%10;
        x/=10;
        }
        newInt=newInt*10+x%10;
        
        if (factor==false)
        {
            newInt*=-1;
        }
        if(newInt>Integer.MAX_VALUE||newInt<Integer.MIN_VALUE) return 0;
    return (int)newInt;
}
}