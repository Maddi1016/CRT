class shape
{
	double d1,d2,d3;
	void area()
	{		
		System.out.println("area method of shape");
	}
}	
class circle extends shape
{
	circle(double r)
	{
		d1=r;
	}
	void area()
	{
		double c=3.14*d1*d1;
		System.out.println("area ofcircle="+c);
		
	}
}
class rectangle extends shape
{
	rectangle(double l,double b)
	{
		d1=l;
		d2=b;
	}
	void area()
	{
		double a=d1*d2;
		System.out.println("area of rectangle="+a);
	}
}
class box extends shape
{
	box(double l,double b,double h)
	{
		d1=l;
		d2=b;
		d3=h;
	}
	void area()
	{
		double b=d1*d2*d3;
		System.out.println("area of box="+b);
	}
}
class sdemo
{
	public static void main(String [] args)
	{
		shape s=new shape();
		s=new circle(10);
		s.area();
		s=new rectangle(10,20);
		s.area();
		s=new box(10,20,30);
		s.area();
	}
}