package assignmentday6;

public class EmailException {
	String email;
	
	public EmailException(String email) {
		this.email = email;
	}

	
	void validate() throws InvalidEmailException {
			int dot = 0, at = 0;
			for(int i = 0; i < email.length(); i++) {
				if(email.charAt(i) == '.') {
					dot = i;
				}
				else if(email.charAt(i) == '@') {
					if(at == 0)
						at = i;
					else {
						at = -1;
						break;
					}
				}
			}
			if(at < dot && dot > 0 && dot != email.length()-1 && at > 0 && at != email.length()-1) {
				System.out.println("Your email address is valid.");
			}
			else {
				throw new InvalidEmailException("Your email address is invalid.");
			}
	}
	public static void main(String[] args) {
		
		EmailException e1 = new EmailException("parth.matta26@gmail.com");
		EmailException e2 = new EmailException("wiley@g@.com");
		
		try {
			System.out.println("Entered email address : " + e1.email);
			e1.validate();
			System.out.println("Entered email address : " + e2.email);
			e2.validate();
		}
		catch(InvalidEmailException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
