import java.util.*;

class PrimeFact{

	static boolean isPrime(int num) {
		if (num==2) 
			return true;
    	if (num%2==0) 
    		return false;
    	for(int i=3;i*i<=num;i+=2) {
        	if(num%i==0)
            	return false;
    	}
    	return true;
	}

	static List<Integer> primeFact(int n) {
		List<Integer> fact = new ArrayList<Integer>();

		if( n==1 ){
			return fact;
		}


		if(isPrime(n)){
			fact.add(n);
			return fact;
		}

		for(int i=2; i<n/2; i++){
			if(isPrime(i)){
				if(n%i==0){
					fact=primeFact(n/i);
					fact.add(i);
					return fact;
				}
			}
		}

		return fact;
		
	}

	public static void main(String[] args){


		Scanner sc=new Scanner(System.in); 
		int number = sc.nextInt();
		List<Integer> fact = primeFact(number);
		for(int i : fact )
			System.out.println(i);

	}
}