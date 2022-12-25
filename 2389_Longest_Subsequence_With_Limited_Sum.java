class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);
       
        int answer[] = new int[queries.length];
        
        for (int i = 0; i < queries.length; ++i) {
            int count = 0;

            for (int num : nums) {
                if (queries[i] >= num) {
                    count++;
                    queries[i] -= num;
                }
                else {
                    break;
                }            
            }
            answer[i] = count;
        }
        return answer;
    }
}