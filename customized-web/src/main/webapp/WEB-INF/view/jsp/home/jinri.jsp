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

  </head>

  <body>

  <div class="span9" id="contain">
              <h3 style="font-size:14px">
                请输入时间：
                  <input type="text" class="datepicker form-control" id="time">&nbsp;
                                    <input type="button" class="btn btn-primary" id="exportexcel" value="导出Excel">
                 
              </h3>
			  <h1 style="font-size:14px">今日统计内容如下：XXXXXXXXXXXX</h1>
		      <h1 style="font-size:14px">今日统计内容如下：XXXXXXXXXXXX</h1>
</div>
        


  </body>
</html>
