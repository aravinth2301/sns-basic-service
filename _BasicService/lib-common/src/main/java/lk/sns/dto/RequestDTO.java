package lk.sns.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lk.sns.util.JsonUtil;



@JsonInclude(Include.NON_NULL)
public class RequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7766283414388646551L;

	private String test;
	private String test2;
	
	
	
	public String getTest() {
		return test;
	}



	public void setTest(String test) {
		this.test = test;
	}



	public String getTest2() {
		return test2;
	}



	public void setTest2(String test2) {
		this.test2 = test2;
	}



	@Override
	public String toString() {
		return JsonUtil.parseToString(this);
	}
}
