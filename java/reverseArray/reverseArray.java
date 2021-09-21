public class reverseArray
{
  static int[] reverseArray(int[] arr)
  {
    int[] arr2 = new int[arr.length];

    for (int i = 0; i < arr.length; i++)
    {
      arr2[(arr.length -1) - i] = arr[i];
    }

    return arr2;
  }

  static int[] testArr = {1,2,3,4,5,6};

  static int[] reversedArr = reverseArray(testArr);

  public static void main(String[] args)
  {
    System.out.println("Hello World!");
    for(int i : reversedArr)
    {
      System.out.println(i);
    }
  }
}