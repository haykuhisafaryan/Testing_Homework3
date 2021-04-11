import org.junit.Test;

import static org.junit.Assert.*;

public class StatisticsTest {
    @Test
    public void frequencyOfElement(){
        //Arrange
        int arr[] = new int[]{ 1,4,3,4};
        //Act
        int result =  Statistics.findFrequency(arr,4);
        //Assert
        assertEquals(2,result);
    }

    @Test
    public void relativeFrequencyOfElementPos(){
        //Arrange
        int arr[] = new int[]{ 1,4,3,4};
        //Act
        double result =  Statistics.findRelativeFrequency(arr,4);
        //Assert
        assertEquals(0.5,result, 0.0001);

    }
    @Test
    public void relativeFrequencyOfElementNeg(){
        //Arrange
        int arr[] = new int[]{};
        //Act
        double result =  Statistics.findRelativeFrequency(arr,4);
        //Assert
        assertEquals(-2.147483648E9,result, 0.0001);
    }
    @Test
    public void findMedianOfArrayPos(){
        //Arrange
        int arr[] = new int[]{ 2,0,2,0,2,2,3,5,3,5};
        //Act
        double result =  Statistics.findMedian(arr);
        //Assert
        assertEquals(2,result, 0.0001);
    }
    @Test
    public void findMedianOfArrayNeg(){
        //Arrange
        int arr[] = new int[]{1,2,3};
        //Act
        double result =  Statistics.findMedian(arr);
        //Assert
        assertEquals(2,result, 0.0001);
    }
    @Test
    public void findMeanOfArrayPos(){
        //Arrange
        int arr[] = new int[]{ 2,0,2,0,2,2,3,5,3,5};
        //Act
        double result =  Statistics.findMean(arr);
        //Assert
        assertEquals(2.4,result, 0.0001);

    }
    @Test
    public void findMeanOfArrayNeg(){
        //Arrange
        int arr[] = new int[]{};
        //Act
        double result =  Statistics.findMean(arr);
        //Assert
        assertEquals(-2.147483648E9,result, 0.0001);
    }

    @Test
    public void findTrimmedMeanOfArrayPos(){
        //Arrange
        int arr[] = new int[]{ 2,0,2,0,2,2,3,5,3,5};
        //Act
        double result =  Statistics.findTrimmedMean(arr,0.25);
        //Assert
        assertEquals(2.33333,result, 0.0001);
    }
    @Test
    public void findTrimmedMeanOfArrayNeg(){
        //Arrange
        int arr2[] = new int[]{1,2,3};
        //Act
        double result =  Statistics.findTrimmedMean(arr2,0.9);
        System.out.println(  result);
        //Assert
        assertEquals(-2.147483648E9,result, 0.0001);
    }
    @Test
    public void findWinsoizedMeanOfArrayPos(){
        //Arrange
        int arr[] = new int[]{ 2,0,2,0,2,2,3,5,3,5};
        //Act
        double result =  Statistics.findWinsoizedMean(arr,0.25);
        //Assert
        assertEquals(2.4,result, 0.0001);
    }
    @Test
    public void findWinsoizedMeanOfArrayNeg(){
        //Arrange
        int arr[] = new int[]{1,2,3};
        //Act
        double result =  Statistics.findWinsoizedMean(arr,0.9);
        //Assert
        assertEquals(-2.147483648E9,result, 0.0001);
    }
}
