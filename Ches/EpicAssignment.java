package com.lab.assignment.Day2.Ches;

public class EpicAssignment 
{
	public static void main(String[] args) 
	{
		//I found several ways to build this but picked this way. The math makes sense to me here. I also understand why we need i and j in the nested for loop.
		String[][] myFavoriteThings = new String[4][5];
			
			myFavoriteThings [0][0] = "MD Steamed Crabs";
			myFavoriteThings [0][1] = "Ceaser Salad";
			myFavoriteThings [0][2] = "Olives";
			myFavoriteThings [0][3] = "Lemon Italian Ice";
			myFavoriteThings [0][4] = "Pizza";
			
			myFavoriteThings [1][0] = "Imagine Dragons";
			myFavoriteThings [1][1] = "U2";
			myFavoriteThings [1][2] = "Cold War Kids";
			myFavoriteThings [1][3] = "AWOL Nation";
			myFavoriteThings [1][4] = "The Bleachers";
			
			myFavoriteThings [2][0] = "All 7 Harry Potter Years";
			myFavoriteThings [2][1] = "The Twilight Series";
			myFavoriteThings [2][2] = "Devil in the White City";
			myFavoriteThings [2][3] = "The Hunger Games Series";
			myFavoriteThings [2][4] = "The Sookie Stackhouse Mystery Series";
			
			myFavoriteThings [3][0] = "The Godfather";
			myFavoriteThings [3][1] = "The Shining";
			myFavoriteThings [3][2] = "The Exorcist";
			myFavoriteThings [3][3] = "My Cousin Vinny";
			myFavoriteThings [3][4] = "It's A Wonderful Life";
			
			int rows = 4; //this is the number of arrays
			int columns = 5; //this is the number of objects in each array
			int i,j; //we need two variables because there will be a for loop inside a for loop
			
			for(i = 0; i < rows; i++ )
			{
				for(j = 0; j < columns; j++)
				{
					System.out.println(myFavoriteThings[i][j] + " "); //added the space so I can read it.
				}
				System.out.println(); //added between each array so it is organized
			}
		
		
					
				
					
					
		
	}
}
