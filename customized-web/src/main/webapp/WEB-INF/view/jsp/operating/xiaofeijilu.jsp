<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta charset="utf-8">
         <link href="../../../../static/css/public.css" type="text/css" rel="stylesheet">
        <link href="../../../../static/css/houtai.css" type="text/css" rel="stylesheet">
        <link href="../../../../static/css/smartMenu.css" type="text/css" rel="stylesheet">
        <title>起子夺宝后台管理系统</title>
    </head>
    <body>
    	<div id="admin">
    		<div class="ad-menu" id="ad-menu">
                <div class="ad-logo"> <img src="../../../../static/image/m-logo.png" height="103" width="103"> </div>
                <div class="ad-list">
                    <ul>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic1"></em>常用功能<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">用户管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                        <li class="J_menuItem" href="../index_v12.jsp" data-index="12">12</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">商品管理<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
								 <dd>
                                    <a href="../#" class="dd-item">历史统计<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">今日统计<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic2"></em>运营管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">BVBBB<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">消费记录<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">ERRAD<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">QWEER<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">ERWQR<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic3"></em>用户管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">QWEQQ<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                        <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">CXHYA<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                            <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">IIOOI<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                                               <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">OIOYY<span class="scm dd-ar"></span></a>
                                    <ul class="ad-item-list">
                                                                        <li class="J_menuItem" href="../index_v1.jsp" data-index="1">1</li>
                                        <li class="J_menuItem" href="../index_v2.jsp" data-index="2">2</li>
                                        <li class="J_menuItem" href="../index_v3.jsp" data-index="3">3</li>
                                        <li class="J_menuItem" href="../index_v4.jsp" data-index="4">4</li>
                                        <li class="J_menuItem" href="../index_v5.jsp" data-index="5">5</li>
                                        <li class="J_menuItem" href="../index_v6.jsp" data-index="6">6</li>
                                        <li class="J_menuItem" href="../index_v7.jsp" data-index="7">7</li>
                                        <li class="J_menuItem" href="../index_v8.jsp" data-index="8">8</li>
                                        <li class="J_menuItem" href="../index_v9.jsp" data-index="9">9</li>
                                        <li class="J_menuItem" href="../index_v10.jsp" data-index="10">10</li>
                                        <li class="J_menuItem" href="../index_v11.jsp" data-index="11">11</li>
                                    </ul>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">UYTRW<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">QWEQW<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">ASDFA<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">KJLIU<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">ASLJU<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">GGUIY<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic4"></em>社区管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">IYYTI<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">IUUIY<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic5"></em>JHJHG<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">KJHUK<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">KJIJH<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic6"></em>统计管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">KJYUU<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">KJGKG<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic7"></em>IUITY<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../#" class="dd-item">KJJHI<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../#" class="dd-item">JKOUK<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                    </ul>
                </div>
            </div>
    		<div class="ad-comment-box" id="ad-comment">
                <div class="ad-top-comment">
                    <div class="ad-message">
                        <div class="ad-top-left">
                            <div class="ad-change-btn"><a id="ad-list" href="javascript:;" class="scm ad-list-btn"></a></div>
                            <div class="ad-search-box clear">
                                <div class="ad-search-sel">
                                    <select>
                                        <option>A类</option>
                                        <option>B类</option>
                                        <option>C类</option>
                                        <option>D类</option>
                                    </select>
                                </div>
                                <div class="ad-search-cha">
                                    <input type="text" class="ad-search-input" placeholder="请输入你要查找的内容">
                                    <input type="submit" class="scm ad-search-btn" value=""> 
                                </div>
                            </div>
                        </div>
                        <div class="ad-top-right">
                            <div class="ad-welcom">
                                <div class="ad-wel-img"><img src="../../../../static/image/min_logo.png" height="36" width="36"></div>
                                <div class="ad-wel-text">
                                    <div class="font-wel">欢迎您！<strong>XXX</strong></div>
                                    <div class="font-wel"><a href="../javascript:;"><strong>【退出】</strong></a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="ad-main-nav-box">
                        <ul id="breadcrumbs-three">
                            <li title="首页"><a href="../javascript:;" class="dot">首页</a></li>
                        </ul>
                        <a href="../javascript:;" class="scm jian-a J_mainLeft main-sel pre"></a>
                        <div class="ad-main-wraper .J_menuItems">
                            <ul class="ad-main-list" id="ad-main">
                            </ul>
                        </div>
                        <a href="../javascript:;" class="scm jian-a J_mainRight next"></a>
                    </div>
                    <div class="ad-sub-nav-box content-tabs">
                        <!-- <div class="ad-sub-record">历史记录</div> -->
                        <a href="../javascript:;" class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>
                        <div class="ad-sub-wraper page-tabs J_menuTabs">
                            <ul class="ad-sub-list page-tabs-content">
                                <li class="active J_menuTab" data-id=" ">消费记录</li>
                            </ul>
                        </div>
                        <a href="../javascript:;" class="scm jian-a next j_tabBg J_tabRight"></a>
                    </div>
                </div>
                <div class="ad-main-comment J_mainContent" id="ad-iframe">
                    <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="xiaofei.jsp" frameborder="0" data-id="index_v0.jsp" seamless></iframe>
                </div>
    		</div>
    	</div>
        <script type="text/javascript" src="../../../../static/js/jquery.min.js"></script>
        <script type="text/javascript" src="../../../../static/js/contabs.js"></script>
        <script type="text/javascript" src="../../../../static/js/maintabs.js"></script>
        <script type="text/javascript" src="../../../../static/js/jquery-smartMenu-min.js"></script>
        <script type="text/javascript" src="../../../../static/js/jquery.nicescroll.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $(".ad-menu").niceScroll({cursorborder:"0 none",cursorcolor:"#1a1a19",cursoropacitymin:"0",boxzoom:false});
            })
        </script>
    </body>
</html>