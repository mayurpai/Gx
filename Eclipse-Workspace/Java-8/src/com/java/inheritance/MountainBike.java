package com.java.inheritance;

public class MountainBike extends Bicycle {

	public int seatHeight;

	public MountainBike(int gear, int speed) {
		super(gear, speed);
	}

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}


}
