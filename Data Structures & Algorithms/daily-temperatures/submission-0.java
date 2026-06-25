class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // brute force to iterate through each temperature 
        // and increment the number of temp
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int numberOfDays = 0;
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    numberOfDays = j - i;
                    break;
                }
            }
            result[i] = numberOfDays;
        }

        return result;

        // 

    }
}
