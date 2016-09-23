package com.customized.horn.servive;

import com.customized.basic.OutPutPojo;

import java.util.Map;


public interface IHornService {

	public OutPutPojo getHorns(String token, int pageSize);
}
