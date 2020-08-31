public class Joiner{

	public static String joiner(String st1, String st2){

		if(st1.equals("")){
			return st2;
		}else{

			return st1.substring(0,1)+joiner(st1.substring(1),st2);
		}



	}

	public void run()
	{	String str1 = "pqr";
		String str2 = "st";
		System.out.println(joiner(str1, str2));
	}

	public static void main(String[]args)
	{	
		Joiner objct = new Joiner();
		objct.run();
	}


}
