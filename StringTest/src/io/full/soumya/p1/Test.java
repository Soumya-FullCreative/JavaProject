package io.full.soumya.p1;

public class Test {

	public static void main(String[] args) {
	
		 //length and concat opertion
		 String s1="abc";
			String[] sa=new String[10];
		    String s2=s1.concat("bbc");
			String s6="P";
	
			String s7=s6+"q";
			String s8=s6+"";
			String s9="1234@*#A!";
			String s10=s9.toUpperCase();

			System.out.println(s1.length());
			System.out.println(sa.length);
		    System.out.println(s1);
			System.out.println(s2);
			System.out.println(s6);
			System.out.println(s7);
		    System.out.println(s8);

			System.out.println(s6==s7);
			System.out.println(s6==s8);
			System.out.println(s9);
			System.out.println(s10);

	//replace operation
			String s11="abc abc abc";
			String s12=s11.replace('b','A');
			String s13=s11.replace('a','b');
			String s14=s11.replace("ab","cb");
			 System.out.println(s11);
			  System.out.println(s12);
			   System.out.println(s13);
			  System.out.println(s14);

	     
	 //Trim()==only remove begin and end spaces
	       String s15="   abc   abc   abc  ";
		   String s16=s15.trim();

		   System.out.println(s15.length());
	       System.out.println(s16.length());
	       System.out.println(s16);

	//remove middle spaces use replace
	      String s17="  abc abc abc  ";
		  String s18=s17.replace(" ","");

		  System.out.println(s17.length());
		  System.out.println(s18.length());
		  System.out.println(s18);

	   //charAt(int index)
	      String s19="abcd";
		  System.out.println(s19.charAt(0));
		  System.out.println(s19.charAt(2));
		  System.out.println(s19.charAt(3));

	   
	   //IndexOf and LastIndexOf()
	      String s20="java programming languge";
//		  String s21=s20.toUpperCase();
		  System.out.println(s20.indexOf('a'));
		  System.out.println(s20.lastIndexOf('a'));

		  System.out.println(s20.indexOf("progr"));
		//  System.out.println(s21.indexOf("PROgram"));

	 //startsWith() and endsWith() :
	      String s22="abc bbc cbc";

		  System.out.println(s22.startsWith("abc"));
		  System.out.println(s22.endsWith("cbc"));
		  System.out.println(s22.endsWith("bbc cbc"));
		  System.out.println(s22.startsWith("abc bbc cbc"));
		  System.out.println(s22.endsWith("abc bbc cbc"));
		  System.out.println(s22.startsWith("bbc cbc"));
		  System.out.println(s22.startsWith("cbc"));

	 //substring()
	     String s23="java programming language";

		 System.out.println(s23.substring(5));
		 System.out.println(s23.substring(5,12));
		 System.out.println(s23.substring(5,11));
		 System.out.println(s23.substring(5,5));
	//	 System.out.println(s23.substring(12,5));
	 //    System.out.println(s23.substring(5,3));
	  
	      

	}

}
