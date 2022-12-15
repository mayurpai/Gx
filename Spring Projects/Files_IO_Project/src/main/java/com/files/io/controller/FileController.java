package com.files.io.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.files.io.exception.FileFormatNotSupported;
import com.files.io.exception.FileNotUploaded;
import com.files.io.entity.ResponseData;
import com.files.io.service.FileService;

@RestController
@RequestMapping("file/api/v1")
public class FileController {

	private FileService fileService;

	public FileController(FileService fileService) {
		this.fileService = fileService;
	}

	@PostMapping("/upload")
	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile[] file)
			throws IOException, FileNotUploaded, FileFormatNotSupported, Exception {
		ResponseData responseData = null;
		List<ResponseData> fileList = new ArrayList<ResponseData>();
		try {
			for (MultipartFile files : file) {
				String fileName = files.getOriginalFilename();
				String fileContentType = files.getContentType();
				String downloadURl = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/")
						.path(files.getName()).toUriString();
				long fileSize = files.getSize();
				responseData = new ResponseData(fileName, fileContentType, downloadURl, files.getBytes(), fileSize);
				fileList.add(responseData);
			}

			fileService.saveAllAttachment(fileList);
			return ResponseEntity.status(HttpStatus.OK).body(fileList);
		} catch (IOException e) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e.getMessage());
		} catch (FileFormatNotSupported e) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(e.getMessage());
		} catch (FileNotUploaded e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
			String message = "Failed To Upload Files!";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
		}
	}

	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) throws Exception {
		ResponseData responseData = null;
		responseData = fileService.getAttachment(fileName);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(responseData.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + responseData.getFileName() + "\"")
				.body(new ByteArrayResource(responseData.getData()));
	}

	@GetMapping("/view/{fileName}")
	public ResponseEntity<?> viewFileInfo(@PathVariable String fileName) throws Exception, NullPointerException {
		ResponseData responseData = null;
		byte[] byteArrayResource;
		try {
			responseData = fileService.getAttachment(fileName);
			byteArrayResource = responseData.getData();
		} catch (NullPointerException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(byteArrayResource);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/process/{fileOneName}/{fileTwoName}")
	public ResponseEntity<?> processingFiles(@PathVariable String fileOneName, @PathVariable String fileTwoName)
			throws Exception {
		ResponseData responseOneData = null;
		ResponseData responseTwoData = null;
		byte[] byteArrayOneResource;
		byte[] byteArrayTwoResource;
		responseOneData = fileService.getAttachment(fileOneName);
		byteArrayOneResource = responseOneData.getData();
		responseTwoData = fileService.getAttachment(fileTwoName);
		byteArrayTwoResource = responseTwoData.getData();
		InputStream targetOneStream = new ByteArrayInputStream(byteArrayOneResource);
		InputStream targetTwoStream = new ByteArrayInputStream(byteArrayTwoResource);
		BufferedReader bufferedReaderFileOne = new BufferedReader(new InputStreamReader(targetOneStream));
		BufferedReader bufferedReaderFileTwo = new BufferedReader(new InputStreamReader(targetTwoStream));
		Object[] outputFileOne = fileService.frequencyComputer(bufferedReaderFileOne);
		Object[] outputFileTwo = fileService.frequencyComputer(bufferedReaderFileTwo);
		System.out.println("Occurrence: " + (Map<String, Integer>) outputFileOne[0]);
		System.out.println("Matching Words: " + fileService.matchingWords((Map<String, Integer>) outputFileOne[0]));
		System.out.println("Unique Words: " + fileService.uniqueWords((Map<String, Integer>) outputFileOne[0]));
		fileService.alternativePrinting((Vector<String>) outputFileOne[2], (Vector<String>) outputFileTwo[2]);
		return ResponseEntity.status(HttpStatus.OK).body(bufferedReaderFileOne);
	}

	@GetMapping("/downloadFile")
	private ResponseEntity<?> downloadFile(HttpServletResponse response) throws IOException {
		ResponseEntity<?> responseEntity = null;
		String outputPath = "C:\\Users\\mbantwal\\eclipse-workspace\\Files_IO_Project\\output.txt";
		File file = new File(outputPath);
		response.setContentType("application/octet-stream");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Disposition", "attachment; filename" + file.getName());

		ServletOutputStream outputStream = response.getOutputStream();

		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));

		byte[] buffer = new byte[8192];
		int bytesRead = -1;

		while ((bytesRead = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, bytesRead);
		}
		inputStream.close();

		outputStream.close();

		return responseEntity;

	}

}
