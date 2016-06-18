/*********************************
  * Algorithm Practice
  * 
  * Author: Zane Page
  * Date: 3/3-7/26
  * 
  ********************************/
public class Sorting
{
  private int[] a;
   
   
  public Sorting(int[] array)
  {
    a = array;
  }
   
  public void selectionSort() {
    for (int i = 0; i < a.length-1; i++) {
      int min = i;
      for (int j = i+1; j < a.length; j++)
            if (a[j] < a[min]) {
               min = j;
             }
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
   }
  }
   
public void mergeSort()
  {
 
    if (a.length == 1) return;
     
 
    int[] leftHalf = new int[a.length / 2];
    for (int i = 0; i < leftHalf.length; i++)
      leftHalf[i] = a[i];
    int[] rightHalf = new int[a.length - leftHalf.length];
    for (int i = leftHalf.length, j=0;  i < a.length; i++, j++)
      rightHalf[j] = a[i];
     
    Merge2 sorter1 = new Merge2(leftHalf);
    Merge2 sorter2 = new Merge2(rightHalf);
     sorter1.mergeSort();
    sorter2.mergeSort();
    merge(leftHalf,rightHalf);
 
  }
 
    private void merge(int[] leftHalf, int[ ] rightHalf)
{
  
  int iLeft = 0;
  
  int iRight = 0;
 
  int j = 0;
 
  while(iLeft<leftHalf.length && iRight < rightHalf.length)
  {
    if (leftHalf[iLeft] < rightHalf[iRight])
    {
       a[j] = leftHalf[iLeft];
       iLeft++;
       }
      else
      {
        a[j] = rightHalf[iRight];
        iRight++;
      }
      j++;
      }
  for(int i = iLeft; i<leftHalf.length; i++)
        {
         a[j] = leftHalf[i];
         j++;
         }
  for(int i = iRight; i<rightHalf.length; i++)
        {
         a[j] = rightHalf[i];
         j++;
         }
}
   public void printArray(String word)
    {
    System.out.println(word);
      for(int i: a)
        System.out.print(i + " ");
      System.out.println();
    }
         
     
    public int sequentialSearch(int goal)
    {
     int j = 0;
     int ans = -1;
     while(j<a.length)
     {
      if(a[j]==goal)
      {
       ans = j;
       j=a.length;
      }
      else
      {
       j++; 
      }
     }
    return ans;
    }
     
    public void insertionSort()
  {
    int temp = 0;
    int pos = 0;
    // loop from second element on 
    for (int i = 1; i < a.length; i++)
    {
      // save current value at i and set position to i
      temp = a[i];
      pos = i;
      // shift right any larger elements
      while (0 < pos && temp < a[pos - 1])
      {
        a[pos] = a[pos - 1];
        pos--;
      }
      a[pos] = temp;
    }
  }
}
