package com.skill.tracker.model;

import java.io.Serializable;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;

public class Profile implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long requestId;
	private String associateId;
	@Valid
	private SkillSet skillSets;
	
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public String getAssociateId() {
		return associateId;
	}
	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
	public SkillSet getSkillSets() {
		return skillSets;
	}
	public void setSkillSets(SkillSet skillSets) {
		this.skillSets = skillSets;
	}			
}