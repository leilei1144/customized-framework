package com.customized.config;

/**
 * 常量表
 * 
 * @author ShenHuaJie
 * @version $Id: Constants.java, v 0.1 2014-2-28 上午11:18:28 ShenHuaJie Exp $
 */
public interface Constants {
	/**
	 * 异常信息统一头信息<br>
	 * 非常遗憾的通知您,程序发生了异常
	 */
	public static final String Exception_Head = "OH,MY GOD! SOME ERRORS OCCURED! AS FOLLOWS :";
	/** 客户端语言 */
	public static final String USERLANGUAGE = "userLanguage";
	/** 客户端主题 */
	public static final String WEBTHEME = "webTheme";
	/** 当前用户 */
	public static final String CURRENT_USER = "CURRENT_USER";
	/** 在线用户数量 */
	public static final String ALLUSER_NUMBER = "ALLUSER_NUMBER";
	/** 登录用户数量 */
	public static final String USER_NUMBER = "USER_NUMBER";
	/** 上次请求地址 */
	public static final String PREREQUEST = "PREREQUEST";
	/** 上次请求时间 */
	public static final String PREREQUEST_TIME = "PREREQUEST_TIME";
	/** 非法请求次数 */
	public static final String MALICIOUS_REQUEST_TIMES = "MALICIOUS_REQUEST_TIMES";
	/** 缓存命名空间 */
	public static final String CACHE_NAMESPACE = "Customized:";

	/**移动端返回信息*/

	public static final String IS_OK = "加载成功";
	public static final String IS_ERROR = "加载失败";

	/**移动端使用的状态吗*/

	public static final String IS_OK_STATE = "0";
	public static final String IS_ERROR_STATE = "-1";
	/**最新揭晓商品条数，暂时位3条   add by yangmf*/
	public static final int NEW_PUBLISH_NUM = 3;
	/**系统默认每页显示条数  暂定10条*/
	public static final int PAGE_PER_SIZE = 10;
	/**系统默认分页起始页  暂定1*/
	public static final int PAGE_DEFAULT_NUM = 1;

}
