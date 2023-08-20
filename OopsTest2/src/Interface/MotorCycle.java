package Interface;

public class MotorCycle implements Vehicle {

	@Override
	public void start() {

		System.out.println("Start");
	}

	@Override
	public void accelerate() {

		System.out.println("Speed up");
	}

	@Override
	public void brake() {

		System.out.println("Stop");
	}

}
