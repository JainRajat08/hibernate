package tablePerClass;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {
	
	private String SteeringWheel;

	/**
	 * @return the steeringWheel
	 */
	public String getSteeringWheel() {
		return SteeringWheel;
	}

	/**
	 * @param steeringWheel the steeringWheel to set
	 */
	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}

}
