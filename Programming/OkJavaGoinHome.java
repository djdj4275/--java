import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
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
		
	}

}
