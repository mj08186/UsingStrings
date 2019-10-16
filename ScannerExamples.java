import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		String s1 = "Dog, Wags, Bob Marley";
		String s2 = "Cat, Fritz, Mary Beth";
		String s3 = "Hamster, Fred, Jane-Doe Brown";
		String s4 =s1 +"\n" + s2 + "\n" + s3;  
		
		//create a scanner object
		Scanner scan = new Scanner(s1).useDelimiter(", | \\s");
		
		//Display the token
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		
		//working with lines instead of words
		Scanner line = new Scanner(s4);
		
		while(line.hasNextLine()) {
			Scanner word = new Scanner(line.nextLine());
			System.out.println(word.next());
			System.out.println(word.next());	
		}
	}

}
