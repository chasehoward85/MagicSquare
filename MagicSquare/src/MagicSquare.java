import java.io.*;
import java.util.*;

public class MagicSquare {

	public static void main(String[] args) {

		Scanner kbReader = new Scanner(System.in);
		
		int rows = 0;
		int cols = 0;
		
		boolean magic = false;
		
		int sumRow1 = 0;
		int sumRow2 = 0;
		int sumRow3 = 0;
		int sumRow4 = 0;
		
		int sumCol1 = 0;
		int sumCol2 = 0;
		int sumCol3 = 0;
		int sumCol4 = 0;
		
		int sumDiag1 = 0;
		int sumDiag2 = 0;
		int sumDiag3 = 0;
		int sumDiag4 = 0;
		
		int diagTot = 0;
		
		int magicSquare[][] = new int[4][4];
		
		for(int i = 0; i < 16; i++){
		System.out.println("Input an integer");
		int nums = kbReader.nextInt();
		
		if(cols == 4){
			cols = 0;
			rows++;
		}
		
		magicSquare[rows][cols] = nums;
		
		cols++;
				
		}	//Forming Square
		
		for(int i = 0; i < 1; i++){
			for(int j = 0; j < 4; j++){
				sumRow1 += magicSquare[i][j];
				sumRow2 += magicSquare[i + 1][j];
				sumRow3 += magicSquare[i + 2][j];
				sumRow4 += magicSquare[i + 3][j];
				
				sumCol1 += magicSquare[j][i];
				sumCol2 += magicSquare[j][i + 1];
				sumCol3 += magicSquare[j][i + 2];
				sumCol4 += magicSquare[j][i + 3];				
				
			}
			sumDiag1 += magicSquare[i][i];
			sumDiag2 += magicSquare[i + 1][i + 1];
			sumDiag3 += magicSquare[i + 2][i + 2];
			sumDiag4 += magicSquare[i + 3][i + 3];
			diagTot = sumDiag1 + sumDiag2 + sumDiag3 + sumDiag4;
			
			if(sumRow1 != sumRow2 || sumRow1 != sumRow3 || sumRow1 != sumRow4 || sumRow2 != sumRow3 ||
					sumRow2 != sumRow4 || sumRow3 != sumRow4 || sumRow1 != diagTot || sumRow2 != diagTot
					|| sumRow3 != diagTot || sumRow4 != diagTot){
				magic = false;
			}
			if(sumCol1 != sumCol2 || sumCol1 != sumCol3 || sumCol1 != sumCol4 || sumCol2 != sumCol3 ||
					sumCol2 != sumCol4 || sumCol3 != sumCol4 || sumCol1 != diagTot || sumCol2 != diagTot
					|| sumCol3 != diagTot || sumCol4 != diagTot){
				magic = false;
			}
			else{
				magic = true;
			}
		}	//Doing Math
		
		cols = 0;
		rows = 0;
		for(int j = 0; j < 16; j++){
			if(cols == 4){
			cols = 0;
			rows++;
			System.out.println("");
			}
						
			System.out.print(magicSquare[rows][cols] + "\t");
			
			cols++;
		}	//Printing Square
		
		System.out.println("");
		if(magic == false){
				System.out.println("The square is not magic");
		}
		else{
				System.out.println("The square is magic");
		}
	}
}