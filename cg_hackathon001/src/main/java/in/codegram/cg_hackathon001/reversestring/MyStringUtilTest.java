package in.codegram.cg_hackathon001.reversestring;

public class MyStringUtilTest {
	
	public static void main(String[] args) {
		MyStringUtil myStringUtil = new MyStringUtil();
		String originalString = "";
		String changedString = myStringUtil.reverseIt(originalString);
		System.out.println("Original String : "+originalString);
		System.out.println("Changed String : "+changedString);
	}

}
