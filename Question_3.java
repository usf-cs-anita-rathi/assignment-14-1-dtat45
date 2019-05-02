
public class Question_3 
{
	
	public boolean contains(String haystack,String needle) {
		haystack=haystack.replaceAll("\\s+","");
		if(haystack.startsWith(needle))
			return true;
		else if(haystack.equals(""))
			return false;
		else {
			char c=haystack.charAt(0);
			String s=Character.toString(c);
			haystack=haystack.replaceFirst(s,"");
			return contains(haystack,needle);
		}
	}
	
	public static void main(String args[]) {
		Question_3 contain=new Question_3();
		System.out.println("Haystack: 'Java Programming' || Needle: 'ogr'");
		System.out.println(contain.contains("Java Programming","ogr"));
		System.out.println("Haystack: 'Java Programming' || Needle: 'grammy'");
		System.out.println(contain.contains("Java Programming","grammy"));
	}
}
