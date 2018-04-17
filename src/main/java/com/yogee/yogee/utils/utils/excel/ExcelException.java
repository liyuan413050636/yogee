/**
 * Copyright (c) 2017-Now http://www.yogee.xin All rights reserved.
 */
package com.yogee.yogee.utils.utils.excel;

/**
 * Excel Exception
 * @author ThinkGem
 */
public class ExcelException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcelException() {
		super();
	}

	public ExcelException(String message) {
		super(message);
	}

	public ExcelException(Throwable cause) {
		super(cause);
	}

	public ExcelException(String message, Throwable cause) {
		super(message, cause);
	}
}
