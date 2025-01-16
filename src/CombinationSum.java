import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinationsList = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), combinationsList);
        return combinationsList;
    }

    private void findCombinations(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> combinationsList) {
        if (target == 0) {

            combinationsList.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {

                currentCombination.add(candidates[i]);

                findCombinations(candidates, target - candidates[i], i, currentCombination, combinationsList);

                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}