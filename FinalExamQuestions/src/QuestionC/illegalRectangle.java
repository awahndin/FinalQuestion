package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class illegalRectangle extends Exception {
	
	public illegalRectangle(int newx, int newy) throws illegalRectangle {
		if ( newx <0 ||  newy < 0){
			
			throw new illegalRectangle("X and Y must be positive");
		}
		else{ 
			System.out.println("Input is acceptable");
		}
	}

	public illegalRectangle(String string) {
		
	}
	
}






	