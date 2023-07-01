package br.com.posarquiteturapuc2022.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StandardError {

	private LocalDateTime timestamp;
	private String error;
	private Integer status;
	private String path;
}
