public class MyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String Abcd = "Abcd^";
		String encode = Abcd.replaceAll("\\^", "%5E");
		
		
		String sourceStr = "abcdTedsEpuiuiSwqwqtT";
		String pattern = "TEST";
		String pattern1 = "TEXT";
		boolean found = StringOrder1(sourceStr, pattern);
		System.out.print("StringOrder1 returned: " + found + "\n");
		found = StringOrder2(sourceStr, pattern1);
		System.out.print("StringOrder2 returned: " + found +"\n");
	}
	
	public static boolean StringOrder1(String sourceStr, String pattern) {
		
		int i = 0;
		int j = 0;
		boolean found = false;
		while(i < pattern.length()) {
			while(j < sourceStr.length()) {
				if(pattern.charAt(i) == sourceStr.charAt(j)) {
					i++;
					if(i == pattern.length()) {
						found = true;
						break;
					}
				}
				if(found == true) {
					break;
				}
				j++;
			}
		}
		
		return found;
	}
	
	public static boolean StringOrder2(String sourceStr, String pattern) {
		
		
		int j = 0;
		boolean found = false;
		
		for(int i = 0; i < sourceStr.length(); i++) {
			if(sourceStr.charAt(i) == pattern.charAt(j)) {
				j++;
			}
			if(j == pattern.length()) {
				found = true;
				break;
			}
		}
			
		return found;
	}
	
}
