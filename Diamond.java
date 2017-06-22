import java.util.*;

class Diamond{

	static void printChar(int number, char c){
				
		while(number>0){
			System.out.print(c);
			number--;
		}
	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in); 
		int lines = sc.nextInt();
		int i,j;
		
		for(i=0;i<lines;i++){
			printChar(lines-i-1, ' ');
			printChar((i*2)+1, '*');
			System.out.println();
		}
		
		for(i=lines-2;i>=0;i--){
			printChar(lines-i-1, ' ');
			printChar((i*2)+1, '*');
			System.out.println();
		}
	}
}