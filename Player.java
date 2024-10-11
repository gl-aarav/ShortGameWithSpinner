public class Player    
{
	private int acorn;
	private String playerName;
	
	public Player ( )  
	{								  
		acorn = -5;		
		playerName = new String("");
	}
	
	public Player (String name)  
	{								
		acorn = 0;  
		playerName = new String(name);  	
	}
	
	
	public void setAcorn(int acornIn)	
	{									
		acorn += acornIn;
	}
	
	
	public int getAcorn()
	{
		return acorn;
	}
	
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public void printScore()  
	{			
		System.out.println(playerName + " has this many acorns: " + acorn);
		if (acorn >= 5)
			System.out.println("You won!");
	}
}
