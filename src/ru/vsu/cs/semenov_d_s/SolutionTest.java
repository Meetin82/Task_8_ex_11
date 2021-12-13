package ru.vsu.cs.semenov_d_s;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.semenov_d_s.utils.ArrayUtils;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testSolution1() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput1.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput1.txt");
        int[][] factualResult = solution.rotateArrayNinetyDegrees(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testSolution2() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput2.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput2.txt");
        int[][] factualResult = solution.rotateArrayNinetyDegrees(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testSolution3() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput3.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput3.txt");
        int[][] factualResult = solution.rotateArrayNinetyDegrees(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testSolution4() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput4.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput4.txt");
        int[][] factualResult = solution.rotateArrayNinetyDegrees(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testSolution5() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput5.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput5.txt");
        int[][] factualResult = solution.rotateArrayNinetyDegrees(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }
}
