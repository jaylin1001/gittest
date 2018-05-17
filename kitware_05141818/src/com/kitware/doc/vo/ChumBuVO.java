package com.kitware.doc.vo;

import java.util.List;

public class ChumBuVO {
	private String doc_num;
	private int file_num;
	private String file_name;
	private int file_size;
	private String file_path;
	private List<DocVO> document;
	
	
	public ChumBuVO() {
		super();
	}
	public ChumBuVO(String doc_num, int file_num, String file_name, int file_size, String file_path,
			List<DocVO> document) {
		super();
		this.doc_num = doc_num;
		this.file_num = file_num;
		this.file_name = file_name;
		this.file_size = file_size;
		this.file_path = file_path;
		this.document = document;
	}
	public String getDoc_num() {
		return doc_num;
	}
	public void setDoc_num(String doc_num) {
		this.doc_num = doc_num;
	}
	public int getFile_num() {
		return file_num;
	}
	public void setFile_num(int file_num) {
		this.file_num = file_num;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public int getFile_size() {
		return file_size;
	}
	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public List<DocVO> getDocument() {
		return document;
	}
	public void setDocument(List<DocVO> document) {
		this.document = document;
	}
	@Override
	public String toString() {
		return "ChumBuVO [doc_num=" + doc_num + ", file_num=" + file_num + ", file_name=" + file_name + ", file_size="
				+ file_size + ", file_path=" + file_path + ", document=" + document + "]";
	}
	
	
	
}
