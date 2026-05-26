class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int i = 0;
       int j = numbers.length-1;
       ArrayList<Integer> arr = new ArrayList<>();
       int[] res = new int[2];
       while(i<j) {
        int sum = numbers[i]+numbers[j];
        if(sum==target){
            arr.add(i+1);
            arr.add(j+1);
            res[0] = arr.get(0);
            res[1] = arr.get(1);
            return res;
        } else if(sum<target) {
            i++;
        }
        else {
            j--;
        }
       }
       return res;
    }
}
