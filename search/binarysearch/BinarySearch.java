import java.util.Random;
import java.lang.RuntimeException;


class BinarySearch 
{

  public static void main(String[] args) {

    int[] arrTest  = {1,2,3,4,5,6,7,8,9,10};
    int target = 4; 

    try {
      assert binarySearch(target, arrTest) == true;
      assert binarySearch(-1, arrTest) == false;
      binarySearch(target, null); //Expected Exception case
    } catch (Exception e) {
      System.out.println(e);  
    }

  }


  /**
   * @param target An integer that is searched for in the array
   * @param array An array to be searched (note: this array MUST be sorted)
   * @throws RuntimeException if the given array is null
   * @return A boolean describing if the target is found in the array
   */
  public static boolean binarySearch(int target, int[] array) throws Exception {
    if (array == null)
      throw new RuntimeException("Error, search array given is null");

    return binarySearchHelper(target, array, 0, array.length-1);
  }


  /**
   * @param target An integer that is searched for in the array
   * @param array An array to be searched (note: this array MUST be sorted)   
   * @param leftIndex A left comparison index used for search
   * @param rightIndex A right comparison index used for each
   * @returns A boolean describing if the target is found in the array
   */
  private static boolean binarySearchHelper(int target, int[] array, int leftIndex, int rightIndex) {

    // base recursive case
    if (leftIndex > rightIndex)
      return false;

    int midIndex = leftIndex + (rightIndex - leftIndex)/2;

    if(target == array[midIndex]) 
      return true;

    if(target < array[midIndex]) {
      return binarySearchHelper(target, array, leftIndex, midIndex-1);
    } else {
      return binarySearchHelper(target, array, midIndex+1, rightIndex);
    }
  }

}
