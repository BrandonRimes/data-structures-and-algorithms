public class insertShiftArray
{
  static int[] insertShiftArray(int[] arr, int num)
  {
    int newArrL = arr.length +1;
    int[] newArr = new int[newArrL];
    for (int i = 0; i < newArrL; i++)
    {
      if (i < newArrL /2)
      {
        newArr[i] = arr[i];
      } else if (i == newArrL /2)
      {
        newArr[i] = num;
      } else
      {
        newArr[i] = arr[i -1]
      }
    }
    return newArr;
  }

  public static void main(String[] args)
  {
    System.out.println("hey");
  }
}