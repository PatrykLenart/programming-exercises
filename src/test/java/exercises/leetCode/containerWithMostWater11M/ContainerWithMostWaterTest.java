package exercises.leetCode.containerWithMostWater11M;

import org.junit.jupiter.api.Test;

import static exercises.leetCode.containerWithMostWater11M.ContainerWithMostWater.maxAreaWithPointers;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    @Test
    public void containerHasOnlyTwoWalls(){
        //Given
        int[] container = new int[]{1,1};
        //When
        int ans = maxAreaWithPointers(container);
        //Then
        assertEquals(1,ans);
    }

    @Test
    public void smallContainerHappyPathSolution(){
        //Given
        int[] container = new int[]{1,8,6,2,5,4,8,3,7};
        //When
        int ans = maxAreaWithPointers(container);
        //Then
        assertEquals(49,ans);
    }

}