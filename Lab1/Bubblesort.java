public class Bubblesort implements SortStrategy{

	public void getSortTime(long[] num)
{
		long startTime = System.currentTimeMillis();
for (int i = (num.length - 1); i >= 0; i--)
{
for (int j = 1; j <= i; j++)
{
if (num[j-1] > num[j])
{
long temp = num[j-1];
num[j-1] = num[j];
num[j] = temp;
}
}
}
long endTime = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println("Bubblesort time is "+totalTime+" Milliseconds");
}
}