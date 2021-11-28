import java.util.Random;

public class CredentialService {
	// generate email address
	public String generateEmailAddress(Employee emp) {
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment().toLowerCase() + ".abc.com";
	}
	
	
	public String generatePassword() {
		// String builder
		Random random = new Random();
		// Generate a 8 digit password which can have capital letters, small letters, numbers, special characters
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
		}
		return new String(password);
	}
	
	public void showCredentials(Employee emp,String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + "- here are your credentials");
		System.out.println("Email Address--> "+email);
		System.out.println("Pasword--> "+password);
		
	}
}
