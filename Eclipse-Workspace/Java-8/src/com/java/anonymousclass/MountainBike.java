package com.java.anonymousclass;

public class MountainBike implements Bicycle {

	public static int speed;

	public MountainBike() {
	}

	public MountainBike(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return speed;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void applyBrake(int decrement) {
		speed = speed - decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	public static void main(String[] args) {
		Bicycle mountainBike = new MountainBike();
		mountainBike.applyBrake(3);
		mountainBike.speedUp(5);

		Bicycle bicycle = new Bicycle() {

			@Override
			public void speedUp(int increment) {
				speed += increment;
				System.out.println(speed);

			}

			@Override
			public void applyBrake(int decrement) {
				speed -= decrement;
				System.out.println(speed);

			}
		};
		bicycle.speedUp(7);
	}

}
