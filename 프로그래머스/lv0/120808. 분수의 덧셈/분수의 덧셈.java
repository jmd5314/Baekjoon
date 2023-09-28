class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1*denom2+numer2*denom1;
        int denom = denom1*denom2;
        int result[] = {num,denom};
        int gdiv = gcd(num,denom);
        result[0] /=gdiv;
        result[1] /= gdiv;
        return result;
        
    }
     public int gcd(int a, int b){
        if(b==0) return a;
        else
            return gcd(b,a%b);
    }
}
