class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Set<Integer>s=new HashSet<>();
        for(int x:nums) {
            boolean y=s.add(x);
            if(!y)
            ans.add(x);
        }
        return ans;
    }
}
