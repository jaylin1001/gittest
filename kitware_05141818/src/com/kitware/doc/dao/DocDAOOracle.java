package com.kitware.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kitware.doc.vo.DocDetailVO;
import com.kitware.doc.vo.DocVO;
import com.kitware.sql.MyConnection;

public class DocDAOOracle implements DocDAO{

	@Override
	public List<DocVO> selectAll() throws Exception {
		return null;
	}

	@Override
	public List<DocVO> selectIng(String emp_num) throws Exception { //진행문서(내가올린거) table list 뿌려주는 select
		//에러처리 catch로 안함
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	try{
		String selectIngSQL = "select d.start_date, dk.doc_name, d.doc_title, d.doc_num, d.doc_state"
							+" from document d, doc_kind dk"
							+" where d.doc_kind = dk.doc_kind"
							+" and d.emp_num = ?";//작은따옴표 줘야하나 에러나면 줘야함
		
		List<DocVO> list = new ArrayList<>(); //사이즈 변경 가능하며 null허용하는 arraylist
		con= MyConnection.getConnection();
		pstmt = con.prepareStatement(selectIngSQL);
		pstmt.setString(1, emp_num);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			list.add(new DocVO(
					rs.getString("START_DATE"),
					rs.getString("DOC_NAME"),
					rs.getString("DOC_TITLE"),
					rs.getString("DOC_NUM"),
					rs.getString("DOC_STATE")
					));
		}
		return list;
	}finally {
		MyConnection.close(rs, pstmt, con);
		}
	}
	@Override
	public List<DocVO> selectOk(String emp_num) throws Exception { //내가올린거 상태 완료인 문서 list로 뿌려주는 select
		
		//에러처리 catch로 안함
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	try{
		String selectIngSQL = "select d.start_date, dk.doc_name, d.doc_title, d.doc_num, d.doc_state"
							+" from document d, doc_kind dk"
							+" where d.doc_kind = dk.doc_kind"
							+" and d.emp_num = ?"
							+" and d.doc_state = 2";
		
		List<DocVO> list = new ArrayList<>(); //사이즈 변경 가능하며 null허용하는 arraylist selectIng이랑 list 같아도되나
		con= MyConnection.getConnection();
		pstmt = con.prepareStatement(selectIngSQL);
		pstmt.setString(1, emp_num);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			list.add(new DocVO(
					rs.getString("START_DATE"),
					rs.getString("DOC_NAME"),
					rs.getString("DOC_TITLE"),
					rs.getString("DOC_NUM"),
					rs.getString("DOC_STATE")
					));
		}
		return list;
	}finally {
		MyConnection.close(rs, pstmt, con);
		}
	}

	@Override
	public List<DocDetailVO> selectExpected(String conf_num) throws Exception {
	return null;
	
	}
}
