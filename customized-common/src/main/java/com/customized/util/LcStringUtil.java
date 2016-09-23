package com.customized.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
/** 
 * @ClassName: LcStringUtil 
 * @Description: 共用类-字符串处理类
 * @author yangmf
 * @date 2015年5月27日18:44:33
 * @Copyright 2015 航天信息软件技术有限公司-版权所有
 */
public class LcStringUtil {

	/**
	 *@author yangmf 
	 *@param  str 待处理字符串
	 *@Description: 格式化金额
	 *@return String 处理后的字符串
	 * */
	public static String formatMoney(String money) {
		DecimalFormat myformat = new DecimalFormat();
		myformat.applyPattern("#,##0.00");
		String fmoney = "0.00";
		if(!isNull(money) && !("0.00".equals(money))){
			double dmoney = Double.valueOf(money).doubleValue();
			fmoney = myformat.format(dmoney);
		}
		return fmoney;
	}
	
	/**
	 * 是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str) {
		return null == str || "null".equalsIgnoreCase(str) || "".equals(str.trim());
	}
	  
	/**
	 * 是否为空
	 * @param str
	 * @return
	 */
	public static String changeNull(String str){
		if(str == null){
			str = "";
		}
		return str;
	}
	
	/**
	 * BigDecimal转String
	 * @param bigdecimal
	 * @return str
	 * */
	public static String bigDecimalToString(BigDecimal bd){
		 if(bd == null){
			 return "0.00";
		 }
		 BigDecimal bigdecimal = bd;   
		 //设置小数位数，第一个变量是小数位数，第二个变量是取舍方法(四舍五入)   
		 bigdecimal=bigdecimal.setScale(2, BigDecimal.ROUND_HALF_UP);   
		 //转化为字符串输出   
		 return bigdecimal.toString(); 
	}
}
