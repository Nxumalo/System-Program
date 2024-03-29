import java.io.*;                          

// 2D Arrays and string manipulation
// Below are some methods that can be used to implement 
// the Sudoku elimination method
// ---------------------------------------------------
/**

<p><b>Author:<b>  Fraser Nxumalo<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Programming assignment 4.2<p>
<p>Last modified: 7/12/2021<p>

<h1>Solving a set sudoku</h1>

<p>This program creates a board for sudoku which it then will use to solve the sudoku. After creating the board it fills in the set numbers and fills all the empty cells with string 123456789. Then, it checks all the cells with one string, it ten removes that string from all other cells in the same column an same row and also same 3 by 3 dimension. After removing all the set numbers from corresponding cells, It does a slow but efficient check on all cells containing more than one digit. It checks for the digit within that cell which is the only one within the 3 by 3 region of the cell. If the digit is the only one, it then sets that particular cell to contain only the digit, therefore deleting all the other digits withing the cell. It does this over and over until there exist only one digit within each cell. Through all this...it will be displaying he board with changes made until the last board is reached.</p>
*/
public class Demosudoku
{
	public static int size = 9;			// size of board, i.e. 9 x 9
	String[][] board = new String[size][size];	// declares a 9 x 9 string array
	String stringWithAllDigits = "123456789";	// stores all 9 digits as a string
/**
This method sets the board. As mentioned before, all set values will be set within set cells and all empty cells will be replaced with 123456789.
*/
	public void initializeBoard()				//the initializer for loop
	{	for (int r=0; r<size; r++)			//loops for the rows
		{	for (int c=0; c<size; c++)		//loopd for the columns
			{	board[r][c] = stringWithAllDigits; // store all 9 digits in each square
			}
		}
		// Store single digits as given in board that must be solved
		board[0][1] = "6"; board[0][3] = "1"; board[0][5] = "4"; board[0][7] = "5"; board[1][2] = "8"; 
		board[1][3] = "3"; board[1][5] = "5"; board[1][6] = "6"; board[2][0] = "2"; board[2][8] = "1";
		board[3][0] = "8"; board[3][3] = "4"; board[3][5] = "7"; board[3][8] = "6"; board[4][2] = "6"; 
		board[4][6] = "3"; board[5][0] = "7"; board[5][3] = "9"; board[5][5] = "1"; board[5][8] = "4";
 		board[6][0] = "5"; board[6][8] = "2"; board[7][2] = "7"; board[7][3] = "2"; board[7][5] = "6"; 
		board[7][6] = "9"; board[8][1] = "4"; board[8][3] = "5"; board[8][5] = "8"; board[8][7] = "7";
	}

	// Accessors
	// ---------
/**
This methods gets the 2D row and set it to a string for easy use in the code.
@param r 
@return The rows	
*/
	public String[] getRow(int r)	    // retrieves row r from 2D-array
	{	String[] arr = new String[size];
		for (int col = 0;  col < size; col++)
			arr[col] = board[r][col];
		return arr;
	} 
/**
This methods gets the 2D column and set it to a string for easy use in the code.
@param c
@return The rows	
*/

	public String[] getColumn(int c)	// retrieves column c from 2D-array
	{	String[] arr = new String[size];
		for (int row = 0;  row < size; row++)
			arr[row] = board[row][c];
		return arr;
	} 

	/**public String[] get3by3Region(int r, int c)	// retrieves 3x3 grid that contains element arr[r][c]
	{	String[] arr = new String[size];        // and stores it in a 1D array
		int topRow = 3 * (r / 3);		// determines the top row of the 3x3 region
		int leftCol = 3 * ( c / 3);
		int index=0;		// determines the left most column of the 3x3 region
		for (int row = topRow;  row < topRow+3; row++)
		{	for (int col = leftCol;  col < leftCol+3; col++)
				arr[index] = board[row][col];
				index++;
		}
		for(int p=0;p<arr.length;p++){
			System.out.println(arr[p]);
		}
		return arr;
	} */
/**
This methods divides the board into a 3 by 3 region for easy access.It also creates a new array containing only values in the 3 by 3 region.
@param r
@param c 
@return The rows of modified array	
*/

	 public String[] get3by3Region(int r, int c) // retrieves 3x3 region which contains arr[r][c]

