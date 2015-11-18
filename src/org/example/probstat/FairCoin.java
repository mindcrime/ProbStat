package org.example.probstat;

import java.util.Random;

public class FairCoin 
{
	public static enum CoinFace { HEADS, TAILS };
	
	Random random;
	
	public FairCoin()
	{
		random = new Random();
	}
	
	public FairCoin( final long seed )
	{
		random = new Random( seed );
	}
	
	public CoinFace flip()
	{
		int r = random.nextInt(2);
		
		switch( r )
		{
			case 0:
				return CoinFace.HEADS;
			case 1:
				return CoinFace.TAILS;
			default:
				throw new RuntimeException( "Invalid toss result" );
		}
	}
	
}
