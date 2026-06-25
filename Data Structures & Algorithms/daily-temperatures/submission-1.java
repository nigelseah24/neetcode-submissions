class Solution {
    class TempDay {
        int temp;
        int day;

        public TempDay (int temp, int day) {
            this.temp = temp;
            this.day = day;
        }

        public int getTemp() {
            return this.temp;
        }

        public int getDay() {
            return this.day;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        // brute force to iterate through each temperature 
        // and increment the number of temp
        // int[] result = new int[temperatures.length];

        // for (int i = 0; i < temperatures.length; i++) {
        //     int numberOfDays = 0;
        //     for (int j = i; j < temperatures.length; j++) {
        //         if (temperatures[j] > temperatures[i]) {
        //             numberOfDays = j - i;
        //             break;
        //         }
        //     }
        //     result[i] = numberOfDays;
        // }

        // return result;

        // we can do better! (stack)
        // store in stack until next temp > top of stack
        int[] result = new int[temperatures.length];

        ArrayDeque<TempDay> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            // pop stack and compute day diff while temp > top of stack
            while (stack.size() != 0 && temperatures[i] > stack.peek().getTemp()) {
                // [2,1,1], temp = 3 (i=4)
                // pop
                TempDay popped = stack.pop();
                System.out.println("popped day: " + popped.getDay());
                System.out.println("popped temp: " + popped.getTemp());
                int diffInDays = i - popped.getDay();
                result[popped.getDay()] = diffInDays;
            }

            TempDay tempToIndexMap = new TempDay(temperatures[i], i);
            stack.push(tempToIndexMap);
            System.out.println("tempDay day: " + tempToIndexMap.getDay());
            System.out.println("tempDay temp: " + tempToIndexMap.getTemp());
            System.out.println("top stack temp: " + stack.peek().getTemp());
        }

        return result;


    }
}
