package NewYearGift;
public class AddObjects {
	float ca[]=new float[100];
	int len1=0,len2=0;
	public void addChocolates(float c)
	{
		ca[len1++]=c;
	}
	float sw[]=new float[100];
	public void addSweets(float s)
	{
		sw[len2++]=s;
	}
	public void sort()
	{
		for(int i=0;i<len1-1;i++)
		{
			for(int j=0;j<len1-i-1;j++)
			{
				if(ca[j]>ca[j+1])
				{
					float temp=ca[j];
					ca[j]=ca[j+1];
					ca[j+1]=temp;
				}
			}
		}
	}
	public void displaysw()
	{
		System.out.println("Sweets price in between 0 to 1000\n ");
		for(int i=0;i<len2;i++)
		{
			if(sw[i]<1000)
			{		
			    System.out.print(sw[i]);
			}
			else
				System.out.println("Sorry ur limit exceeded");
		}
		System.out.println();
	}

}
