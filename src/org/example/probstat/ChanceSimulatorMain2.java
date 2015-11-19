package org.example.probstat;

public class ChanceSimulatorMain2 
{

	public static void main(String[] args) 
	{
		
		CoinExperiment experiment = new CoinExperiment( 10, 1 );
		
		experiment.runExperiment();
		
		if( experiment.isEqual() )
		{
			System.out.println( "Got exact same number of HEADS (" + experiment.getNumberOfHeads() 
								+ ") and TAILS (" + experiment.getNumberOfTails() + ") in (" 
								+ experiment.getNumberOfFlips() + ") flips");
		}
		else
		{
			System.out.println( "Got different number of HEADS (" + experiment.getNumberOfHeads() 
								+ ") and TAILS (" + experiment.getNumberOfTails() + ") in (" 
								+ experiment.getNumberOfFlips() + ") flips");	
		}
		
		System.out.println( "Ratio of HEADS to TAILS = " + experiment.getRatio() );
		
		System.out.println( "done" );
	}

}
