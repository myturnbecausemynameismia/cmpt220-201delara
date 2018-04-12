import java.io.File;
import java.util.Scanner;

//This program counts the number of characters, words, and lines in a file

public class problem12_13 {

	public static void main(String[] args) throws Exception {
		//Check command line parameter usage
		if(args.length != 1) {
			System.out.println("Usage: java problem12_13 fileName");
			System.exit(1);
		}
		
		//check if file exists
		File fileName = new File(args[0]);
		if(!fileName.exists()) {
			System.out.println("\"" + fileName + "\"" + " does not exist");
			System.exit(2);
		}
		
		//init counters
		int characters = 0;
		int words = 0;
		int lines = 0;
		
		//
		Scanner input = new Scanner(fileName);
		while(input.hasNext()) {
			//String s1 = input.nextLine();
			String s = input.nextLine();
            lines++;
            characters += s.length();
            String[] split = s.split(" ");
            for (String word : split) {
                words++;
            }
			//words++;
			
			//characters += s1.length();
			///STILL NEED TO COUNT LINES
			//lines += getLineCount(s1);
		}
		
		System.out.println("File " + fileName + " has\n" + 
		characters + " characters\n" +
				words + " words\n" +
				lines + " lines");
		
	}
	
	public static int getLineCount(String text){ //not sure if this works, not tested yet
        
        return text.split("[\n|\r]").length;
    }

}
