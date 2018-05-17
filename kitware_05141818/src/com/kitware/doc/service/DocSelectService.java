package com.kitware.doc.service;

import java.util.List;

import com.kitware.doc.dao.DocDAO;
import com.kitware.doc.dao.DocDAOOracle;
import com.kitware.doc.vo.DocVO;

public class DocSelectService {
	private DocDAO dao = new DocDAOOracle();
	public List<DocVO> findIng(String emp_num) throws Exception{
		return dao.selectIng(emp_num);
	}
	public List<DocVO> findOk(String emp_num) throws Exception{
		return dao.selectOk(emp_num);
	}

}
