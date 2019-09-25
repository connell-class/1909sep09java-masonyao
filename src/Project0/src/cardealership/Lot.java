package cardealership;

import java.util.HashMap;

public class Lot {
	private static HashMap<Integer, Object> carLot = new HashMap<Integer,Object>();
	
	private Lot() {};
	
	public boolean storeCar(Car car) {
		if(carLot.containsKey(car.getSerialNum())){
			return false;
		}else {
			carLot.put(car.getSerialNum(), car);
			return true;
		}
	}
	public Car retrieveCar(int serialNum) {
		Car car = (Car) carLot.get(serialNum);
		if(carLot.containsKey(serialNum)) {
			return car;
		}else {
			return null;
		}
	}
	public static Car createCar(int serialNum, String carMake) {
		Car car = new Car(serialNum, carMake);
		return car;
	}
}
