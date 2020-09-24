package com.zelish.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_food_facility")
public class DeliveryDetails {
	@Id
	private int location_id;
    private String applicant;
    private String facility_type;
    private int cnn;
    private String location_Description;
    private String address;
    private String block_lot;
    private String block;
    private String iot;
    private String permit;
    private String status;
    private String food_items;
    private int x;
    private int y;
    private int latitude;
    private int longitude;
    private String schedule;
    private Date NOIsent;
    private Date approved;
    private Date received;
    private Boolean prior_permit;
    private Date expiration_Date;
    private String location;
	public DeliveryDetails(int location_id, String applicant, String facility_type, int cnn,
			String location_Description, String address, String block_lot, String block, String iot, String permit,
			String status, String food_items, int x, int y, int latitude, int longitude, String schedule, Date nOIsent,
			Date approved, Date received, Boolean prior_permit, Date expiration_Date, String location) {
		super();
		this.location_id = location_id;
		this.applicant = applicant;
		this.facility_type = facility_type;
		this.cnn = cnn;
		this.location_Description = location_Description;
		this.address = address;
		this.block_lot = block_lot;
		this.block = block;
		this.iot = iot;
		this.permit = permit;
		this.status = status;
		this.food_items = food_items;
		this.x = x;
		this.y = y;
		this.latitude = latitude;
		this.longitude = longitude;
		this.schedule = schedule;
		NOIsent = nOIsent;
		this.approved = approved;
		this.received = received;
		this.prior_permit = prior_permit;
		this.expiration_Date = expiration_Date;
		this.location = location;
	}
	public DeliveryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getFacility_type() {
		return facility_type;
	}
	public void setFacility_type(String facility_type) {
		this.facility_type = facility_type;
	}
	public int getCnn() {
		return cnn;
	}
	public void setCnn(int cnn) {
		this.cnn = cnn;
	}
	public String getLocation_Description() {
		return location_Description;
	}
	public void setLocation_Description(String location_Description) {
		this.location_Description = location_Description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBlock_lot() {
		return block_lot;
	}
	public void setBlock_lot(String block_lot) {
		this.block_lot = block_lot;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getIot() {
		return iot;
	}
	public void setIot(String iot) {
		this.iot = iot;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFood_items() {
		return food_items;
	}
	public void setFood_items(String food_items) {
		this.food_items = food_items;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public Date getNOIsent() {
		return NOIsent;
	}
	public void setNOIsent(Date nOIsent) {
		NOIsent = nOIsent;
	}
	public Date getApproved() {
		return approved;
	}
	public void setApproved(Date approved) {
		this.approved = approved;
	}
	public Date getReceived() {
		return received;
	}
	public void setReceived(Date received) {
		this.received = received;
	}
	public Boolean getPrior_permit() {
		return prior_permit;
	}
	public void setPrior_permit(Boolean prior_permit) {
		this.prior_permit = prior_permit;
	}
	public Date getExpiration_Date() {
		return expiration_Date;
	}
	public void setExpiration_Date(Date expiration_Date) {
		this.expiration_Date = expiration_Date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "DeliveryDetails [location_id=" + location_id + ", applicant=" + applicant + ", facility_type="
				+ facility_type + ", cnn=" + cnn + ", location_Description=" + location_Description + ", address="
				+ address + ", block_lot=" + block_lot + ", block=" + block + ", iot=" + iot + ", permit=" + permit
				+ ", status=" + status + ", food_items=" + food_items + ", x=" + x + ", y=" + y + ", latitude="
				+ latitude + ", longitude=" + longitude + ", schedule=" + schedule + ", NOIsent=" + NOIsent
				+ ", approved=" + approved + ", received=" + received + ", prior_permit=" + prior_permit
				+ ", expiration_Date=" + expiration_Date + ", location=" + location + "]";
	}
	
	
    
    
    
	
	
}
