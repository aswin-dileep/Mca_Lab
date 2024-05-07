class cpu
{
	float price;
	cpu(float p)
	{
		price=p;
	}
	class processor
	{
		int noofcores;
		String manufacturer;
		processor(int c,String m)
		{
			noofcores=c;
			manufacturer=m;
		}
		void pdisplay()
		{
			System.out.println("no of cores: "+noofcores);
			System.out.println("processor manufacturer: "+manufacturer);
		}
	}
	static class ram
	{
		String memory;
		String manufacturer;
		ram(String m,String n)
		{
			memory=m;
			manufacturer=n;
		}
		void rdisplay()
		{
			System.out.println("memory:"+memory);
			System.out.println("ram manufacturer:"+manufacturer);
		}
	}
	void display()
	{
		System.out.println("price:"+price);
	}
}
class cpumain
{
	public static void main(String arg[])
	{
		cpu c=new cpu(150);
		c.display();
		cpu.processor p=c.new processor(3,"Intel");
		p.pdisplay();
		cpu.ram r=new cpu.ram("6gb","Samsung");
		r.rdisplay();
	}
}
