package com.example.demo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UUIDClass {
	@Id
	private int id;
	private UUID uuid = UUID.randomUUID();
	private LocalDate date;
	private LocalTime time;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public void getUUID() {
		System.out.println(uuid + "\n" + date+"  " + time);
	}

	@Override
	public String toString() {
		return "UUIDClass [id=" + id + ", uuid=" + uuid + ", date=" + date + ", time=" + time + "]";
	}
}
