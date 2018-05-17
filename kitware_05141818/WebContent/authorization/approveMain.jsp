<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../container/header.jsp"%>
<div id="div1"></div>
<div class="container">
	<p>
	<h2>전자결재</h2>
	<h4>결재대기문서</h4>
	<table class="table table-striped table-hover">
		<thead>
			<tr class="active">
				<th width="15%">기안일</th>
				<th width="45%">제목</th>
				<th width="10%">결재양식</th>
				<th width="20%">문서번호</th>
				<th width="10%">결재상태</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글1제목</a></td>
				<td>기안서</td>
				<td>1805-0001</td>
				<td>진행중</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글2제목</a></td>
				<td>기안서</td>
				<td>1805-0002</td>
				<td>완료</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글3제목</a></td>
				<td>외근</td>
				<td>1805-0003</td>
				<td>진행중</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글4제목</a></td>
				<td>병가</td>
				<td>1805-0004</td>
				<td>반려</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글5제목</a></td>
				<td>기안서</td>
				<td>1805-0005</td>
				<td>진행중</td>
			</tr>
			
			
		
		</tbody>
	</table>
	
	<h4>기안진행문서</h4>
	<table class="table table-striped table-hover">
		<thead>
			<tr class="active">
				<th width="15%">기안일</th>
				<th width="45%">제목</th>
				<th width="10%">결재양식</th>
				<th width="20%">문서번호</th>
				<th width="10%">결재상태</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글1제목</a></td>
				<td>기안서</td>
				<td>1805-0001</td>
				<td>진행중</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글2제목</a></td>
				<td>기안서</td>
				<td>1805-0002</td>
				<td>완료</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글3제목</a></td>
				<td>외근</td>
				<td>1805-0003</td>
				<td>진행중</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글4제목</a></td>
				<td>병가</td>
				<td>1805-0004</td>
				<td>반려</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글5제목</a></td>
				<td>기안서</td>
				<td>1805-0005</td>
				<td>진행중</td>
			</tr>
			
			
		
		</tbody>
	</table>
	<h4>완료 문서</h4>
	<table class="table table-striped table-hover">
		<thead>
			<tr class="active">
				<th width="15%">기안일</th>
				<th width="45%">제목</th>
				<th width="10%">결재양식</th>
				<th width="20%">문서번호</th>
				<th width="10%">결재상태</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글1제목</a></td>
				<td>기안서</td>
				<td>1805-0001</td>
				<td>진행중</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글2제목</a></td>
				<td>기안서</td>
				<td>1805-0002</td>
				<td>완료</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글3제목</a></td>
				<td>외근</td>
				<td>1805-0003</td>
				<td>진행중</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글4제목</a></td>
				<td>병가</td>
				<td>1805-0004</td>
				<td>반려</td>
			</tr>
			<tr>
				<td>2018-05-11</td>
				<td><a href="#">글5제목</a></td>
				<td>기안서</td>
				<td>1805-0005</td>
				<td>진행중</td>
			</tr>
			
			
		
		</tbody>
	</table>
	
	
</div>
<style>
.container {
	padding-right: 350px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}



body {
	width: 100%;
	margin: 0;
	padding: 0;
}



button {
	background-color: #337ab7; /* Green */
	border: none;
	color: white;
	padding: 8px 10px;
	border-radius: 5px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
</style>

<script>

	var className = 'authorization';
	$('div#menutab li.'+className).addClass('active');
	$('ul#side-menu').find('li.' + className).show();
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<%@include file="../container/footer.jsp"%>