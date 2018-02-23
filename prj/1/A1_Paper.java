import java.util.Scanner;

public class A1_Paper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter smallest paper size
		System.out.print("Enter the A-size of the smallest paper: ");
		int n = input.nextInt();
		
		//check if size is valid
		if(!checkSize(n)) {
			System.out.print("impossible");
			System.exit(1);
		}
		

		int[] numOfEach; // array for numOfEach paper size
		numOfEach = new int[n - 1]; 
		//^^ An = numOfEach[n - 2]; ex. A2 = numOfEach[0]
		//Enter number of each paper size
		System.out.print("Enter the number Bjorn has of each sheet " +
		"of paper, starting from A2 and ending with A" + n + ": ");
		//Loop to make numOfEach array values
		for(int i = 0; i < (numOfEach.length); i++) {
			numOfEach[i] = input.nextInt();
		}
		
		//check if numOfEach is valid
		if(!checkNumOfEach(numOfEach)) {
			System.out.print("impossible");
			System.exit(1);
		}
		
		//check if A1 is possible
		if(tapeLength(numOfEach) == 0) {
			System.out.print("impossible");
			System.exit(1);
		}
		
		else
			System.out.print(tapeLength(numOfEach));
		
		
		
	}
	
	public static boolean checkSize(int size) {
		return ((size >= 2) && (size <= 30));
	}
	
	public static Boolean checkNumOfEach(int[] numOfEach) {
		//reference array, ea. paper can't have more than 10^9 qty
		int[] ref;
		ref = new int[28];
		for(int i = 0; i < 28; i++) {
			ref[i] = (int) Math.pow(10, 9);
		}
		
		//init boolean result
		Boolean result = null;
		
		//loop determining if numOfEach is valid
		for(int i = 0; i < (numOfEach.length); i++) {
			if(numOfEach[i] > ref[i])
				result = false;
			else
				result = true;
		}
		return result;
	}
	
    public static float tapeLength(int[] numOfEach) {
        //2D array to initialize x & y dimensions
        float[][] dimensions;
        dimensions = new float[numOfEach.length][2];
        // ^^ dimensions[i][0] = x
        // ^^ dimensions[i][1] = y
        
        // dimensions of A2's x & y
        float x = (float) Math.pow(2, -(5.0 / 4));
        float y = (float) Math.pow(2, -(3.0 / 4));
        
        //dimensions of A1's x & y to compare later
        float a1X = 2 * x;
        float a1Y = y;
        float a1Area = a1X * a1Y;
        
        //init tapeLength
        float tapeLength = 0;
        
        //init area of paper
        float pArea = 0;
        
        //init area we have total
        float totalArea = 0;
        
        //if they have an A2, add tapelength
        if(numOfEach[0] > 0) {
            tapeLength += y;
            pArea = x * y;
            totalArea += pArea;
            if(numOfEach[0] >= 2) {
                totalArea += pArea;
                tapeLength += y;
                return tapeLength;
            }
        }
        
        //check for A3
        if(numOfEach[1] > 0) {
            tapeLength += x;
            pArea = (x * (y / 2) * numOfEach[1]);
            totalArea += pArea;
            if(numOfEach[1] >= 4) {
                totalArea += pArea * 3;
                tapeLength += x;
                if(numOfEach[0] == 0)
                    tapeLength += y;
                return tapeLength;
            }
        }
        
      //Calculate x & y's for the rest of the sizes
        for(int i = 2; i < (numOfEach.length); i++) {
            //checks if dimensions are good
            if(java.lang.Math.abs((float) totalArea - a1Area) <= (float) Math.pow(10, -5))
                return tapeLength;
            if(i % 2 == 0) {
                for(int j = numOfEach[i], k = 1; j > 0; j--, k++) {
                    if(java.lang.Math.abs((float) totalArea - a1Area) > (float) Math.pow(10, -5)) {
                        dimensions[i][1] = y / i;
                        dimensions[i][0] = x / (i);
                        pArea = dimensions[i][1] * dimensions[i][0];
                        totalArea += pArea;
                        if(java.lang.Math.abs((float) totalArea - a1Area) > (float) Math.pow(10, -5)) {
                            tapeLength += dimensions[i][1];
                            if((numOfEach[i - 1] == 0) && (k % 2 == 0)) {
                                tapeLength += dimensions[i][0] * 2;
                            }
                        } else
                        	tapeLength -= dimensions[i][1];
                    } 
                }
            }
            else if(i % 2 != 0) {    
                for(int j = numOfEach[i] - 1; j > 0; j--) {
                    if(java.lang.Math.abs((float) totalArea - a1Area) > (float) Math.pow(10, -5)) {
                        dimensions[i][0] = x / (i - 1);
                        dimensions[i][1] = y / (i + 1);
                        pArea = dimensions[i][1] * dimensions[i][0];
                        totalArea += pArea;
                        if(java.lang.Math.abs((float) totalArea - a1Area) > (float) Math.pow(10, -5)) {
                        	tapeLength += dimensions[i][0];
                        	if(numOfEach[i - 1] == 0) {
                        		tapeLength += dimensions[i][1] * 2;
                        	}
                        } else
                        	tapeLength -= dimensions[i][0];
                    }
                }
            }
        }
        if(java.lang.Math.abs((float) totalArea - a1Area) > (float) Math.pow(10, -5))
        	tapeLength = 0;
        
        return tapeLength;
        
    }
    
}