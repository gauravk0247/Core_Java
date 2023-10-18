// 18/10/23
// homework
class Demo11{
	public static void main(String[] args){
		String name= "resume.docx";
		int ext = name.indexOf(".");
		System.out.println(ext);
		System.out.println(name.substring(ext));
	}
}