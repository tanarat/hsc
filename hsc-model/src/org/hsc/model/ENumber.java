package org.hsc.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ENumber {
	private String enumber;
	private String name;
	private String description;
	private int halalStatus;
	private Date updated;
	
	public static int STATUS_HALAL = 0;
	public static int STATUS_NOT_HALAL = 1;
	public static int STATUS_MUSHBOOH_OR_UNKNOWN = 2;
	public static int STATUS_HALAL_IF_NO_ALCOHOL = 3;
	public static int STATUS_MCG_CERTIFIED = 4;
	
	public static String STATUS_TEXT_HALAL = "Halal";
	public static String STATUS_TEXT_NOT_HALAL = "Not Halal";
	public static String STATUS_TEXT_MUSHBOOH_OR_UNKNOWN = "Mushbooh or Unknown";
	public static String STATUS_TEXT_HALAL_IF_NO_ALCOHOL = "Halal if no alcohol is used in flavor";
	public static String STATUS_TEXT_MCG_CERTIFIED = "MCG Certified Halal";
	
	public static String[] statusText = {	STATUS_TEXT_HALAL
											,STATUS_TEXT_NOT_HALAL
											,STATUS_TEXT_MUSHBOOH_OR_UNKNOWN
											,STATUS_TEXT_HALAL_IF_NO_ALCOHOL
											,STATUS_TEXT_MCG_CERTIFIED};
	
	public static String getStatusText(int status){
		if(status < statusText.length)
			return statusText[status];
		else 
			return "Unknow status code";
	}
	
	public ENumber() {
		super();
	}

	public ENumber(String enumber, String name, String description,
			int halalStatus, Date updated) {
		super();
		this.enumber = enumber;
		this.name = name;
		this.description = description;
		this.halalStatus = halalStatus;
		this.updated = updated;
	}

	public String getEnumber() {
		return enumber;
	}

	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHalalStatus() {
		return halalStatus;
	}

	public void setHalalStatus(int halalStatus) {
		this.halalStatus = halalStatus;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
