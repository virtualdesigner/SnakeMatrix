
import java.util.*;

public class Main

{
    public static void snakeMatrix(int totalRows) {
    	int frontGap = 3;
    	int endGap = 0;
    	int numbers = 4;
    	int number = 1;
    	int numberCalc = 1;
    	for(int rows=0; rows<totalRows; rows++) {
    		
    		for(int emptyBoxes=0; emptyBoxes<=frontGap; emptyBoxes++) {
    			System.out.print(" ");
    		}
    		for(int numberedBoxes=0; numberedBoxes<numbers; numberedBoxes++) {
    			System.out.print(number);
    			number+=numberCalc;
    		}
    		number-=numberCalc;
    		for(int emptyBoxes=0; emptyBoxes<=endGap; emptyBoxes++) {
    			System.out.print(" ");
    		}
    		frontGap--;
    		endGap++;
    		number += 4;
    		numberCalc*=-1;
    		System.out.println();
    	}
    }


	public static void main(String[] args) {
		snakeMatrix(4);
	}
}