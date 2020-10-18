package jyothi prakash;

public class Odd 
{

	public static void main(String[] args) 
	{
		Integer[] odd= {10,21,25,40,58,97};
		indeger t1 =new indeger();
		System.out.println("Elements are ");
		for(int a:odd)
		{
		System.out.println(a);
		}
		t1.oddcheck(odd);	
		
		t1.exchange(odd,0,5);
		System.out.println("After exchange ");
		for(int a:odd)
		{
		System.out.println(a);
		}
		
		System.out.println("the maximum No. in the list is ");
		t1.maxi(odd, 0);
	
	}	
}


class indeger
{
	public <T extends Number> void oddcheck(T[] i)
	{
		int count=0;
		for(int i1=0;i1<6;i1++)
		{
			if(i[i1].intValue()%2!=0)
				count++;
		}
		
		System.out.println("No. of odd Numbers in the list "+count);
	}
	
	public <T>void exchange(T[]i,int s,int e)
	{
		T temp=i[s];
		i[s]=i[e];
		i[e]=temp;
	}
	
	public <T extends Number> void maxi(T[]i,int s)
	{
		int max=i[s].intValue();
		for(int i1=1;i1<6;i1++)
		{
			if(max<i[i1].intValue())
				max=i[i1].intValue();	
		}
		System.out.println(max);
	}


}
