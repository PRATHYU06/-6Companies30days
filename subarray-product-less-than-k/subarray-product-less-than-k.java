class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int begin = 0, end = 0, product = 1, ans = 0;
        while(end < nums.length) {
            product *= nums[end++]; 
            while(product >= k && begin < end)
                product /= nums[begin++];
            ans += end - begin; 
        }
        return ans;
        
    }
}