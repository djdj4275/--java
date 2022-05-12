import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2");
		
//      위의 두가지는 result라는 텍스트파일을 만들고 그것의 내용을 hello로 적어
//      PrintWriter라는 클래스를 p2 라는 이름으로 복사하여 사용한다는 의미 (인스턴스 생성)
//      그리고 그 인스턴스는 PrintWriter라는 데이터형식이라고 정의해주기위해 앞에 적어
		
	}

}
