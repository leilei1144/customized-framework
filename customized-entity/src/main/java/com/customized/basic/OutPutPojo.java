package com.customized.basic;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutPutPojo implements Serializable {
	/**
	 * returnCode    返回码	
	 * returnMessage 返回消息，成功失败相关信息
	 * data          封装请求需要的相关数据   
	 */
	private static final long serialVersionUID = 1L;
	private String returnCode; 
	private String returnMessage;
	private List data;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public OutPutPojo(String returnCode, String returnMessage, List data) {
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
		this.data = data;
	}
	
	public OutPutPojo() {

	}

    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        Map map = new HashMap();
        map.put("1231231","12312312313");
        list.add(map);
        list.add("456");
        OutPutPojo outPutPojo = new OutPutPojo("0","成功",list);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(outPutPojo));
        System.out.println(JSON.toJSON(outPutPojo));
    }
}
