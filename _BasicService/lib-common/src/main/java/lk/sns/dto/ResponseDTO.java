package lk.sns.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1600682669303591697L;
	private Boolean success;
	private String message;
	public ResponseDTO() {
	}
	
	public ResponseDTO(boolean success) {
		this.success = success;
	}

	
	public ResponseDTO(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}


	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
