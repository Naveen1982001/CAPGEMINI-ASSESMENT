
public class Program1 {

	static int percentage(float p ,int t)
	{
		float per=(p/t)*100;
		return (int)per;		
	}
	
	static int profitLoss(int cp,int sp)
	{
		float profit=((sp-cp)/cp*100);
	     return (int) profit;
	}
	
	static int ci(float p,int r,int t)
	{
		float CI= p* ((1 + r / 100)*t);
		return (int) CI;
	}
	
	static void rectangle(int l,int b)
	{
		int rect=l*b  ;
		System.out.println("The Rectangle Ans="+ rect);
	}
	
	static void distance(int time,int speed)
	{
		int dis=(time*speed) ;
		System.out.println("The Distances Ans="+ dis);
	}
	
	public static void main(String[] args) {
		
		System.out.println("The percentage Ans="+ percentage(10,20));
		System.out.println("The ProfitLoss Ans="+profitLoss(100,700));
		System.out.println("The CompoundInterest Ans="+ci(1600,5,2));
		rectangle(12,5);
		distance(10,40);
		
		
		
	}

}
