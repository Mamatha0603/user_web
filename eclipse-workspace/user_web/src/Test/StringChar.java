package Test;

public class StringChar {

	public static void main(String[] args) {
		String s="Kavitha";
		/*char[] array=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(i%2==1) {
				sb.append(array[i]);
			}else {
				sb2.append(array[i]);
				
			}
		}*/
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(i%2==1) {
				sb.append(s.charAt(i));
				
				}else {
					sb2.append(s.charAt(i));
				}
			
		}
		System.out.println("chars:"+sb);
		System.out.println("chars:"+sb2);

	}

}