     {    String[] arr = new String[size];

          int topRow = 3 * (r / 3);         // determines the top row of the 3x3 region

          int leftCol = 3 * ( c / 3);       // determines the left most column of the 3x3 region

          int indx = 0;

          for (int row = topRow;  row < topRow+3; row++)	//loops for rows

          {    for (int col = leftCol;  col < leftCol+3; col++)	//loops for columns

              {    arr[indx] = board[row][col];			//setting the new array to 3 by 3 values

                   indx++;					//incrimenting the count(index)

              }

          }

          return arr;

     } 
/**
This methods sets the board at large so it makes it easy for comparison of digits.
@param r 
@param c
@return The rows and columns of modified array	
*/

	public String[] get9by9Region(int r, int c)	// retrieves 3x3 grid that contains element arr[r][c]
	{	String[] arr = new String[size*size];        // and stores it in a 1D array
		int topRow = 9 * (r / 9);		// determines the top row of the 3x3 region
		int leftCol = 9 * ( c / 9);		// determines the left most column of the 3x3 region
		int ind=0;
		for (int row = topRow;  row < topRow+9; row++){		//loops for the rows
			
			for (int col = leftCol;  col < leftCol+9; col++){	//loops for the columns
				arr[ind] = board[row][col];			//setting new array
				ind++;						//incrementing
			}
		}
		return arr;
	} 
	
	// ------------------------------------------------

	// Mutators
	// --------
/**
This is the 3 by 3 region set mutator
*/
	public void setSquare(int r,int c,String[] arr){
		int topRow = 3 * (r / 3);		// determines the top row of the 3x3 region
		int leftCol = 3 * ( c / 3);		// determines the left most column of the 3x3 region
		int ind=0;
		for (int row = topRow;  row < topRow+3; row++){	
			for (int col = leftCol;  col < leftCol+3; col++){
				//System.out.println("The index now is "+row+" , "+col);
				board[row][col]= arr[ind] ;
				ind++;
			}
		}
		
	}
/**
This is the row mutator
*/
	public void setRow(int r, String[] arr)	    // stores string array arr back in row r of 2D-array board
	{	for (int col = 0;  col < arr.length; col++)
			board[r][col] = arr[col];		
	} 

	public void setColumn(int c, String[] arr)	// stores string array arr in column c of 2D-array board
	{	for (int row = 0;  row < arr.length; row++)
			board[row][c] = arr[row];		
	} 
	/**public void set3by3Region(int rowR,int Colm,String[] arrOne){       // and stores it in a 1D array
		int topRow = 3 * (rowR / 3);		// determines the top row of the 3x3 region
		int leftCol = 3 * ( Colm / 3);
		int index=0;				// determines the left most column of the 3x3 region
		for (int row = topRow;  row < topRow+3; row++)
		{	for (int col = leftCol;  col < leftCol+3; col++)
				board[row][col]=arrOne[index];
				index++;
		}
	
	}*/
/**
This is another 3 by 3 mutator
*/
	 public void set3by3Region(int r, int c,String[] arrOne) // retrieves 3x3 region which contains arr[r][c]

