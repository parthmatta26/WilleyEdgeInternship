
public class EmployeeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(101,"John Doe");
		Employee e2=new Employee(102,"John Doe");
		//System.out.println(e1);//invokes the toString method implicitly
//		if(e1==e2)
//			System.out.println("Objects are equal");
//		else
//			System.out.println("Objects are not equal");
//		
		
		if(e1.equals(e2)) {
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		Employee e3=(Employee)e2.clone();//any predefined method which returns you object, has the return type of Object class type. 
		//subclass ref=new super class();
		System.out.println(e2 +" "+e2.hashCode());
		System.out.println(e3+"  "+e3.hashCode());
		//e2.empName="William";
		System.out.println(e2);
		System.out.println(e3);
		
		
		
		
		
		
	}

}
