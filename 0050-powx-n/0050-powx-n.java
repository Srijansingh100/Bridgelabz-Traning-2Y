class Solution {
    public double myPow(double x, int n) {
        int p=n;
        boolean isneg=n<0?true:false;
        p=isneg? -1*p: p;
        double result = pow(x,n);
        if(isneg ){
            return 1/result;
        }
        else{
            return result;
        }

    }
        
    public static double pow(double x,long n){
        if(n==0){
            return 1;
        }

        double ans=pow(x,n/2);

       
        if(n%2==0){
            return ans*ans;
        }
        else{
            return x*ans*ans;
        }

        
        
    }
}