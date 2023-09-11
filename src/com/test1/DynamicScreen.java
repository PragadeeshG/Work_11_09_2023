package com.test1;

public class DynamicScreen {
	private Integer screenId;
	private Integer childScreenId;
	private String refld;
	private String mainAction;
	private String formDivider;
	private boolean validationsApplicable;
	private String actionTypes;
	private String accessLevel;
	private String creationDate;
	private String entityState;

	public DynamicScreen() {

	}

	public DynamicScreen(Integer screenId, Integer childScreenId, String refld, String mainAction, String formDivider,
			boolean validationsApplicable, String actionTypes, String accessLevel, String creationDate,
			String entityState) {
		super();
		this.screenId = screenId;
		this.childScreenId = childScreenId;
		this.refld = refld;
		this.mainAction = mainAction;
		this.formDivider = formDivider;
		this.validationsApplicable = validationsApplicable;
		this.actionTypes = actionTypes;
		this.accessLevel = accessLevel;
		this.creationDate = creationDate;
		this.entityState = entityState;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getChildScreenId() {
		return childScreenId;
	}

	public void setChildScreenId(Integer childScreenId) {
		this.childScreenId = childScreenId;
	}

	public String getRefld() {
		return refld;
	}

	public void setRefld(String refld) {
		this.refld = refld;
	}

	public String getMainAction() {
		return mainAction;
	}

	public void setMainAction(String mainAction) {
		this.mainAction = mainAction;
	}

	public String getFormDivider() {
		return formDivider;
	}

	public void setFormDivider(String formDivider) {
		this.formDivider = formDivider;
	}

	public boolean isValidationsApplicable() {
		return validationsApplicable;
	}

	public void setValidationsApplicable(boolean validationsApplicable) {
		this.validationsApplicable = validationsApplicable;
	}

	public String getActionTypes() {
		return actionTypes;
	}

	public void setActionTypes(String actionTypes) {
		this.actionTypes = actionTypes;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
