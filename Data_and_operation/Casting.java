
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double)1; // 위의 것과 같은 형식
		System.out.println(b); // 1.0
		// int값은 double로 입력해도 잃는 값이 없기에 가능
		
		// int c = 1.1;
		double d = 1.1; 
		int e = (int) 1.1; // 명시적으로 int로 바꿔서 손실을 감안하고 int 형태
		System.out.println(e); 
		
		// 1 을 String으로 바꾸기
		String f = Integer.toString(1); // 1이라는 정수(integer)를 Stringg형식으로 바꿔서 f에 넣겠
		System.out.println(f.getClass()); // f가 어떤 데이터형식을 가지고있는지 알려줌
		
	}

}
