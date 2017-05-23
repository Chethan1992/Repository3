enum day
{
monday,tuesday,wednesday,thursday,friday
}
String info;

day(String a){info=a;}



class testenum
{
	public static void main(String arg[])
		{
			day d=day.monday;
			System.out.println(d.info);
			System.out.println(d);
			testenum t=new testenum();
			d=day.wed;
			t.predict(d);

		}

	public void predict(day d)
		{

	switch(d)
		{
	case mon: 			System.out.println(d.info);break;
	case tue: 			System.out.println(d.info);break;
	case wed: 			System.out.println(d.info);break;
	case thur: 			System.out.println(d.info);break;
	case fri: 			System.out.println(d.info);break;

	default: 	System.out.println("invalid");
		}

		}
}