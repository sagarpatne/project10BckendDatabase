package com.rays.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 * @author SAGAR PATNE
 */
public class DatabaseException extends RuntimeException {

	/**
	 * @param msg
	 *            : Error message
	 */
	public DatabaseException(String msg) {
		super(msg);
	}

}