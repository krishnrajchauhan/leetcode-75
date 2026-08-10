class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // 1. Calculate the max value ONCE before the loop starts
        int maxCandies = Arrays.stream(candies).max().getAsInt(); 

        int i = 0;
        int size = candies.length;

        // 2. Loop through the array and compare using the pre-calculated max
        while(i < size) {
            if(candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
            i++;
        }
        return result;
    }
}
