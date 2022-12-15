package com.files.io.service;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.function.BiConsumer;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.IOUtils;
//import org.springframework.mock.web.MockMultipartFile;

import com.files.io.entity.ResponseData;
import com.files.io.exception.FileFormatNotSupported;
import com.files.io.exception.FileNotUploaded;
import com.files.io.repository.FileRepository;

@Service
public class FileServiceImpl implements FileService {

	static Map<String, Integer> countMap = new HashMap<String, Integer>();
	private FileRepository fileRepository;

	public FileServiceImpl(FileRepository fileRepository) {
		this.fileRepository = fileRepository;
	}

	@Override
	public String saveAllAttachment(List<ResponseData> fileList)
			throws Exception, FileNotUploaded, FileFormatNotSupported {
		if (fileList.size() == 0) {
			throw new FileNotUploaded("Hi1");
		}
		for (ResponseData fileModal : fileList) {
			if (fileModal == null || fileModal.equals(null)) {
				throw new FileNotUploaded("Hi2");
			}
			if (fileModal.getFileType().equals("text/plain")) {
				ResponseData responseData = new ResponseData(fileModal.getFileName(), fileModal.getFileType(),
						fileModal.getDownloadURL(), fileModal.getData(), fileModal.getFileSize());
				fileRepository.save(fileModal);
			} else {
				throw new FileFormatNotSupported(
						"File Format " + fileModal.getFileType() + " Not Supported, Expecting File Type: text/plain");
			}
		}
		return "Uploaded Files Successfully";
	}

	@Override
	public ResponseData getAttachment(String fileName) {
//		System.out.println(new String(fileRepository.findByFileName(fileName).getData()));
		return fileRepository.findByFileName(fileName);
	}

	@Override
	public Object[] frequencyComputer(BufferedReader bufferedReader) throws IOException {
		String word;
		Vector<String> fileSentence = new Vector<>();
		word = bufferedReader.readLine();
		int fileLineCount = 0;
		while (word != null) {
			String[] words = word.split("[\\s.@&.?;*,!$+-0-9]+");
			for (int i = 0; i < words.length; ++i) {
				if (countMap.get(words[i]) == null) {
					countMap.put(words[i], 1);
				} else {
					countMap.put(words[i], countMap.get(words[i]) + 1);
				}
			}
			fileLineCount++;
			fileSentence.add(word);
			word = bufferedReader.readLine();
		}
		return new Object[] { countMap, fileLineCount, fileSentence };
	}

	public List<String> uniqueWords(Map<String, Integer> countMap) {
		List<String> uniqueWordsList = new ArrayList<String>();
		countMap.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String key, Integer value) {
				if (value == 1) {
					uniqueWordsList.add(key);
				}
			}
		});
		return uniqueWordsList;
	}

	public List<String> matchingWords(Map<String, Integer> countMap) {
		List<String> matchingWordsList = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				matchingWordsList.add(entry.getKey());
			}
		}
		return matchingWordsList;
	}

	public void alternativePrinting(Vector<String> fileOneSentence, Vector<String> fileTwoSentence) throws IOException {
		Iterator<String> fileOneLine = fileOneSentence.iterator();
		Iterator<String> fileTwoLine = fileTwoSentence.iterator();
		Vector<String> result = new Vector<>();
		File outputFile = new File("output.txt");
		outputFile.createNewFile();
		FileWriter myWriter = new FileWriter("output.txt");

		while (fileOneLine.hasNext() | fileTwoLine.hasNext()) {
			if (fileOneLine.hasNext())
				result.add(fileOneLine.next());
			if (fileTwoLine.hasNext())
				result.add(fileTwoLine.next());
		}

		for (String line : result) {
			myWriter.write(line);
			myWriter.write("\n");
		}

		myWriter.flush();
		myWriter.close();
	}
}
