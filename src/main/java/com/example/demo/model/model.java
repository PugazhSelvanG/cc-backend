package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Anime")
public class model {
	@Id
	private int sno;
	private String animename;
	private String mainlead;
	private int noofepisodes;
	private float rating;


	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getAnimename() {
		return animename;
	}
	public void setAnimename(String animename) {
		this.animename = animename;
	}
	public String getMainlead() {
		return mainlead;
	}
	public void setMainlead(String mainlead) {
		this.mainlead = mainlead;
	}
	public int getNoofepisodes() {
		return noofepisodes;
	}
	public void setNoofepisodes(int noofepisodes) {
		this.noofepisodes = noofepisodes;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public model(int sno, String animename, String mainlead, int noofepisodes, float rating) {
		super();
		this.sno = sno;
		this.animename = animename;
		this.mainlead = mainlead;
		this.noofepisodes = noofepisodes;
		this.rating = rating;
	}
	public model() {
		
	}
	public String toString()
	{
		return "sno="+sno+"animename="+animename+"mainlead="+mainlead+"noofepisodes="+noofepisodes+"rating="+rating;
	}
}