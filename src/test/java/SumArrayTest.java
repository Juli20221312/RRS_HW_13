import org.testng.Assert;
import org.testng.annotations.Test;
import school.redrover.SumArray;

import static school.redrover.SumArray.sumArray;

public class SumArrayTest {
    @Test
    public void testSumArray(){
//        System.out.println(sumArray(new int[]{1,2,3,4,5}) == 15);
//        System.out.println(sumArray(new int[]{0}) == 0);
//        System.out.println(sumArray(new int[]{-1,-2,-3,4,5}) == 3);
//        System.out.println(sumArray(new int[]{-1,-2,-3,-4,-5}) == - 15);
        int[] arr = {1,2,3,4,5};
        int expectedSum = 15;
        int actualSum = SumArray.sumArray(arr);
        Assert.assertEquals(expectedSum, actualSum);
    }
}
