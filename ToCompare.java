public class ToCompare {
	
    public static void main(String[] args) {
        int[] firstNums = {2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 15};
        int[] secNums = {2, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7, 7, 8, 9, 9, 10, 11, 12, 13, 15};
        int toCompare = 0;
        int lastFound = -1;  //Variable to make sure we do not repeat the same number
		int tracer = 0;
        for (int i: firstNums){ //This ensure we access every item in the first list
            toCompare = i;  //Setting the number we are looking for to the variable toCompare
            int a = 0; // Variable to ensure that we access every item in the second list
            while(a < secNums.length){
                if(secNums[a] < toCompare){ //If the number we are at in the second list is less than the acctual value we are looking for just increment a
                    a++;
                }else{
                    if((secNums[a] == toCompare) && (a != lastFound)){
                        System.out.println("Coordinates of indices (" +a + ", " + tracer+ ")" + " and corresponding numbers are (" + secNums[a] + ", " + toCompare + ")");
                        lastFound = a; //Making sure that we do not compare the same number in the first element
                        a = secNums.length; // Terminating the while loop because we found the number we are searching for
                    }else if (a == lastFound){
                        a = secNums.length; //Terminating loop if the variable last found and the current item we are at in the second list are equal
                    }
                }
            }tracer++;
        }
    }
}

