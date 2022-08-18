class Solution {
    public int maxUniqueSplit(String s) 
    {
        Set<String> set=new HashSet<>();
        return helper(s,0,set);
    }
    
    public int helper(String s,int idx,Set<String> set)
    {
        if(idx>=s.length())
        return 0;
        
        int ans=0;
        
        for(int i=idx;i<s.length();i++)
        {
            if(set.contains(s.substring(idx,i+1)))
            continue;
            
            set.add(s.substring(idx,i+1));
            ans=Math.max(ans,1+helper(s,i+1,set));
            set.remove(s.substring(idx,i+1));
            
        }
        
        return ans;
    }
}