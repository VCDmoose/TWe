import java.util.*;

class RTriangle{

	static void printStar(int number){

		while(number>0){
			System.out.print("*");
			number--;
		}
		System.out.println();

	}

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in); 
		int starNumber = sc.nextInt();
		int i;

		for(i=1;i<=starNumber;i++)
			printStar(i);
		
	}
}