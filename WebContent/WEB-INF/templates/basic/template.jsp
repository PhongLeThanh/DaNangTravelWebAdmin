<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>   
 
<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<div id="content" style="background:#57a706; color:#FFF; height:200px; margin:20px 0px">
		<tiles:insertAttribute name="content"></tiles:insertAttribute>
	</div>
<tiles:insertAttribute name="footer"></tiles:insertAttribute>