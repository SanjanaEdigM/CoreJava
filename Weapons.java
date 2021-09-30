class Weapons{
  public static void main(String[] a){
      
      String name[]={"gun","bomb","tank"};
      System.out.println(name[2]);
      name[1]="submarine";
      System.out.println(name[1]);
      System.out.println(name[0]);

   System.out.println(name.length);

for(int type=0;type<name.length;type++)
{
System.out.println(name[type]);
}

      
/*  String []typeofgun= new String[10];
	typeofgun[1]="automatic";
	typeofgun[5]="short gun";
	System.out.println(typeofgun.length);
	for(int type=0;type<typeofgun.length;type++)
	{
	System.out.println(typeofgun[type]);
	}

	System.out.println(typeofgun[1]);
	System.out.println(typeofgun[5]);
	System.out.println(typeofgun[6]);

	}
}/*