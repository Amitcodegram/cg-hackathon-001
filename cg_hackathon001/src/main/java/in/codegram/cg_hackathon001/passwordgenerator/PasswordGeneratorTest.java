package in.codegram.cg_hackathon001.passwordgenerator;

public class PasswordGeneratorTest {

	public static void main(String[] args) {
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		String generatedPassword = passwordGenerator.generatePassword(firstName, lastName, yob);
		System.out.println("Password is : "+generatedPassword);
		

	}

}
