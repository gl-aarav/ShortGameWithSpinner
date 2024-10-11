
import java.util.Scanner;

public class SneakySnackySquirell	
{
	private Player holly;
	
	public static void main (String[] Args)			
	{
		SneakySnackySquirell sss = new SneakySnackySquirell();
		sss.run();
	}
	
	public void run()
	{
		boolean again = true; 
		int rand = 56;  
		holly = new Player("Holly"); 
							      					
		while(again)  
		{							
			rand = spin(); 
			decide(rand); 
			holly.printScore(); 
			again = playAgain();  
		}
	}

	public boolean playAgain()
	{											
		Scanner reader = new Scanner (System.in);  
		String typed = new String ("");	
		if (holly.getAcorn() < 5) 
		{
			System.out.println("Press return to spin again. ");
			typed = reader.nextLine();  
			return true;
		
		}
		else								  
			return false;	
		
	}
	
	
	public byte spin()  
	{
		byte spun = -6;
		
		spun = (byte)(Math.random()*8+1);  
		return spun;
	}

	public void decide(int input)	
	{				
		System.out.println(holly.getPlayerName() + " spun " + input);
		if(input >= 1 && input <= 5)
			holly.setAcorn( 1 );  
		else if (input == 6)
			holly.setAcorn( -holly.getAcorn() );	
		else if ( input == 7 && (holly.getAcorn() > 0) )
			holly.setAcorn( -1 );
		else if (input == 8)
			holly.setAcorn( 2 );
	}	
}	
