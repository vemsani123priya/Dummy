package com.cg.librarymanagement.dto;

import java.math.BigDecimal;

public class LibraryManagementDto {
private String id;
private String name;
private String amount;
public LibraryManagementDto()
{
	
}
public LibraryManagementDto(String id, String name, String amount) {
	super();
	this.id = id;
	this.name = name;
	this.amount = amount;
}

@Override
public String toString() {
	return "LibraryManagementDto [id=" + id + ", name=" + name + ", amount=" + amount + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
}
