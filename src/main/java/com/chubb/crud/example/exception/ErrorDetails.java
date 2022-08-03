package com.chubb.crud.example.exception;

import java.util.Date;

import com.chubb.crud.example.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;
	
}
