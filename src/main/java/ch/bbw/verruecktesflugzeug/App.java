package ch.bbw.verruecktesflugzeug;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Verruecktes_Flugzeug flugzeug = new Verruecktes_Flugzeug();
    	flugzeug.createCard();	    
    	flugzeug.ReadCard();
    //	flugzeug.nextPossibleMoves(null, null);
    }
}
