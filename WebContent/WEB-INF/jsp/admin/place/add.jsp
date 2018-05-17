<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/taglib.jsp" %>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Quản lý địa điểm
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
             	<h2 class="box-title">Thêm địa điểm</h2>
            </div>
            <!-- form start -->
            <form role="form" action="${pageContext.request.contextPath}/place/add" method="post">
              <div class="box-body">
              	 <!-- radio -->
                <div class="form-group">
                  <div class="radio">
                    <label >
                      <input type="radio" name="categoryId" id="optionsRadios1" value="1" checked >
                      Địa điểm ăn uống     
                    </label>
                    <label>
                      <input type="radio" name="categoryId" id="optionsRadios2" value="2">
                      Địa điểm nghỉ ngơi    
                    </label>
                    <label>
                      <input type="radio" name="categoryId" id="optionsRadios3" value="3">
                      Địa điểm vui chơi    
                    </label>
                  </div>
                </div>

                <!-- select -->
                <div class="form-group">
                  <label>Khu vực</label>
                  <select class="form-control" name="locationId">
                    <option  value="4301">option 1</option>
                    <option value="4302">option 2</option>
                  </select>
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail1">Tên địa điểm</label>
                  <input type="text" class="form-control" id="placeName" placeholder="Name" name="placeName">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Mô tả</label>
                  <input type="text" class="form-control" id="description" placeholder="Description " name="description">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Chi tiết</label>
                  <textarea rows="6" class="form-control" id="detail" placeholder="Detail" name="detail"> </textarea>
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Địa chỉ</label>
                  <input type="text" class="form-control" id="address" placeholder="Address " name="address">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Số điện thoại</label>
                  <input type="text" class="form-control" id="phone" placeholder="Phone Number" name="phone">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Rating</label>
                  <input type="text" class="form-control" id="rating" name="rating">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Latitude</label>
                  <input type="text" class="form-control" id="latitude" placeholder="Latitude " name="latitude">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Longitude</label>
                  <input type="text" class="form-control" id="longitude" placeholder="Longitude " name="longitude">
                </div>
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
              	<button type="submit" class="btn btn-primary">Submit</button>
              	<button type="submit" class="btn btn-default">Cancel</button>  
              </div>
            </form>
          </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
