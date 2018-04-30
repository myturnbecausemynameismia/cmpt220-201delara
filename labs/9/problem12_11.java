//This program removes all occurences of a specified string from a text file
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class problem12_11 {

	public static void main(String[] args) throws Exception {
		//check command line parameter usage
		if(args.length != 2) {
			System.out.println(
					"Usage: java RemoveText text sourceFile");
			System.exit(1);
		}
		
		//Check if source file exists
		File sourceFile = new File(args[1]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[1] + " doesn't exist");
			System.exit(2);
		}
		
		//check if target file exists
		File targetFile = new File(args[1] + "output.txt");
		if (targetFile.exists()) {
			System.out.println("Target file " + "output.txt" + " already exists");
			System.exit(3);
		}
		
		Scanner input = new Scanner(sourceFile);
		PrintWriter output = new PrintWriter(targetFile);
		while(input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[0], "");
			output.println(s2);
		}
		input.close();
		output.close();
		
		// JA: You should rename the output file to be the input file
	}

}
