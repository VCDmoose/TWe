import java.util.*;

class Line{

	static void printStar(int number){

		while(number>0){
			System.out.print("*");
			number--;
		}

	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in); 
		int starNumber = sc.nextInt();
		printStar(starNumber);
		
	}
}