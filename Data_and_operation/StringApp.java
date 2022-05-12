
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); // String
		// System.out.println('Hello World'); 
		// 작은 따옴표는 문자열이 아닌 character 라는 데이터타입
		System.out.println('H'); // character
		System.out.println("H");
		
		System.out.println("Hello "
				+ "World"); // 문자열 붙일뿐 줄바꿈이 되진않
		// new line
		System.out.println("Hello \nWorld"); // \n은 new line의 약
		// escape 방식 \"
		System.out.println("Hello \"World\"");// Hello "World"
	}

}
