package com.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;

public class Main {

	/*
	 * Map Used For Getting The Frequency Of Each Word In Both The Files
	 */
	static Map<String, Integer> countMap = new HashMap<String, Integer>();

	/*
	 * Function To Check Unique Words In Both The Files
	 */
	public static void uniqueWords(Map<String, Integer> countMap) {
		List<String> uniqueWordsList = new ArrayList<String>();
		countMap.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String key, Integer value) {
				if (value == 1) {
					uniqueWordsList.add(key);
				}
			}
		});
		System.out.println("Unique Words: " + uniqueWordsList);
	}

	/*
	 * Function To Check Matching Words In Both The Files
	 */
	public static void matchingWords(Map<String, Integer> countMap) {
		List<String> matchingWordsList = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				matchingWordsList.add(entry.getKey());
			}
		}
		System.out.println("Matching Words: " + matchingWordsList);
	}

	/*
	 * Function To Merge Both Files Alternatively Line By Line
	 */
	public static void alternativePrinting(Vector<String> fileOneSentence, Vector<String> fileTwoSentence)
			throws FileNotFoundException {
		Iterator<String> fileOneLine = fileOneSentence.iterator();
		Iterator<String> fileTwoLine = fileTwoSentence.iterator();
		Vector<String> result = new Vector<>();
		PrintWriter printWriter = new PrintWriter("resource/output.txt");

		while (fileOneLine.hasNext() | fileTwoLine.hasNext()) {
			if (fileOneLine.hasNext())
				result.add(fileOneLine.next());
			if (fileTwoLine.hasNext())
				result.add(fileTwoLine.next());
		}

		for (String line : result)
			printWriter.println(line);

		printWriter.flush();
		printWriter.close();

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		/*
		 * Calling FileReadThreads Class For Instantiating Threads
		 */
		FileReadThreads.fileRead();

		String word;
		word = FileReadThreads.bufferedReaderFileOne.readLine();
		Vector<String> fileOneSentence = new Vector<>();
		Vector<String> fileTwoSentence = new Vector<>();

		while (word != null) {
			String[] words = word.split("[\\s.@&.?;*,!$+-0-9]+");
			for (String wordTemp: words) {
				if (countMap.get(wordTemp) == null) {
					countMap.put(wordTemp, 1);
				} else {
					countMap.put(wordTemp, countMap.get(wordTemp) + 1);
				}
			}
			/*
			 * // In Order To Get The Thread Id That Is Currently Running
			 * System.out.println("Thread For File 2 Used: " +
			 * secondThread.currentThread().getId());
			 */
			fileOneSentence.add(word);
			word = FileReadThreads.bufferedReaderFileOne.readLine();
		}

		word = FileReadThreads.bufferedReaderFileTwo.readLine();
		while (word != null) {
			String[] words = word.split("[\\s.@&.?;*,!$+-0-9]+");
			for (int i = 0; i < words.length; ++i) {
				if (countMap.get(word) == null) {
					countMap.put(word, 1);
				} else {
					countMap.put(word, countMap.get(word) + 1);
				}
			}
			/*
			 * // In Order To Get The Thread Id That Is Currently Running
			 * System.out.println("Thread For File 2 Used: " +
			 * secondThread.currentThread().getId());
			 */
			fileTwoSentence.add(word);
			word = FileReadThreads.bufferedReaderFileTwo.readLine();
		}

		/*
		 * Calling Each Function To Perform It's Respective Operations
		 */
		System.out.println("Occurrence Count: " + countMap);
		uniqueWords(countMap);
		matchingWords(countMap);
		alternativePrinting(fileOneSentence, fileTwoSentence);

		/*
		 * Closing Files Once They Are Used
		 */
		FileReadThreads.bufferedReaderFileOne.close();
		FileReadThreads.bufferedReaderFileTwo.close();

	}

}
