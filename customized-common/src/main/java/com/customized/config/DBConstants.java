package com.customized.config;

/**
 * 功能：显示系统参数表相关参数  
 * @author yangmengfan
 * @since
 * @version 1.0
 * 调用方式：DBConstants.User_Param.YHXB
 * */
public interface DBConstants {
	/*系统参数表 mm_sys_param*/
   public static final String QINIU_URL = "QINIU_URL";	// 7牛图片地址
   public static final int PIC_BIG = 0;  	// 大型图
   public static final int PIC_MIDDLE = 1;	// 中型图
   public static final int PIC_SMALL = 2;	// 小型图
   public static final int PIC_NAIL = 3;	// 缩略图
   
   /*众筹状态为进行中*/
   public static final String ZCZT_JXZ = "1";
   
	/*用户参数表 mm_user_params*/ 
   enum User_Param implements DBConstants{
	   /* 
	    * YHXB:用户性别	内容: 0:男  1:女 2:不详
	    * ZCFS:注册方式	内容: 0:手机注册  1:QQ注册  2:微信注册	
	    * DLLX:登陆类型	内容: 0:账号登陆  1:手机号登陆  2:支付宝号登录  3:微信登陆  4:qq登陆  5:邮箱登陆
	    * YHZT:用户状态	内容: 0:可用  1:禁用  2:审核中  3:其他
	    * DZLX:地址类型	内容: 0:实物收货地址  1:话费收货地址  2:qq币收货地址  3:支付宝收货地址
	   */
	   YHXB,ZCFS,DLLX,YHZT,DZLX 
   }
   /*商品参数表  mm_goods_params*/
   enum Good_Param implements DBConstants{
	   /* 
	    * SPLB:商品类别		内容: HWZQ:华为专区  PGZQ:苹果专区  XMZQ:小米专区 等
	    * SPLX:商品类型		内容: 0:通用(目前和实物没什么区别) 1:实物商品   2:虚拟商品(不允许申请实物发货)
	    * SPXSLX:商品销售类型	内容: 0:普通  1:新手专属  2:免费  3:速开
	    * SPXSZT:商品销售状态	内容: 0:在售  1:停售  2:其他
	    * ZCZT:众筹状态		内容: 0:初使  1:进行中  2:抢完  3:已开奖
	    * ZJZT:中奖用户状态	内容: 0:申请发货  1:查看物流确认收货  2:晒图  3:试试手气
	    * PXFS:排序方式		内容: 0:热门  1:剩余  2:最新  3:人次最多  4:人次最少
	    * SPSX:商品属性类型	内容: 0:手机平板  1:数码影音  2:电脑办公  3:虚拟物品  4:智能家居  5:女性时尚  6:其他商品  7:10元专区
	   */
	   SPLB,SPLX,SPXSLX,SPXSZT,ZCZT,ZJZT,PXFS,SPSX
   }
   /*订单/充值/物流参数表 mm_recharge_params*/
   enum Recharge_Param implements DBConstants{
	   /* 
	    * DDZT:订单状态	内容: 0:暂未到账  1:充值失败   2:充值完成
	    * QDLX:渠道类型	内容: 0:普通渠道  1:网页渠道
	    * TXZT:提现状态	内容: 0:申请  1:审核中  2:提现失败  3:提现成功
	    * TXFS:提现方式	内容: 0:提现零钱币  1:提现支付宝   2:提现微信
	    * WLZT:物流状态	内容: 0:初始  1:已发货  2:已收货  3:待进货
	    * ZFZT:支付状态	内容: 0:待支付  1:支付中  2:支付失败  3:支付成功
	   */
	   DDZT,QDLX,TXZT,TXFS,WLZT,ZFZT
   }
   /*接口参数表  mm_inter_params*/
   enum Inter_Param implements DBConstants{
	   /* 
	    * TBLX:图标类型		内容: 0:banner打开网页(活动) 1:banner跳商品页面  2:Icon
	    * TBZT:图标状态		内容: 0:开启   1:关闭
	    * OSINFO:操作系统		内容: 0:IOS  1:Android  2: 其他
	    * APPZT:app状态		内容: 0:开发中  1:测试中  2:已上线   3:不维护   4:已作废
	   */
	   TBLX,TBZT,OSINFO,APPZT
   }
   /*线上参数表  mm_sys_online_param 待维护*/
   /*系统参数表  mm_sys_param 待维护*/
   
   
}
