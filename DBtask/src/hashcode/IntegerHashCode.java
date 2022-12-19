package hashcode;

public class IntegerHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer("155");  
		String i1= "155";
      
        int hashValue = i.hashCode(); 
        int hashvalue1 = i1.hashCode();
        System.out.println("Hashcode of an object is: "+hashValue);
        System.out.println("Hashcode of an object is: " +hashvalue1);
        
	}

}
