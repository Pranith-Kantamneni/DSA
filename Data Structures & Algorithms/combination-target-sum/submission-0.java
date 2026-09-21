class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(0,candidates,target,curr,ans);
        return ans;
    }

    public void solve(int i,int[] candidates, int target,List<Integer> curr,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(i==candidates.length || target<0)return;

        solve(i+1,candidates,target,curr,ans);

        curr.add(candidates[i]);
        solve(i,candidates,target-candidates[i],curr,ans);
        curr.remove(curr.size()-1);
    }
}