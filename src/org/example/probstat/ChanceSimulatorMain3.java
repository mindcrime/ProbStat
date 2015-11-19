package org.example.probstat;

public class ChanceSimulatorMain3 
{

	public static void main(String[] args) 
	{
		int[] flipCounts = { 10, 100, 500, 1000, 5000, 10000, 20000, 80000, 100000, 200000, 500000, 1000000 };
		
		CoinExperiment experiment;
		
		for( int flipCount : flipCounts )
		{
			experiment = new CoinExperiment( flipCount );
		
			boolean match = false;
			long numberOfExperimentsUntilMatch = 0;
			do
			{
				numberOfExperimentsUntilMatch++;
				experiment.runExperiment();
				if( experiment.isEqual() )
				{
					match = true;
				}
				else
				{
					experiment.reset();
				}
				
			} while( match == false );
			
			System.out.println( "For " + flipCount + " flips, it took " 
								+ numberOfExperimentsUntilMatch + " experiments until we got an exact match (" 
								+ experiment.getNumberOfHeads() + " HEADS, " + experiment.getNumberOfTails() + " TAILS)" );
			
		}
	
		
		System.out.println( "done" );
	}

}
