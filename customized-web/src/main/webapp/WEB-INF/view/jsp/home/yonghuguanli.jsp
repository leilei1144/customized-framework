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
        <title>默默夺宝后台管理系统</title>
    </head>
    <body>
    	<div id="admin">
    		<div class="ad-menu" id="ad-menu">
                <div class="ad-logo"><img src="../../../../static/image/m-logo.png" height="103" width="130"></div>
                <div class="ad-list">
                    <ul>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic1"></em>常用功能<span class="scm arrow"></span></div>
                             <dl>
                                <dd>
                                    <a href="../home/用户管理.jsp" class="dd-item">用户管理<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../home/商品管理.jsp" class="dd-item">商品管理<span class="scm dd-ar"></span></a>
                                </dd>
								<dd>
                                    <a href="../home/众筹.jsp" class="dd-item">众筹信息<span class="scm dd-ar"></span></a>
                                </dd>
								<dd>
                                    <a href="../home/充值.jsp"class="dd-item">充值订单管理<span class="scm dd-ar"></span></a>
                                </dd>
								<dd>
                                    <a href="../home/今日统计.jsp" class="dd-item">统计<span class="scm dd-ar"></span></a>
                                </dd>
								<dd>
                                    <a href="../home/中奖记录.jsp" class="dd-item">中奖记录<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic2"></em>运营管理<span class="scm arrow"></span></div>

                          <dl>
                             <dd>
                                    <a href="../operating/开奖数据.jsp"class="dd-item">开奖数据<span class="scm dd-ar"></span></a>
                                   
                                </dd>
                          
                                <dd>
                                    <a href="../operating/消费记录.jsp" class="dd-item">消费记录<span class="scm dd-ar"></span></a>
                                   
                                </dd>
                                <dd>
                                    <a href="../operating/收货地址.jsp" class="dd-item">收货地址<span class="scm dd-ar"></span></a>
                                   
                                </dd>
                                <dd>
                                    <a href="../operating/IP黑名单.jsp" class="dd-item">IP黑名单<span class="scm dd-ar"></span></a>
                                   
                                </dd>
                                <dd>
                                    <a href="../operating/收货地址.jsp" class="dd-item">账户黑名单<span class="scm dd-ar"></span></a>
                                    
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic4"></em>配置管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../config/Icon&banner.html" class="dd-item">Icon&banner <span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../config/ID占用管理.html" class="dd-item">ID占用管理<span class="scm dd-ar"></span></a>
                                </dd>
                                 <dd>
                                    <a href="../config/快递管理.html" class="dd-item">快递管理<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../config/在线参数.html" class="dd-item">在线参数<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../config/应用版本.html" class="dd-item">应用版本<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../config/系统配置.html" class="dd-item">系统配置<span class="scm dd-ar"></span></a>
                                </dd>																
                                <dd>
                                    <a href="../config/充值渠道.html" class="dd-item">充值渠道<span class="scm dd-ar"></span></a>
                                </dd>								
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic5"></em>购买管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="../buy/零够日志.jsp" class="dd-item">零够日志<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="../buy/零够记录.jsp" class="dd-item">零够记录<span class="scm dd-ar"></span></a>
                                </dd>
								 <dd>
                                    <a href="../buy/用户零够.jsp" class="dd-item">用户零够<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic6"></em>权限管理<span class="scm arrow"></span></div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">敬请期待<span class="scm dd-ar"></span></a>
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
                            <div class="ad-change-btn"><a id="ad-list" href="../javascript:;" class="scm ad-list-btn"></a></div>
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
                                    <div class="font-wel"><a href="javascript:;"><strong>【退出】</strong></a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="ad-main-nav-box">
                        <ul id="breadcrumbs-three">
                            <li title="首页"><a href="javascript:;" class="dot">常用功能</a></li>
                        </ul>
                        <a href="javascript:;" class="scm jian-a J_mainLeft main-sel pre"></a>
                        <div class="ad-main-wraper .J_menuItems">
                            <ul class="ad-main-list" id="ad-main">
                            </ul>
                        </div>
                        <a href="javascript:;" class="scm jian-a J_mainRight next"></a>
                    </div>
                    <div class="ad-sub-nav-box content-tabs">
                        <!-- <div class="ad-sub-record">历史记录</div> -->
                        <a href="javascript:;" class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>
                        <div class="ad-sub-wraper page-tabs J_menuTabs">
                            <ul class="ad-sub-list page-tabs-content">
                                <li class="active J_menuTab" data-id=" ">用户管理</li>
                            </ul>
                        </div>
                        <a href="javascript:;" class="scm jian-a next j_tabBg J_tabRight"></a>
                    </div>
                </div>
                <div class="ad-main-comment J_mainContent" id="ad-iframe">
                    <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="yonghu.jsp" frameborder="0" data-id="index_v0.jsp" seamless></iframe>
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