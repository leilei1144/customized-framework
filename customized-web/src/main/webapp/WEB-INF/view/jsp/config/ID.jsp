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

<details open style="width:100%;">
   <input type="hidden"class="setConfig"id="sort"value>
   <input type="hidden"class="setConfig"id="orderby"value>
   <input type="hidden"class="setConfig"id="raw"value>
<summary style="text-align: left;margin-bottom: 10px;"></summary>
<div style="display: block;text-align: left;">
                  <input id="ghid" type="text" default_val="ID" value="ID" style="width:6%;">
				                   <select id="type" style="width:20%;">
                    <option value="-1">占用状态</option>
                    <option value="1">已占用</option>
                    <option value="0">未占用</option>
					
                  </select>
				  </select>
                  <input style="margin-bottom: 10px; margin-top:10px;" type="button" class="btn btn-primary" id="search-btn" value="搜 索">
				  <input style="margin-bottom: 10px; margin-top:10px;" type="button" class="btn btn-primary" id="search-btn" value="添 加">

                </div>
</details>
                        <div class="well brown">
                            
                           
                            <div class="well-content" style="border:0px;">
                                <table class="table table-striped table-bordered table-hover datatable" style="width:1590px;">
                                   
                        <tr role="row">
							<th style="cursor: default; width:6%;">占用ID</th>
                            <th style="cursor: default; width:6%;">状态</th>
							<th style="cursor: default; width:6%">分配用户</th>
							<th style="cursor: default; width:6%">操作</th>
                        </tr>
                        </thead>
                        <tbody id="user_list" role="alert" aria-live="polite" aria-relevant="all">

                        </tbody>

                                    <tbody>
                                        <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>           
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>                                     
                                                                                <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>						 
                                                                              <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>                     
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
			                                                                     <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
                                                                                <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>                                                        
										                                           <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
										                                          <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
                                                                            <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>			                 
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>                
                                                                                <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
                                                                              <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>                                        
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>                                          
                                                                              <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>             
                                                                                <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>		
                                                                              <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>
                                                                               <tr>
											<td>xxx</td>
										    <td>xxx</td>
											<td>xxx</td>
											<td>
											<input type="button" class="btn-mini btn btn-info" value="删除" onClick="del_addr(11885)">&nbsp;
											<input type="button" class="btn-mini btn btn-info" value="分配用户" onClick="del_addr(11885)">&nbsp;
											</td>
                                        </tr>            
								</tbody>
                                </table></thead>
								</table>

			<div class="form-inline btn-toolbar">
                  <div class="reveal">
				   <span>
                      <select id="rows" style="width:60px; float:right; margin-top:4px;">
                        <option>20</option>
                        <option>30</option>
                        <option>100</option>
                      </select>
                    </span>
                    <span style="font-size: 14px" class="pull-left">
					共
					<span style="color: red" id="total">XXXXX
					</span>
					条记录
					</span>
                    <span id="digg_page" style="float:right">
					<button href="javascript:void(0)" class="btn" disabled="disabled">上一页</button>
					<button class="btn active" href="javascript:void(0)">1</button>
					<button class="page_to btn" href="javascript:void(0)">2</button>
					<button class="page_to btn" href="javascript:void(0)">3</button>
					<button href="javascript:void(0)" id="next" class="btn">下一页</button>
					</span>
                    每页

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
