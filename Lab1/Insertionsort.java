

public class Insertionsort implements SortStrategy{

	public void getSortTime(long[] num)
{
		long startTime = System.currentTimeMillis();
		
		for (int i=1; i< num.length; i++)
		{
		long index = num[i]; int j = i;
		while (j > 0 && num[j-1] > index)
		{
		num[j] = num[j-1];
		j--;
		}
		num[j] = index;
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Insertionsort time is "+totalTime+" Milliseconds");
		}
}
