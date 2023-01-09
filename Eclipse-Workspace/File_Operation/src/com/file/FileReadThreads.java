package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadThreads {
	static BufferedReader bufferedReaderFileOne;
	static BufferedReader bufferedReaderFileTwo;

	public static void fileRead() throws InterruptedException {

		Thread firstThread = new Thread() {
			@Override
			public void run() {
				try {
					bufferedReaderFileOne = new BufferedReader(new FileReader("resource/sampleInputOne.txt"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				super.run();
			}
		};
		Thread secondThread = new Thread() {
			@Override
			public void run() {
				try {
					bufferedReaderFileTwo = new BufferedReader(new FileReader("resource/sampleInputTwo.txt"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				super.run();
			}
		};
		firstThread.start();
		secondThread.start();
		firstThread.join();
		secondThread.join();
	}

}
