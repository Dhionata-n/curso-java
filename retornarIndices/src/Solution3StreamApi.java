import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution3StreamApi {
    public int[] solution3(int[] nums, int target) {
        Map<Integer,Integer> dictValues = (Map<Integer,Integer>)
                IntStream.range(0, nums.length).map(i -> i)
                        .collect(HashMap<Integer,Integer>::new,
                                (m,i)->m.put(nums[i], i),
                                Map::putAll);
        for (int i=0; i<nums.length; i++) {
            int complemento = target - nums[i];
            if (dictValues.containsKey(complemento)
                    && dictValues.get(complemento) != i) {
                return new int [] {i,dictValues.get(complemento)};
            }
        }
        return null;
    }
}
