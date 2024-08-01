import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
	try {
		System.out.println("Enter the Insurance Type ");

		Scanner sc = new Scanner(System.in);
		String insurance = sc.next();
		
		Insurance ins = InsuranceFactory.insuranceType(insurance);
		
		System.out.println(ins.getInsurance());
		
		
		
	}catch(Exception e){
	}
		
		
	}

}
