import java.util.Random;
import java.lang.RuntimeException;


class BinarySearch 
{

  public static void main(String[] args) {

    int[] arrTest  = {1,2,3,4,5,6,7,8,9,10};
    int target = 4; 

    assert binarySearch(target, arrTest) != -1;
    assert binarySearch(-1, arrTest) == -1;
    assert binarySearch(target, null) == -1;
  }


  /**
   * @param target An integer that is searched for in the array
   * @param array An array to be searched (note: this array MUST be sorted)
   * @return An integer describing the target value's location in the array, -1 if it is not found
   */
  public static int binarySearch(int target, int[] array) throws Exception {
    if (array == null)
      return -1;

    return binarySearchHelper(target, array, 0, array.length-1);
  }


  /**
   * @param target An integer that is searched for in the array
   * @param array An array to be searched (note: this array MUST be sorted)   
   * @param leftIndex A left comparison index used for search
   * @param rightIndex A right comparison index used for each
   * @return An integer describing the target value's location in the array, -1 if it is not found
   */
  private static int binarySearchHelper(int target, int[] array, int leftIndex, int rightIndex) {

    // base recursive case
    if (leftIndex > rightIndex)
      return -1;

    int midIndex = leftIndex + (rightIndex - leftIndex)/2;

    if(target == array[midIndex]) 
      return midIndex;

    if(target < array[midIndex]) {
      return binarySearchHelper(target, array, leftIndex, midIndex-1);
    } else {
      return binarySearchHelper(target, array, midIndex+1, rightIndex);
    }
  }

}
