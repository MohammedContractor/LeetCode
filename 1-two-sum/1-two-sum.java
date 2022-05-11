class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int finalNum[]=new int[2];
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {   
                if(nums[i]+nums[j]==target)
                {      
                    finalNum[0]=i;
                    finalNum[1]=j;
                }
            }
        }
        return finalNum;
    }
    public static void main(String...args)
    {
        int i=0;
        int j=0;
        int[] nums = new int[]{2,7,11,15};
        int target=9;
        int retNum[]= twoSum(nums,target);
        System.out.println("Because nums " + retNum[i] + " + " + retNum[j] + " == 9");
    }
}