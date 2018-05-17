package com.kitware.doc.vo;

public class DocVO {
   private String doc_num;
   private int doc_kind;
   private String emp_num;
   private String doc_state;
   private String doc_title;
   private String doc_content;
   private String start_date;
   private String rcv_dept;
   private String coper_dept;
   private String refer;

  

   public DocVO(String doc_num, int doc_kind, String emp_num, String doc_state, String doc_title, String doc_content,
		String start_date, String rcv_dept, String coper_dept, String refer) {
	super();
	this.doc_num = doc_num;
	this.doc_kind = doc_kind;
	this.emp_num = emp_num;
	this.doc_state = doc_state;
	this.doc_title = doc_title;
	this.doc_content = doc_content;
	this.start_date = start_date;
	this.rcv_dept = rcv_dept;
	this.coper_dept = coper_dept;
	this.refer = refer;
}




public DocVO(String doc_num, String emp_num, String doc_state, String doc_title, String doc_content) {
      super();
      this.doc_num = doc_num;
      this.emp_num = emp_num;
      this.doc_state = doc_state;
      this.doc_title = doc_title;
      this.doc_content = doc_content;
   }

   
   
   
   public String getDoc_num() {
      return doc_num;
   }

   public void setDoc_num(String doc_num) {
      this.doc_num = doc_num;
   }

   public int getDoc_kind() {
      return doc_kind;
   }

   public void setDoc_kind(int doc_kind) {
      this.doc_kind = doc_kind;
   }

   public String getEmp_num() {
      return emp_num;
   }

   public void setEmp_num(String emp_num) {
      this.emp_num = emp_num;
   }

   public String getDoc_state() {
      return doc_state;
   }

   public void setDoc_state(String doc_state) {
      this.doc_state = doc_state;
   }

   public String getDoc_title() {
      return doc_title;
   }

   public void setDoc_title(String doc_title) {
      this.doc_title = doc_title;
   }

   public String getDoc_content() {
      return doc_content;
   }

   public void setDoc_content(String doc_content) {
      this.doc_content = doc_content;
   }

   public String getStart_date() {
      return start_date;
   }

   public void setStart_date(String start_date) {
      this.start_date = start_date;
   }

   public String getRcv_dept() {
      return rcv_dept;
   }

   public void setRcv_dept(String rcv_dept) {
      this.rcv_dept = rcv_dept;
   }

   public String getCoper_dept() {
      return coper_dept;
   }

   public void setCoper_dept(String coper_dept) {
      this.coper_dept = coper_dept;
   }

   public String getRefer() {
      return refer;
   }

   public void setRefer(String refer) {
      this.refer = refer;
   }

}