class Solution {
    public boolean canArrange(int[] arr, int k) {
       int len = arr.length;
    int[] record = new int[k];
    for(int i = 0; i < len; i++){
        int mod = (arr[i] % k + k) % k;
        record[mod]++;
    }
    if(record[0] % 2 != 0){
        return false;
    }
    for(int i = 1; i <= k / 2; i++){
        if(record[i] != record[k - i]){
            return false;
        }
    }
    return true;
}
}
