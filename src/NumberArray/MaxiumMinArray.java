package NumberArray;

public class MaxiumMinArray {

	public static void main(String[] args) {
		int maximum = Integer.MIN_VALUE;
		int minimum = Integer.MAX_VALUE;
		int arr[] = {9,-8,8,11,7,3,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maximum)
			{
				maximum = arr[i];
			}
			else if(arr[i]<minimum)
			{
				minimum = arr[i];
			}
		}
		System.out.println(maximum);
		System.out.println(minimum);
	}

}
