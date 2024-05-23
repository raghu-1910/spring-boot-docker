package com.customer.management.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CutomerApiResponse {
	
	private String message;
	
	private String data;
	
	private boolean status;
	
	
}
