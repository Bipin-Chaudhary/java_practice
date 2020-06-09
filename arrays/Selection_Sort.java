package arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		
		int[] a = {7,3,1,2,5};
		int temp;
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min = j;
				}
			}
			
			
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
		
		
		for(int items: a)
		{
			System.out.println(items);
		}
		

	}

}
