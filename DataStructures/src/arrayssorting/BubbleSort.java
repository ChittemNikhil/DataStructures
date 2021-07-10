package arrayssorting;

public class BubbleSort {

	public void Sort(int[] intArray)
	{
	
		/* for (int Index = intArray.length - 1; Index > 0;Index--) {
	            for (int i = 0; i < Index; i++) {
	                if (intArray[i] > intArray[i + 1]) {
	                	int temp = intArray[i];
						intArray[i] = intArray[i+1];
						intArray[i+1] = temp;
	                }
	            }
	        }

	        for (int i = 0; i < intArray.length; i++) {
	            System.out.println(intArray[i]);
	        }
	}*/
		
		int length = intArray.length-1;
		
		for(int Index = 0;Index < length;Index++)
		{
			for(int i = 0;i < length-Index;i++)
			{
				if(intArray[i]<intArray[i+1])
				{
					int temp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = temp;
				}
			}
		}
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] array = {9,8,19,4,7,10,55};
		
		BubbleSort b = new BubbleSort();
		b.Sort(array);
		
		
	
		
	}
}