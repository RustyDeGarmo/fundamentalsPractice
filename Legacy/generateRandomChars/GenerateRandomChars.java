/*
	The purpose of this program is to generate and print 100 random uppercase 
	letters and then 100 single digits, printing 50 per line. Easily modified 
	to print different characters and different ammounts.
*/


public class GenerateRandomChars{
	public static void main(String[] args){
		printChars();
	}

	public static char getRandomCharacter(char ch1, char ch2){
		//generate a random character between ch1 and ch2
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a', 'z');
	}

	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0', '9');
	}

	public static char getRandomCharacter(){
		//generate any random character using hex
		return getRandomCharacter('\u0000', '\uFFFF');
	}

	public static void printChars(){
		for(int i = 0; i < 100; i++){
			if(i % 50 == 0){
				System.out.println();
			}
			System.out.print(getRandomUpperCaseLetter());
			
		}

		for(int i = 0; i < 100; i++){
			if(i % 50 == 0){
				System.out.println();
			}
			System.out.print(getRandomDigitCharacter());
			
		}
	}
}