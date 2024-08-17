package org.first.stockmanagementservice.dto;

public class ResponseDto<T> //The <T> is a type parameter that allows the class to be used with different types of objects.
{
	private int status;
	private T data;
	private String message;

	public ResponseDto()
	{
	}

	public ResponseDto( int status, String message )
	{
		this.status = status;
		this.message = message;
	}

	public ResponseDto( int status, T data, String message )
	{
		this.status = status;
		this.data = data;
		this.message = message != null ? message : "No message provided";//had a problem with massage trasfering.
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus( int status )
	{
		this.status = status;
	}

	public T getData()
	{
		return data;
	}

	public void setData( T data )
	{
		this.data = data;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}
}
