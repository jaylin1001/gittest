package com.kitware.doc.vo;

import java.util.List;

public class DocDetailVO {
	private String doc_num;
	private String conf_num;
	private int sunbeon;
	private String acs_yn;
	private String cmt;
	private String rcv_date;
	private String acs_date;
	private List<DocVO> document;
	
	public DocDetailVO() {
		super();
	}
	
	public DocDetailVO(String doc_num, String conf_num, int sunbeon, String acs_yn, String cmt, String rcv_date,
			String acs_date, List<DocVO> document) {
		super();
		this.doc_num = doc_num;
		this.conf_num = conf_num;
		this.sunbeon = sunbeon;
		this.acs_yn = acs_yn;
		this.cmt = cmt;
		this.rcv_date = rcv_date;
		this.acs_date = acs_date;
		this.document = document;
	}

	public String getDoc_num() {
		return doc_num;
	}

	public void setDoc_num(String doc_num) {
		this.doc_num = doc_num;
	}

	public String getConf_num() {
		return conf_num;
	}

	public void setConf_num(String conf_num) {
		this.conf_num = conf_num;
	}

	public int getSunbeon() {
		return sunbeon;
	}

	public void setSunbeon(int sunbeon) {
		this.sunbeon = sunbeon;
	}

	public String getAcs_yn() {
		return acs_yn;
	}

	public void setAcs_yn(String acs_yn) {
		this.acs_yn = acs_yn;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getRcv_date() {
		return rcv_date;
	}

	public void setRcv_date(String rcv_date) {
		this.rcv_date = rcv_date;
	}

	public String getAcs_date() {
		return acs_date;
	}

	public void setAcs_date(String acs_date) {
		this.acs_date = acs_date;
	}

	public List<DocVO> getDocument() {
		return document;
	}

	public void setDocument(List<DocVO> document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "DocDetailVO [doc_num=" + doc_num + ", conf_num=" + conf_num + ", sunbeon=" + sunbeon + ", acs_yn="
				+ acs_yn + ", cmt=" + cmt + ", rcv_date=" + rcv_date + ", acs_date=" + acs_date + ", document="
				+ document + "]";
	}
	
	
}
