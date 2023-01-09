package com.files.io.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.files.io.entity.ResponseData;
import com.files.io.exception.FileFormatNotSupported;
import com.files.io.exception.FileNotUploaded;

public interface FileService {
	public String saveAllAttachment(List<ResponseData> file) throws Exception, FileNotUploaded, FileFormatNotSupported;

	public ResponseData getAttachment(String fileName) throws Exception;

	public Object[] frequencyComputer(BufferedReader bufferedReader) throws IOException;

	public List<String> uniqueWords(Map<String, Integer> countMap);

	public List<String> matchingWords(Map<String, Integer> countMap);
	
	public void alternativePrinting(Vector<String> fileOneSentence, Vector<String> fileTwoSentence) throws IOException;

}
