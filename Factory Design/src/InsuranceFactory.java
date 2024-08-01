
public class InsuranceFactory {
	
	public static Insurance insuranceType(String type) {
		
		if(type==null){
			return null;  
	    }else if(type.equalsIgnoreCase("life")) {
			return new LifeInsurance();
		}else if (type.equalsIgnoreCase("general")) {
			return new GeneralInsurance();
		}throw new IllegalArgumentException("Invalid input from user..");
		
			
			
		
		
	}
	
	

}
