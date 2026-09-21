class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int i, int[] candidates, int target, List<Integer> curr, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1])
                continue;

            if (candidates[j] > target)
                break;

            curr.add(candidates[j]);
            solve(j + 1, candidates, target - candidates[j], curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}