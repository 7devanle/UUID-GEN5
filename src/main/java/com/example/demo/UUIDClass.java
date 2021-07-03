package com.example.demo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UUIDClass {
	@Id
	private UUID uuid; 
	private LocalDateTime now;
	private String timenow; 
	
	public UUIDClass() {
		super();
		this.uuid = UUID.randomUUID();
		this.now = LocalDateTime.now();
		this.timenow = now.toString();
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "UUIDClass [uuid=" + uuid + ", timenow=" + timenow + "]";
	}
	
}
