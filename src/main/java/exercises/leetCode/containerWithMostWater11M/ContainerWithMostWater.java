package exercises.leetCode.containerWithMostWater11M;

public class ContainerWithMostWater {

    //Time Limit Exceeded
    public static int maxArea(int[] height){
        int maxArea = 0;

        int arrayLength = height.length;
        for (int i = 0; i < arrayLength -1; i++) {
            int localMax = 0;
            for (int j = i+1; j < arrayLength; j++) {
                int currentSize = Math.min(height[i], height[j]) * (j - i);
                localMax = Math.max(currentSize, localMax);
            }
            maxArea = Math.max(localMax, maxArea);
        }

        return maxArea;
    }
}
