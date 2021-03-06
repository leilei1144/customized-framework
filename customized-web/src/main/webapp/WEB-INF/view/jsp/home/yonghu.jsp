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
                     
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
    <![endif]-->
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
                  <input id="id" type="text" default_val="用户ID" 

class="input setConfig" value="用户ID" style="width:5%;">
                  <input id="account" type="text" default_val="账户" 

class="input setConfig" value="账户" style="width:10%;">
                  <input id="recerid" type="text" value="" 

placeholder="师傅ID" class="input setConfig" title="师傅ID" 

style="width:6%">
                  <input id="tel" type="text" default_val="电话" 

value="电话" class="input setConfig" style="width:10%;">
                  <input id="email" type="text" default_val="邮箱" 

value="邮箱" class="input setConfig" style="width:10%;">
                    <input id="cninput" value="" type="text" 

class="setConfig" placeholder="用户渠道" style="width:8%">
                  <input id="nickname" type="text" default_val="昵称" 

value="昵称" class="input setConfig" style="width:7%;">
                  <input id="reg_ip" type="text" default_val="注册IP" 

value="注册IP" class="input setConfig" style="width:10%;">
                  <input id="login_ip" type="text" default_val="登陆

IP" value="登陆IP" class="input setConfig" style="width:10%;">
                    <input id="startTime" class="setConfig" 

type="text" placeholder="开始时间" onClick="WdatePicker

({onpicked:function(){getData(this.value)},maxDate:'%y-%M-%d',defaultDate : new Date(),startDate: '%y-%M-%d 00:00:00',dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="" 

style="width:10%;">
                    <input id="endTime" class="setConfig" type="text" 

placeholder="结束时间" onClick="WdatePicker({onpicked:function()

{getData(this.value)},maxDate:'%y-%M-%d',defaultDate : new Date

(),dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'startTime\');}'})" value="" style="width:10%;">
                    <select id="status" class="select setConfig" 

style="width:6%;">
                    <option value="-1">状态</option>
                    <option value="1">启用</option>
                    <option value="2">禁用</option>
                  </select>

                  <select id="hasbuy" class="select setConfig" 

style="width:8%">
                      <option value="">是否消费</option>
                      <option value="0">未消费</option>
                      <option value="1">已消费</option>
                  </select>
                  <select id="vip" class="select setConfig" 

style="width:8%">
                      <option value="">是否vip</option>
                      <option value="0">否</option>
                      <option value="1">是</option>
                  </select>
                    <select id="os" class="select setConfig" 

style="width:8%">
                        <option value="">操作系统</option>
                        <option value="ios">ios</option>
                        <option value="android">android</option>
                        <option value="input">手动输入(操作符+空格+内

容)</option>
                    </select>
                    <input id="osinput" value="" type="text" 

class="setConfig" placeholder="操作系统" style="width: 8%; display: 

none;">
                    <input id="imei" value="" type="text" 

class="setConfig" placeholder="IMEI" style="width:8%">
                    <select id="displayAll" class="setConfig" 

style="width:8%">
                        <option value="0">不显示充值总金额</option>
                        <option value="1">显示充值总金额</option>
                    </select>
                  <input style="margin-bottom: 10px;" type="button" 

class="btn btn-primary" id="search-btn" value="搜 索">
                    <input style="margin-bottom: 10px;" type="button" 

class="btn btn-primary" id="showtoday" value="查看今日">
                    <input style="margin-bottom: 10px;" type="button" 

class="btn btn-primary" id="clear-btn" value="清空">
                    <input style="margin-bottom: 10px;" type="button" 

class="btn btn-primary" id="detail-btn" value="计算用户盈亏">

                    <input style="margin-bottom: 10px;" type="button" 

class="btn btn-primary" id="yongjin-btn" value="佣金提现">
                    <input style="margin-bottom: 10px;" type="button" 

class="btn btn-primary" id="export" value="导出">
                </div>
</details>
                        <div class="well brown">
                            
                           
                            <div class="well-content" style="border:0px;">
                                <table class="table table-striped table-bordered table-hover datatable" style="width:1200;">
                                   
                        <tr role="row">
                            <th style="cursor: col-resize; width:2%">
                                <input type="checkbox" class="checkboxall">
                            </th>
                            <th style="cursor: default; width:60px;">ID</th>
                            <th style="cursor: col-resize;">账户</th>
                            <th id="balance" style="cursor: col-resize;">余额&nbsp;<span class="sort"></span></th>
                            <th width="70px" style="cursor: default;">充值金额</th>
                            <th style="cursor: default;">昵称</th>
                            <th style="cursor: default;">手机</th>
                            <th width="70px" style="cursor: default;">操作系统</th>
                            <th style="cursor: default;">注册时间</th>
                            <th style="cursor: col-resize;">注册IP</th>
                            <th style="cursor: default;">注册地</th>
                            <th>登陆IP</th>
                            <th style="cursor: default;">登陆地</th>
                            <th>登陆时间</th>
                            <th style="cursor: default;">更多</th>
                            <th width="70px" style="cursor: col-resize;">注册类型</th>
                            <th width="120px" style="cursor: default;">微信UnionID</th>
                            <th width="70px" style="cursor: col-resize;">是否消费</th>
                            <th width="70px" style="cursor: default;">用户渠道</th>
                            <th width="70px" style="cursor: default;">imei</th>
                            <th id="exp" style="cursor: default;">经验&nbsp;<span class="sort"></span></th>
                            <th style="cursor: default;">状态</th>
                            <th width="70px" style="cursor: default;">应用版本</th>
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
                 <span style="font-size: 10px; margin-bottom:50px;" class="pull-left">共20<span style="color: red" id="total"></span>条记录<span style="color:deepskyblue">(用户总余额：<span style="color:blueviolet" id="balancesum"></span>50元<span id="chargesumspan">;充值总金额：<span style="color:blueviolet" id="chargesum"></span>100元</span><span id="fflspan" style="display: none">， 付费率：<span style="color:blueviolet" id="ffl"></span></span>)</span></span>

                  
                </div>

              </div>
								
				  <span class="btn btn-primary" id="active"  style="float:right; padding-right:inherit">启用</span>
                  <span class="btn btn-primary" id="noactive" style="float:right">禁用</span>
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
