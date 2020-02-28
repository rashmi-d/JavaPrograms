package NumberArray;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {8,9,0,-8,10,89};
		int n = arr.length;
		
		for(int i = 0;i<n;i++)
			for(int j=i+1;j<n;j++)
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
