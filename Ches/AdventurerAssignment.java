package com.lab.assignment.Day2.Ches;

public class AdventurerAssignment 
{
	public static void main(String[] args) 
	{
		String[] aListOfMovies = new String[10];
		aListOfMovies[0] = "The Shining";
		aListOfMovies[1] = "Scream";
		aListOfMovies[2] = "The Exorcist";
		aListOfMovies[3] = "Paranormal Activity";
		aListOfMovies[4] = "Halloween";
		aListOfMovies[5] = "Nightmare on Elm Street";
		aListOfMovies[6] = "What Lies Beneath";
		aListOfMovies[7] = "The Conjuring";
		aListOfMovies[8] = "Rosemary's Baby";
		aListOfMovies[9] = "Cabin in the Woods";
		
		String[] aListOfJKRowlingBooks = new String[10];
		aListOfJKRowlingBooks[0] = "Harry Potter and the Sorceror's Stone";
		aListOfJKRowlingBooks[1] = "Harry Potter and the Chamber of Secrets";
		aListOfJKRowlingBooks[2] = "Harry Potter and the Prisoner of Azkaban";
		aListOfJKRowlingBooks[3] = "Harry Potter and the Goblet of Fire";
		aListOfJKRowlingBooks[4] = "Harry Potter and the Order of the Phoenix";
		aListOfJKRowlingBooks[5] = "Harry Potter and the Half Blood Prince";
		aListOfJKRowlingBooks[6] = "Harry Potter and the Deathly Hallows";
		aListOfJKRowlingBooks[7] = "Harry Potter and the Cursed Child";
		aListOfJKRowlingBooks[8] = "Fantastic Beasts and Where to Find Them";
		aListOfJKRowlingBooks[9] = "Quidditch Through the Ages";
	}
	
	public String hiBeth()
	{
		return "Hi Beth";
	}
	
	@SuppressWarnings("unused")
	private int numberOfStates()
	{
		return 50;
	}
	
	protected String presidentName(String firstName, String lastName)
	{
		return lastName + firstName;	
	}

	public void Milk(boolean doYouLikeMilk)
	{
		@SuppressWarnings("unused")
		boolean isMilkGood = false;
		if (doYouLikeMilk)
		{
			isMilkGood = true;
		}
		System.out.println(doYouLikeMilk);
	}
	
	public void chinchillas(float length, float weight)
	{
		System.out.println(length + weight);
	}
	
	@SuppressWarnings("unused")
	private void test(int value)
	{
		if (value == 0)
		{
			return;
		}
		System.out.println(value);
	}

	protected void disp(char c)
	{
		System.out.append(c);
	}
	
	@SuppressWarnings("unused")
	private void dis(char g, int b)
	{
		System.out.println(g + " and " + b);
	}
	
	public double myExpression(int num1, int num2)
	{
		System.out.println("My Expression");
		return num1 + num2;
	}
	
	protected void display()
	{
		System.out.println("I like to code!");
	}
}