     {    //String[] arr = new String[size];

          int topRow = 3 * (r / 3);         // determines the top row of the 3x3 region

          int leftCol = 3 * ( c / 3);       // determines the left most column of the 3x3 region

          int indx = 0;

          for (int row = topRow;  row < topRow+3; row++)

          {    for (int col = leftCol;  col < leftCol+3; col++)

              {    board[row][col]=arrOne[indx];

                   indx++;

              }

          }

          //return arr;

     } 
	// ------------------------------------------------
/**
This method replaces the lonly digits found in the 3 by 3 region. It first creates a temporary array which stores the values in the 3 by 3 region. After the creaton of the new array, it uses it to check which values are lonly and if any exist..it replaces the cells with only that digit.
*/
	public void rePlaceDigitSquare(String dgt,int r, int co)	// replace the string dgt (of length 1) from all
	{	
		String [] tmpArr;					//temporary array
		tmpArr=get3by3Region(r, co);				//calls to the get method
		int index=0;						//creates index
		System.out.println();
		for (int c=0; c<dgt.length(); c++)			//loops for columns
		{	
			int exsitedNumber=0;				//sets the existed number to 0
			String subsetDigit=dgt.substring(c, c+1);	//sets the sub digit to first digit in array

			for (int c1=0; c1<tmpArr.length; c1++){		//loops for more coumns
				int dig=0;				//digging for more lonelies
				//System.out.println(tmpArr[dig]+"   "+tmpArr[dig].contains(subsetDigit)+" the digit is" +subsetDigit);
				if(tmpArr[c1].contains(subsetDigit)){	
					exsitedNumber++;
					index=c1;	
					}
			}
			if (exsitedNumber==1){
				//System.out.println(exsitedNumber+"times "+"With number"+subsetDigit);
				tmpArr[index]=replaceDigitFromStringOfLength2orMore(dgt,subsetDigit );
				}	
				
		}
			
		setSquare(r, co, tmpArr);// array tmpArr in row r of 2D-array board
	}
/**
This method removes digits in a 3 by 3 region
@param rolw
@param cool
@param three
*/
	public void removeDigitFrom3BY3(String three, int rolw, int cool){
		String[] threeby;				//creates new array threeby
		threeby=get3by3Region(rolw,cool);		//sets the array through the get method
		/**for(int p=0;p<threeby.length;p++){
			System.out.println(threeby[p]);
		}*/
		for(int k=0;k<threeby.length;k++){		//loops for the 3 by 3
			String bString=threeby[k];		//temporary string for indeces
			threeby[k]=removeDigitFromStringOfLength2orMore(three, bString);//recursion
		}
		
		set3by3Region(rolw,cool,threeby);		//set the 3 by 3 region
	}
	
/**
This method removes digits from rows
@param r
*/
	public void removeDigitFromRowR(String dgt, int r)	// removes the string dgt (of length 1) from all
	{	String[] tmpArr;				// string entries (of length 2 and longer) in row r
		tmpArr = getRow(r);								// copies row r from board to tmpArr
		for (int c=0; c<tmpArr.length; c++)
		{	String aStrng = tmpArr[c];		// copies string at index c from string array tmpArr
			tmpArr[c] = removeDigitFromStringOfLength2orMore(dgt, aStrng);
		} 
		setRow(r, tmpArr);                  // stores array tmpArr in row r of 2D-array board
	}
/**
This method removes digits from columns
@param c
*/
	public void removeDigitFromColumnC(String dgt, int c) // removes the string dgt (of length 1) from 
	{	String[] tmpArr;				// all string entries (of length 2 and longer) in column c
		tmpArr = getColumn(c);				// copies column c from board to tmpArr		
		for (int r=0; r<tmpArr.length; r++)
		{	String aStrng = tmpArr[r];		// copies string at index r from string array tmpArr 	 
			tmpArr[r] = removeDigitFromStringOfLength2orMore(dgt, aStrng); 
		} 
		setColumn(c, tmpArr);				// stores array tmpArr in column c of 2D-array board
	}
/**
This method rmoves digits of length two or more
@param dgtStrng
@param strng
*/
	public String removeDigitFromStringOfLength2orMore(String dgtStrng, String strng) // removes the string dgtStrng from String strng
	{	String aStrng = strng;							
		int indx = aStrng.indexOf(dgtStrng);	   // finds index of where digit (dgtStrng) occurs in string aStrng
		if ((indx >= 0) && (aStrng.length() >= 2)) // if digit occcurs and more than 2 digits in string then 
			aStrng = aStrng.substring(0,indx) + aStrng.substring(indx+1); // remove dgtStrng from aStrng			
		return aStrng;
	}
/**
This method replaces cells which contain a lonly with a lonly
*/
	public String replaceDigitFromStringOfLength2orMore(String dgtStrng, String strng) // removes the string dgtStrng from String strng
	{	String aStrng = strng;							
		int indx = aStrng.indexOf(dgtStrng);	   // finds index of where digit (dgtStrng) occurs in string aStrng
		if ((indx >= 0) && (aStrng.length() >= 2)) // if digit occcurs and more than 2 digits in string then 
			
			aStrng = aStrng.substring(0,indx) + aStrng.substring(indx+1); // remove dgtStrng from aStrng			
		return aStrng;
	}

