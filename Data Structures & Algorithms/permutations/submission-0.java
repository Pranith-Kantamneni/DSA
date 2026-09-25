class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        boolean[] used = new boolean[n];
        solve(ans,new ArrayList<>(),nums,used);
        return ans;
    }

    public void solve(List<List<Integer>> ans,List<Integer> curr,int[] nums,boolean[] used){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;            
        }

        for(int j=0;j<nums.length;j++){
            if(used[j])continue;
            
            curr.add(nums[j]);
            used[j] = true;
            solve(ans,curr,nums,used);

            curr.remove(curr.size()-1);
            used[j] = false;

        }


    }
}
