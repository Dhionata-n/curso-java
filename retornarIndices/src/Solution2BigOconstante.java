import java.util.HashMap;
import java.util.Map;

public class Solution2BigOconstante {
    public int [] solution2(int []nums, int target){
        Map<Integer, Integer> valores = new HashMap<Integer, Integer>();
        for(int i=0; i< nums.length;i++){
            valores.put(nums[i],i);
        }
        for(int i=0; i< nums.length;i++){
           int complemento = target -nums[i];
           if(valores.containsKey(complemento) && valores.get(complemento) != i){
               return new int []{i, valores.get(complemento)};

           }
        }
        return null;
    }
}
