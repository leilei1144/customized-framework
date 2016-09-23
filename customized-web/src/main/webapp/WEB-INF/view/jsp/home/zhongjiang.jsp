<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Flatpoint - Responsive Web App Template</title>
  
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="../../../../static/css/bootstrap.css" rel="stylesheet">
    <link href="../../../../static/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="../../../../static/css/stylesheet.css" rel="stylesheet">
    <link href="../../../../static/icon/font-awesome.css" rel="stylesheet">
    

    <!-- Le fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../../notfound/apple-touch-icon-144-precomposed.jsp">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../../notfound/apple-touch-icon-114-precomposed.jsp">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../../notfound/apple-touch-icon-72-precomposed.jsp">
                    <link rel="apple-touch-icon-precomposed" href="../../notfound/apple-touch-icon-57-precomposed.jsp">
                                  

    <style type="text/css">
    .input{ width:40px;
	text-align:center;}
	.daohanglink{
		height:40px; line-height:40px; vertical-align:middle; width:100%;
		background-color:rgb(248,248,248);
		margin-bottom:15px;
		}
	.daohanglink span{
		margin-left:5px;}
	.daohang{
	float: left;
	height: 15px;
	width: 5px;
	border-left-width: 5px;
	border-left-style: solid;
	border-left-color: #036;
	margin-top:12px;
	margin-left:15px;
		}
		

<:hov


.cls

element.style {
    width: 100%;
}
article, aside, details, figcaption, figure, footer, header, hgroup, nav, section {
    display: block;
}
user agent stylesheet
details {
    display: block;
}
    </style>
  </head>

  <body>

    
    <div id="content"> <!-- Content start -->
      <div class="inner_content">
          <div class="widgets_area">
                <div class="row-fluid">
                    <div class="span12">
                         <div  class="daohanglink"style="">
<divid="DataTables_Table_0_wrapper"
clas="dataTables_wrapper"role="grid">

<details open style="width:1900px;">
   <input type="hidden"class="setConfig"id="sort"value>
   <input type="hidden"class="setConfig"id="orderby"value>
   <input type="hidden"class="setConfig"id="raw"value>
<summary style="text-align: left;margin-bottom: 10px;"></summary>
<div style="display: block;text-align: left;">
                   <input id="ghid" type="text" default_val="众筹ID" value="众筹ID" style="width:6%;">
                                    <input id="account" type="text" default_val="账户" value="账户" style="width:10%;">
                  <!-- 物流信息 -->
                  <input id="uid" type="text" default_val="用户ID" value="用户ID" style="width:6%;">
                  <input id="gtitle" type="text" default_val="商品名称" value="商品名称" style="width:6%;">
                  <input id="name" type="text" default_val="收货人" value="收货人" style="width:6%;">
                  <input id="tel" type="text" default_val="联系电话" value="联系电话" style="width:7%;">
                  <input id="number" type="text" default_val="订单号" value="订单号" style="width:7%;">
                    <input id="umsg" type="text" placeholder="用户留言" value="" style="width:7%;">
                    <input id="kmsg" type="text" placeholder="备注" value="" style="width:7%;">
                    <input id="order" type="text" placeholder="购买单号" value="" style="width:7%;">
                    <input id="operatorInp" type="text" placeholder="操作员" value="" style="width:7%;">
                    <input id="buyprice" type="text" placeholder="购买价格" value="" style="width:7%;">
                    <input id="buyway" type="text" placeholder="购买途径" value="" style="width:7%;">
                    <input id="startTime" type="text" placeholder="开始时间" onclick="WdatePicker({onpicked:function(){getData(this.value)},maxDate:'%y-%M-%d',defaultDate : new Date(),dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="" style="width:7%;">
                    <input id="endTime" type="text" placeholder="结束时间" onclick="WdatePicker({onpicked:function(){getData(this.value)},maxDate:'%y-%M-%d',defaultDate : new Date(),dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'startTime\');}'})" value="" style="width:7%;">
                    <select id="operator" style="width:6%">
                        <option value="">操作员</option>
                                                    <option value="超级管理员">超级管理员</option>
                                                    <option value="测试管理员">测试管理员</option>
                                            </select>
                    <select id="channel" style="width:8%;">
                    <option value="-1">物流渠道</option>
                                            <option value="默认快递">默认快递</option>
                                            <option value="顺丰速运">顺丰速运</option>
                                            <option value="申通快递">申通快递</option>
                                            <option value="中通快递">中通快递</option>
                                            <option value="京东">京东</option>
                                            <option value="EMS">EMS</option>
                                            <option value="韵达快递">韵达快递</option>
                                            <option value="天天快递">天天快递</option>
                                            <option value="速尔快递">速尔快递</option>
                                            <option value="百世汇通">百世汇通</option>
                                            <option value="小米官网">小米官网</option>
                                            <option value="宅急送">宅急送</option>
                                            <option value="圆通速递">圆通速递</option>
                                            <option value="全峰快递">全峰快递</option>
                                      </select>
                  <select id="status" style="width:8%;">
                    <option value="-1">物流状态</option>
                    <option value="3">初始</option>
                    <option value="4" selected="">待发货</option>
                    <option value="0">正在备货</option>
                    <option value="1">已发货</option>
                    <option value="2">已收货</option>
                  </select>
                  <select id="freeze" style="width: 8%">
                      <option value="">冻结状态</option>
                      <option value="0" selected="">未冻结</option>
                      <option value="1">已冻结</option>
                      <option value="2">已过期</option>
                  </select>
                    <select id="addrtype" style="width: 8%">
                        <option value="">订单类型</option>
                        <option value="1">实物订单</option>
                        <option value="2">话费充值订单</option>
                        <option value="3">Q币充值订单</option>
                        <option value="4" selected="">第三方支付宝订单</option>
                        <option value="5" selected="">第三方微信订单</option>
                    </select>
                  <input style="margin-bottom: 10px;" type="button" class="btn btn-primary" id="search-btn" value="搜 索">
                    <input style="margin-bottom: 10px;" type="button" class="btn btn-primary" id="clear-btn" value="清 空">
                    <input style="margin-bottom: 10px;" type="button" class="btn btn-primary" id="copy" value="复制留言">
                    <input style="margin-bottom: 10px;" type="button" class="btn btn-primary" id="export" value="导出Excel">
                </div>
