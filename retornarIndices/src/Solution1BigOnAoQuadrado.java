public class Solution1BigOnAoQuadrado {

    public int [] solution1(int []nums, int target){
        for(int i =0;i<nums.length;i++){
            int complemento = target - nums[i];
            for(int j =0; j<nums.length;j++){
                if(complemento==nums[j]){
                    if (complemento!=nums[i]){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return null;
    }

}
