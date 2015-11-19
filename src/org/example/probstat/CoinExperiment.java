package org.example.probstat;

import org.example.probstat.FairCoin.CoinFace;

public class CoinExperiment 
{
	private int numberOfFlips;
	private long seed; // set in ctor for reproducible experiments
	private FairCoin coin;
	private boolean isEqual = false;
	private double ratio = 0.0;
	int numberOfHeads = 0;
	int numberOfTails = 0;
	
	public CoinExperiment( final int numberOfFlips )
	{
		this.numberOfFlips = numberOfFlips;
		this.seed = System.currentTimeMillis();
		this.coin = new FairCoin( this.seed );
	}
	
	public CoinExperiment( final int numberOfFlips, final long seed )
	{
		this.numberOfFlips = numberOfFlips;
		this.seed = seed;
		this.coin = new FairCoin(this.seed);
	}
	
	
	public void runExperiment()
	{		
		for( int i = 0; i < this.numberOfFlips; i++ )
		{	
			CoinFace result = this.coin.flip();
			switch( result )
			{
				case HEADS:
					this.numberOfHeads++;
					break;
				case TAILS:
					this.numberOfTails++;
					break;
				default:
					// can't happen
			}
		}
		
		if( this.numberOfHeads == this.numberOfTails )
		{
			this.isEqual = true;
		}
	
		ratio = (double)this.numberOfHeads / (double)this.numberOfTails;
		
	}

	public void reset()
	{
		this.isEqual = false;
		this.ratio = 0.0;
		this.numberOfHeads = 0;
		this.numberOfTails = 0;
		
	}
	
	public boolean isEqual() 
	{
		return this.isEqual;
	}
	
	public double getRatio() 
	{
		return this.ratio;
	}
	
	public int getNumberOfHeads() 
	{
		return numberOfHeads;
	}
	
	public int getNumberOfTails() 
	{
		return numberOfTails;
	}
	
	public int getNumberOfFlips() 
	{
		return numberOfFlips;
	}
	
}