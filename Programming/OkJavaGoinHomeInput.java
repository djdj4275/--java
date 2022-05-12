import javax.swing.JOptionPane; //javax 에 속해있는 joptionpane swing을 들고

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHomeInput {

	// args는 parameter - 매개변수
	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter a ID");
		// 프롬프트창 열어서 그 값을 id 값으로 지정해주는것과 비슷
//		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call (1층으로)
		Elevator myElevator = new Elevator(id);
		// myElevator라는 변수는 Elevator라는 데이터타에 해당되는 데이터만 올수있다.
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		// bright로서 받아오는 값은 string인데 밑의 setBright로서 쓸수있는 값은 double이기에 에러가
		// 그래서 형 변환을 해줌 
		moodLamp.on();
		
	}

}
