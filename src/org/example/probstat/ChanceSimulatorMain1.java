package org.example.probstat;

import org.example.probstat.FairCoin.CoinFace;

public class ChanceSimulatorMain1 
{

	public static void main(String[] args) 
	{
		FairCoin coin = new FairCoin();
		
		int heads = 0;
		int tails = 0;
		
		long trials = 1000;
		
		for( int i = 0; i < trials; i++ )
		{
			CoinFace result = coin.flip();
			switch( result )
			{
				case HEADS:
					heads++;
					break;
				case TAILS:
					tails++;
					break;
				default:
					// can't happen
			}
		}
		
		System.out.println( "After " + trials + "  flips, we got " + heads + " HEADS and " + tails + " TAILS" );
		System.out.println( "Ratio: " + (double)heads/tails );
	}

}
