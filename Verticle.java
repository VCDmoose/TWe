import java.util.*;

class Verticle{

	static void printStar(int number){

			while(number>0){
			System.out.println("*");
			number--;
		}

	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in); 
		int starNumber = sc.nextInt();
		printStar(starNumber);
		
	}
}