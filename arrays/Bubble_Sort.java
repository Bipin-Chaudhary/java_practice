package arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,7,8,1};
		int n=arr.length;
		System.out.println(n);
		int temp=0;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		for(int index:arr)
		{
			System.out.println(index);
		}
		
		
		
		
	}

}
