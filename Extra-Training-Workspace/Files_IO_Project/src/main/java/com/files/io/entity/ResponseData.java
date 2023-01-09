package com.files.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ResponseData {
	

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String fileName;
	private String fileType;
	private String downloadURL;
	private long fileSize;

	/* File Stored In The Form Of Byte Array Data (BLOB) */
	@Lob
	@Column(name = "fileData")
	private byte[] data;

	public ResponseData(String fileName, String fileType, String downloadURL, byte[] data, long fileSize) {
		this.fileName = fileName;
		this.fileType = fileType;
		this.downloadURL = downloadURL;
		this.data = data;
		this.fileSize = fileSize;
	}

}
