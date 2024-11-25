package exercises.leetCode.containerWithMostWater11M;

public class ContainerWithMostWater {

    public static int maxAreaWithPointers(int[] height) {
        int pointerRight = height.length - 1;
        int pointerLeft = 0;
        int maxArea = 0;

        while(pointerLeft != pointerRight){
            int currentSize = Math.min(height[pointerLeft], height[pointerRight]) * (pointerRight - pointerLeft);
            maxArea = Math.max(maxArea, currentSize);
            if(height[pointerLeft] > height[pointerRight]){
                pointerRight--;
            } else {
                pointerLeft++;
            }
        }

        return  maxArea;
    }

    //Time Limit Exceeded
    public static int maxAreaInitialIdea(int[] height) {
        int maxArea = 0;

        int arrayLength = height.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int localMax = 0;
            for (int j = i + 1; j < arrayLength; j++) {
                int currentSize = Math.min(height[i], height[j]) * (j - i);
                localMax = Math.max(currentSize, localMax);
            }
            maxArea = Math.max(localMax, maxArea);
        }

        return maxArea;
    }
}
