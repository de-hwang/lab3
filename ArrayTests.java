import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input2 = {4, 5, 6};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{6, 5, 4}, input2);
  }

  @Test
  public void testReverseInPlace3() {
    int[] input3 = {4, 5, 6, 7, 8};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{8, 7, 6, 5, 4}, input3);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = {5, 6, 7, 9};
    assertArrayEquals(new int[]{9, 7, 6, 5}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversed3() {
    int[] input3 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input3));
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] arr = {0.0, 0.0, 1.0, 2.0, 3.0, 4.0};
    assertEquals(true, ArrayExamples.averageWithoutLowest(arr) == 2.5);
  }
}
