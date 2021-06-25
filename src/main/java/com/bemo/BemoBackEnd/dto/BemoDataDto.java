package com.bemo.BemoBackEnd.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document
public class BemoDataDto {
	@Id
	private String id;
	private String region;
	private String central;
	private String code;
	private String passiveId;
	private String fromPath;
	private String toPath;
	private String fromRoom;
	private String toRoom;
	private String cableCapacity;
	private String cableLength;
	private String brahchNumber;
	private String tubeColor;
	private String freeBranch;
	private String fiberJunctionNumber;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date storeDate;

}
