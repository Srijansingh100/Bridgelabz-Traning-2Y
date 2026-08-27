class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int cnt=0;
        for(String w:words)
        {
            boolean flag=true;
            for(int i=0;i<w.length();i++)
            {
                if(allowed.indexOf(w.charAt(i))==-1) 
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true) cnt++;
        }
        return cnt;
    }
}