	public String constructLineNo(int lineNo, String strng)	// places the digits in a square in its correct position for printing
	{ 	String template = "123456789";		// e.g. "23" is stored as " 23" while "46" is stored as "4 6" and "78 as "78 "
		String line = "";					// initialize to null string
		String aBlank = " ";				// stores a space
		int strt = 3 * lineNo - 3;			// strt indicates the starting position of the 3 digit substring to be extracted from "123456789"
		for (int i = strt; i< strt+3; i++)	// for the first line "123" is used, "456" for the 2nd line and "789" for the third line
		{	String digt = template.substring(i,i+1);
			if (strng.indexOf(digt) != -1)	// display digt if it appears in string strng else do not display
				line = line + " " + digt;	// since digt is present in cell add it to the line to be displayed
			else
				line = line + " " + aBlank;	// else add a space 
		}
		return line;
	}
/**
This method does the board displaying and layouts.
*/
	public void displayBoard()				// displays contents of each cell of the board across three lines
	{										// as  123
											//     456
											//     789
		System.out.println("\t\t\t\t-------------------- TOP ------------------");
		for (int r=0; r<size; r++)					
		{	
			String line1 = "\t\t| ";
			String line2 = "\t\t| ";
			String line3 = "\t\t| ";

			for (int c=0; c<size; c++)
			{	 line1 = line1 + constructLineNo(1, board[r][c])  + " |";
				 line2 = line2 + constructLineNo(2, board[r][c])  + " |";
				 line3 = line3 + constructLineNo(3, board[r][c])  + " |";
				 if (( c == 2) || ( c == 5))	// signals end of last column on 3x3 region
				 {	line1 = line1 + "| ";			
				 	line2 = line2 + "| ";	
				 	line3 = line3 + "| ";
				 }
			}
			System.out.println(line1);
			System.out.println(line2);
			System.out.println(line3);
			if (( r == 2) || ( r == 5))	 //  indicates the last row of a 3x3 region
				System.out.println("==========================================================================================================");
			else
				System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		System.out.println("\t\t\t\t----------------- BOTTOM  ----------------\n");
		System.out.println();
	}

/**
This method alows for the running of the program. It does necessary allings of other methods 
*/
	public void run()
	{	initializeBoard();		//calling initializeBoard
		
		/** Instructions below should provide some idea of how to remove the first digit from each row, column and 3x3-grid
		// It is not the solution but merely provided to give you some insight into how to remove a digit from 
		// all three structures, i.e. a row, a col and a 3x3-grid
		// Your code for the algorithm should replace the code in this method
		
		String dgtStrng = board[0][1];
		//System.out.println("Before removing "+board[0][1]+" (which appears in square 1,2) from all other squares in ROW "+1+" of the board");
		displayBoard();
		removeDigitFromRowR(dgtStrng, 0);
		//System.out.println("After removing "+board[0][1]+" (which appears in square 1,2) from all other squares in ROW "+1+" of the board");
		displayBoard();
		removeDigitFromColumnC(dgtStrng, 1);
		//System.out.println("After removing "+board[0][1]+" (which appears in square 1,2) from all other squares in COLUMN "+2+" of the board");
		displayBoard();*/
		boolean sedukoNONCompleed=true;			//creates a boolean
		while(sedukoNONCompleed){			//While to chech completion
		
		int tru=0;					//new temporary int
		int inff=0;					//new temporary int
		String[] testseduko=get9by9Region(0, 0);	//calls and sets the get9by9Region which is the whole board
		for(int row=0;row<81;row++){
				if (testseduko[inff].length()==1){
					tru++;
				}
		inff++;

		}
		System.out.println(""+tru);
		if(tru==81){
			sedukoNONCompleed=false;		//if not complete then re run 
		}
		for(int r=0;r<size;r++){			//loops rows
			for(int c=0;c<size;c++){		//loops columns
				String dgtStrng = board[r][c];	//Sets dgtStrng to the board cell values
				//removeDigitFrom3BY3(dgtStrng,r,c);
				if(board[r][c].length()==1){
					//String dgtStrng = board[r][c];
					
					removeDigitFromRowR(dgtStrng, r);	//calls removeDigitFromRowR
					
					removeDigitFromColumnC(dgtStrng, c);	//calls	removeDigitFromColumnC
					
					removeDigitFrom3BY3(dgtStrng,r,c);	//calls removeDigitFrom3BY3
					displayBoard();				//displays the board
					
					
				}
				else{
					rePlaceDigitSquare(dgtStrng, r, c);	//if conditions differ 
					displayBoard();				//display board
				}
			}
		}
		}
	}
/**
This is the main method. It creates an object for the class and call the run method which does all the calculations.
*/
	public static void main(String args[])
    {
		DemoSudoku testerObjct = new DemoSudoku();	
		testerObjct.run();  
		//testerObjct.get3by3Region(1, 1);
		
    }
}

