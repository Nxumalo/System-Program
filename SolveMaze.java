// Surname:                   Student no.:
//---------------------------------------------------------------------------

public class SolveMaze
{       public static void main (String[] args)
        {   Maze m = new Maze();
            Position goal = m.getFinish();
            System.out.println("Goal = "+m.getFinish());
            Position square = null;
            ArrayStack path = new ArrayStack();
            path.Push(m.getStart()); 

            while (!path.isEmpty()) 
            { 

// replace with your code

                System.out.println(square);  

                if (m.isClear(square.north())) 
                    path.Push(square.north()); 
                if (m.isClear(square.west())) 
                    path.Push(square.west()); 
                if (m.isClear(square.south())) 
                    path.Push(square.south()); 
                if (m.isClear(square.east())) 
                    path.Push(square.east()); 
            }
            System.out.println("Final position : "+square);  
        }
}