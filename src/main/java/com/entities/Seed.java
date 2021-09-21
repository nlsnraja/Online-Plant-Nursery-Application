package com.example.demo.entities;

import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="seed")
public class Seed {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seedId;
	private String commonname;
	private String bloomTime;
	private String watering;
	private String difficultyLevel;
	private String temperature;
	private String typeOfSeeds;
	private String seedsDescription;
	private int seedsStock;
	private double seedsCost;
	private int seedsPerPacket;
	@OneToOne(mappedBy="seed",cascade=CascadeType.ALL)
	private Set<Planter> planter=new HashSet<>();
	public int getSeedId() {
		return seedId;
	}
	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}
	public String getCommonname() {
		return commonname;
	}
	public void setCommonname(String commonname) {
		this.commonname = commonname;
	}
	public String getBloomTime() {
		return bloomTime;
	}
	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getTypeOfSeeds() {
		return typeOfSeeds;
	}
	public void setTypeOfSeeds(String typeOfSeeds) {
		this.typeOfSeeds = typeOfSeeds;
	}
	public String getSeedsDescription() {
		return seedsDescription;
	}
	public void setSeedsDescription(String seedsDescription) {
		this.seedsDescription = seedsDescription;
	}
	public int getSeedsStock() {
		return seedsStock;
	}
	public void setSeedsStock(int seedsStock) {
		this.seedsStock = seedsStock;
	}
	public double getSeedsCost() {
		return seedsCost;
	}
	public void setSeedsCost(double seedsCost) {
		this.seedsCost = seedsCost;
	}
	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}
	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}

}
