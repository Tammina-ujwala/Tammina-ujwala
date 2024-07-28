class Base
{
	int a,b;
	Base(int a,int b)
	{
        this.a=a;
		this.b=b;
	}
	Void display()
	{
		System.out.println("this is base");
  		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Base
{
	Child()
	{
		super(10,20);
	}
}
class simpleInhertances
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
	}
}
