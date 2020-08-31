public class boyerMoore{

	public void matching(){
		String[] T = {"the name and the surname"};
		String P = "the";
		
		int len = P.length;
		int count = 0;
		while(count < T[0].length){
			if(T[0].charAt(len - 1) != P.charAt(len - 1)){
				 = P.indexOf(P.charAt(len - 1)) + len;
			}
		}
	}
}