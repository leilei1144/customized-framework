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

<details style="width: 100%;" open="">
                <summary style="text-align: left;margin-bottom: 10px;"></summary>
                <div style="display: block;text-align: left;">
                  <input id="id" type="text" default_val="商品ID" value="商品ID" style="width:6%;">
                  <input id="title" type="text" default_val="标题" value="标题" style="width:10%;">
                  <input id="issue" type="text" default_val="剩余期数" value="剩余期数" style="width:5%;">
                  <input type="hidden" id="sort" value="desc">
                  <input type="hidden" id="orderby" value="g.hot">
                  <input type="hidden" id="raw" value="">
                  <select id="ctyname" style="width:10%;">
                    <option value="-1">类别</option>
                    <option value="Apple">苹果专区</option>
                    <option value="Phone">手机平板</option>
                    <option value="Computer">电脑办公</option>
                    <option value="HomeDigital">居家电器</option>
                    <option value="DigitalParts">电子周边</option>
                    <option value="XuNi">虚拟商品</option>
                    <option value="Food">食品专区</option>
                    <option value="Daily ">日常用品</option>
                    <option value="Other">其他奖品</option>
                    </select>
				    <select id="status" style="width:7%">
                    <option value="" selected="">默认</option>
                    <option value="1">在售</option>
                    <option value="0">停售</option>
                  </select>
                  <select id="multi" style="width:10%;">
                      <option value="">多期选择</option>
                      <option value="1">多期</option>
                      <option value="0">非多期</option>
                  </select>
                  <select id="type" style="width:10%;">
                      <option value="">商品类型</option>
                      <option value="1">普通商品</option>
                      <option value="2">新手商品</option>
                      <option value="3">免费商品</option>
                      <option value="4">速开商品</option>
                  </select>
                    <select id="goodstype" style="width:10%;">
                        <option value="">允许发货地址类型</option>
                        <option value="0">通用地址</option>
                        <option value="1">实物和第三方地址</option>
                        <option value="2">虚拟和第三方地址</option>
                    </select>
                    <select id="buyway" style="width:10%;">
                        <option value="">购买渠道</option>
                                                <option value="京东">京东</option>
                                                <option value="小米">小米官网</option>
                                                <option value="淘宝">淘宝</option>
                                                <option value="采购">采购</option>
                                            </select>
                  <input style="margin-bottom: 10px;" type="button" class="btn btn-primary" id="search-btn" value="搜 索">
                  <input style="margin-bottom: 10px;" type="button" class="btn btn-primary" id="add-btn" value="添 加">
                </div>
              </details>
                        <div class="well brown">
                            
                           
                            <div class="well-content" style="border:0px;">
                                <table class="table table-striped table-bordered table-hover datatable" style="width:1200;">
                                   
                        <tr role="row">
<tr role="row">
                  <th>ID</th>
                  <th id="issuen" title="包括正在开奖中的商品" style="cursor:pointer">已开期数&nbsp;<span class="sort"></span></th>
                  <th id="lissue" style="cursor:pointer">剩余期数&nbsp;<span class="sort"></span></th>
                  <th id="price" style="cursor:pointer">价格&nbsp;<span class="sort"></span></th>
                  <th id="hot" style="cursor:pointer">人气值&nbsp;<span class="sort icon-chevron-down"></span></th>
                  <th>权重</th>
                  <th>商品类型</th>
                  <th>主标题</th>
                  <th>副标题</th>
                  <th>商品详情</th>
                  <th>缩略图</th>
                  <th>图片</th>
                  <th>购买渠道</th>
                  <th>类别名称</th>
                  <th>状态</th>
                  <th>地址类型</th>
                  <th>更多</th>

                </tr>
                        </thead>
                        <tbody id="user_list" role="alert" aria-live="polite" aria-relevant="all">

                        </tbody>

                                    <tbody>
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>
                                         <tr>
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr> 
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                        
                                                                                  <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                         
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                        
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>										
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                        
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                        
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                       
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>	
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                       
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>										
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                      
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                         
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                       
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>										
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>
                                        <tr>
											<td>XXXXXX</td>
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
                                            <td>
                                            <input type="button" class="btn-mini btn btn-info" value="修改" onclick="update_goods(315)">&nbsp;
                                            <input type="button" class="btn-mini btn btn-info" value="停售" onclick="update_sell('315',this.value)">&nbsp;
                                            </td>
                                        </tr>                                       
                                        
                                    </tbody>
                                </table></thead>
								</table>
								<div class="form-inline btn-toolbar">
                <div class="reveal">
                  <span class="pull-left" style="font-size: 14px">共<span style="color: red" id="total">312</span>条记录</span>
                  <span id="digg_page" style="float:right;">
				  <button href="javascript:void(0)" class="btn" disabled="disabled">上一页</button>
				  <button class="btn active" href="javascript:void(0)">1</button>
				  <button class="page_to btn" href="javascript:void(0)">2</button>
				  <button class="page_to btn" href="javascript:void(0)">3</button>
				  <button class="page_to btn" href="javascript:void(0)">4</button>
				  <button class="page_to btn" href="javascript:void(0)">5</button>
				  <button class="page_to btn" href="javascript:void(0)">6</button>
				  <button class="page_to btn" href="javascript:void(0)">7</button>
				  <button href="javascript:void(0)" id="next" class="btn">下一页</button>
				  </span>
				  每页
                    <span>
                      <select id="rows" style="width:60px;">
                        <option>20</option>
                        <option>30</option>
                        <option>100</option>
                      </select>
                    </span>
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
