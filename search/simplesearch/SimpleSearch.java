import java.util.Random;
import java.lang.RuntimeException;


class SimpleSearch
{
  public static void main(String[] args) {

    int[] arrTest  = {1,2,3,4,5,6,7,8,9,10};
    int target = 4; 

    try {
      assert simpleSearch(target, arrTest) == true;
      assert simpleSearch(-1, arrTest) == false;
      simpleSearch(target, null); //Expected Exception case
    } catch (Exception e) {
      System.out.println(e);  
    }
  }


  /**
   * @param target An integer that is searched for in the array
   * @param array An array
   * @throws RuntimeException if the given array is null
   * @return A boolean if the target is found in the array
   */
  public static boolean simpleSearch(int target, int[] array) throws Exception {
    if (array == null)
      throw new RuntimeException("Error, search array given is null");
   
    for (int val : array) {
      if (val == target)
        return true;
    }

    return false;
  }

}
