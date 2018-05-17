<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/taglib.jsp" %>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Simple Tables
        <small>preview of simple tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Trang chủ</a></li>
        <li><a href="#">Quản lý địa điểm</a></li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-md-12">
          <div class="box">
            <div class="box-header with-border">
              <h3 class="box-title">Quản lý địa điểm</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table class="table table-bordered">
                <tr>
                  <th style="width: 10px">#</th>
                  <th>Tên</th>
                  <th>Khu vực</th>
                  <th>Loại địa điểm</th>
                  <th>Địa chỉ</th>
                  <th>Đánh giá</th>
                  <th style="width: 10%">Thao tác</th>
                </tr>
                <c:forEach items="${list}" var="place">
                	<tr>
                		<td>${place.id}</td>
						<td>${place.placeName}</td>
						<td>${place.locationId}</td>
						<td>Loai cc</td>
						<td>${place.address }</td>
						<td>${place.rating}</td>
						<td>
							<a href="${pageContext.request.contextPath}/place/edit/${place.id}" class="">Sửa</a>
							<a href="${pageContext.request.contextPath}/place/del/${place.id}" class="">Xoá</a>
						</td>
                </c:forEach>
              </table>
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
              <ul class="pagination pagination-sm no-margin pull-right">
                <li><a href="#">&laquo;</a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">&raquo;</a></li>
              </ul>
            </div>
          </div>
          <!-- /.box -->
        </div>
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