</details>
                        <div class="well brown">
                            
                           
                            <div class="well-content" style="border:0px;">
                                <table class="table table-striped table-bordered table-hover datatable" style="width:1200;">
                                   
                        <tr role="row">
                            <th style="cursor: col-resize; width:2%">
                                <input type="checkbox" class="checkboxall">
                            </th>
                            <th style="cursor: default; width:60px;">众筹ID</th>
                            <th style="cursor: col-resize;">商品名</th>
                            <th id="balance" style="cursor: col-resize;">用户ID<span class="sort"></span></th>
                            <th width="70px" style="cursor: default;">余额对比</th>
                            <th style="cursor: default;">开奖时间</th>
                            <th style="cursor: default;">申请时间</th>
                            <th width="70px" style="cursor: default;">操作时间</th>
                            <th style="cursor: default;">操作员</th>
                            <th style="cursor: col-resize;">收货人名字</th>
                            <th style="cursor: default;">收货电话</th>
                            <th>收货地址</th>
                            <th style="cursor: default;">用户留言</th>
                            <th>状态</th>
                            <th width="70px" style="cursor: col-resize;">物流渠道</th>
                            <th width="120px" style="cursor: default;">物流单号</th>
                            <th width="70px" style="cursor: col-resize;">商品价格</th>
                            <th width="70px" style="cursor: default;">购买价格</th>
                            <th width="70px" style="cursor: default;">商品利润</th>
                            <th id="exp" style="cursor: default;">购买途径<span class="sort"></span></th>
                            <th style="cursor: default;">购买订单号</th>
                            <th width="70px" style="cursor: default;">操作员</th>
							<th width="70px" style="cursor: default;">备注</th>
                        </tr>
                        </thead>
                        <tbody id="user_list" role="alert" aria-live="polite" aria-relevant="all">

                        </tbody>

                                    <tbody>
                                        <tr>
											<td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                         <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                                                                        <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                           <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                                                                       <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
										 <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                         <tr>
                                           <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                                                                       <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>  
										 <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                             <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                         <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                                   <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
										 <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
											<td>65454646</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
										 <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                           <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
										 <tr>
                                           <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                         <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                        <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
										 <tr>
                                            <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                         <tr>
                                           <td><input type="checkbox" class="checkboxall"></td>
                                            <td>3564667</td>
                                            <td>xxxxxxxxxx</td>
                                            <td>xxx</td>
                                            <td>xxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxx</td>
                                            <td>xxxxxxx </td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
											<td>xxxxxx</td>
                                        </tr>
                                       
                                        
                                    </tbody>
                                </table></thead>
								</table>

				<div class="form-inline btn-toolbar">
                <div class="reveal">

                    <span style="font-size: 14px" class="pull-left">
					<input type="checkbox" class="checkboxall">
					全选 
					共<span style="color: red" id="total">
					XX
					</span>条记录(销售金额：
					<span style="color:blueviolet" id="xsje">
					XXXX
					</span>元;实际金额：
					<span style="color:blueviolet" id="sjje">
					XXXX
					</span>
					元)
					</span>
                  <span id="digg_page" style="float:right">
				  
                    <span>
                      <select id="rows" style="width:60px; float:right;" >
                        <option>20</option>
                        <option>30</option>
                        <option>100</option>
                      </select>
					  <button href="javascript:void(0)" class="btn" disabled="disabled" style="margin-bottom:9px">
				  上一页
				  </button>
				  <button class="btn active" href="javascript:void(0)" style="margin-bottom:9px">
				  1
				  </button><button href="javascript:void(0)" class="btn" disabled="disabled" style="margin-bottom:9px">
				  下一页
				  </button>
				  </span>
                  每页
                    </span>
                    <button class="btn btn-success" data-toggle="modal" data-target="#exportModal" style="float:right">推送</button>
                    <button class="btn btn-success" id="plgh" style="float:right" >批量发货</button>					
                    <button class="btn btn-success" id="bh" style="float:right">正在备货</button>					
	                <button class="btn btn-danger" id="lqb" style="float:right">零钱币</button>					
				    <label class="checkbox" style="float:right;">
                        <input type="checkbox" value="" id="zhe">
                        折扣
                    </label>

					
					<br>
                </div>

              </div>
                            </div>
                        </div>
	
                    </div>
                </div>

            
            </div>
        </div>
    </div>

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../../../static/js/jquery-1.10.2.js"></script>
    <script src="../../../../static/js/jquery-ui-1.10.3.js"></script>
    <script src="../../../../static/js/bootstrap.js"></script>

    <script src="../../../../static/js/library/jquery.collapsible.min.js"></script>
    <script src="../../../../static/js/library/jquery.mCustomScrollbar.min.js"></script>
    <script src="../../../../static/js/library/jquery.mousewheel.min.js"></script>
    <script src="../../../../static/js/library/jquery.uniform.min.js"></script>

   
    <script src="../../../../static/js/library/jquery.sparkline.min.js"></script>
    <script src="../../../../static/js/library/chosen.jquery.min.js"></script>
    <script src="../../../../static/js/library/jquery.easytabs.js"></script>
    <script src="../../../../static/js/library/flot/ex canvas.min.js"></script>
    <script src="../../../../static/js/library/flot/jquery.flot.js"></script>
    <script src="../../../../static/js/library/flot/jquery.flot.pie.js"></script>
    <script src="../../../../static/js/library/flot/jquery.flot.selection.js"></script>
    <script src="../../../../static/js/library/flot/jquery.flot.resize.js"></script>
    <script src="../../../../static/js/library/flot/jquery.flot.orderBars.js"></script>
    <script src="../../../../static/js/library/maps/jquery.vmap.js"></script>
    <script src="../../../../static/js/library/maps/maps/jquery.vmap.world.js"></script>
    <script src="../../../../static/js/library/maps/data/jquery.vmap.sampledata.js"></script>
    <script src="../../../../static/js/library/jquery.autosize-min.js"></script>
    <script src="../../../../static/js/library/charCount.js"></script>
    <script src="../../../../static/js/library/jquery.minicolors.js"></script>
    <script src="../../../../static/js/library/jquery.tagsinput.js"></script>
    <script src="../../../../static/js/library/fullcalendar.min.js"></script>
    <script src="../../../../static/js/library/footable/footable.js"></script>
    <script src="../../../../static/js/library/footable/data-generator.js"></script>

    <script src="../../../../static/js/library/bootstrap-datetimepicker.js"></script>
    <script src="../../../../static/js/library/bootstrap-timepicker.js"></script>
    <script src="../../../../static/js/library/bootstrap-datepicker.js"></script>
    <script src="../../../../static/js/library/bootstrap-fileupload.js"></script>
    <script src="../../../../static/js/library/jquery.inputmask.bundle.js"></script>

    <script src="../../../../static/js/library/jquery.dataTables.js"></script>

    <script src="../../../../static/js/flatpoint_core.js"></script>

    <script src="../../../../static/js/datatables.js"></script>

  </body>
</html>
