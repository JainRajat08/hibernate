package joined;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
	
	private String SteeringHandle;

	/**
	 * @return the steeringHandle
	 */
	public String getSteeringHandle() {
		return SteeringHandle;
	}

	/**
	 * @param steeringHandle the steeringHandle to set
	 */
	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
	
	

}
