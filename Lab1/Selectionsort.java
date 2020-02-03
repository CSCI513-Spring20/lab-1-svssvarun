
public class Selectionsort implements SortStrategy{

	public void getSortTime(long[] num)
{
		long startTime = System.currentTimeMillis();
		System.out.println("Length is "+num.length);
				for (int i = 0; i < num.length-1; i++)
		{
		int min = i;
		for (int j = i+1; j < num.length; j++)
		if (num[j] < num[min])
			min = j;
		long temp = num[i];
		num[i] = num[min];
		num[min] = temp;
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Selectionsort time is "+totalTime+" Milliseconds");
	}
} 