package TestCases;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {6,1,3,0,7,9};
System.out.println(min(input));
	}

	
	
	public static int min(int[] arr)
	{
		int min = arr[0];
		int min2=arr[1];
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			else if (arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		return min2;
		
	}
}
