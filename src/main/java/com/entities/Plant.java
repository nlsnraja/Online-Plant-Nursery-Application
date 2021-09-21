package com.sprint.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class  Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int plantId;
	private int plantHeight;
	private String plantSpread;
	private String commonName;
	private String bloomTime;
	private String medicinalOrCulinaryUse;
	private String difficultyLevel;
	private String temperature;
	private String typeOfPlant;
	private String plantDescription;
	private int plantsStock;
	private double plantCost;
}
