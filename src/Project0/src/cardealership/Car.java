package cardealership;

import java.util.HashMap;

public class Car {
	protected static int serialNum;
	protected String carMake;
	
	public Car(int serialNum, String carMake) {
		
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

}
