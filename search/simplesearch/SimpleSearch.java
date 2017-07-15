import java.util.Random;
import java.lang.RuntimeException;


class SimpleSearch
{
  public static void main(String[] args) {

    int[] arrTest  = {1,2,3,4,5,6,7,8,9,10};
    int target = 4; 

    assert simpleSearch(target, arrTest) == true;
    assert simpleSearch(-1, arrTest) == false;
    assert simpleSearch(target, null) == -1; //Expected Exception case
  }


  /**
   * @param target An integer that is searched for in the array
   * @param array An array
   * @return An integer describing the target's location in the array, -1 if it is not found 
   */
  public static boolean simpleSearch(int target, int[] array) throws Exception {
    if (array == null)
      return -1;

    for (int i = 0; i < array.length; i++)
      if (array[i] == target)
        return i; 
    }

    return -1;
  }

}
