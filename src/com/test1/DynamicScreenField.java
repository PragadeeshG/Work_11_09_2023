package com.test1;

public class DynamicScreenField {
	private Integer screenId;
	private Integer fieldId;
	private String columnName;
	private String jsonName;
	private boolean required;
	private boolean primary;
	private int length;
	private String dataType;
	private String creationDate;
	private String entityState;

	public DynamicScreenField() {

	}

	public DynamicScreenField(Integer screenId, Integer fieldId, String columnName, String jsonName, boolean required,
			boolean primary, int length, String dataType, String creationDate, String entityState) {
		super();
		this.screenId = screenId;
		this.fieldId = fieldId;
		this.columnName = columnName;
		this.jsonName = jsonName;
		this.required = required;
		this.primary = primary;
		this.length = length;
		this.dataType = dataType;
		this.creationDate = creationDate;
		this.entityState = entityState;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getFieldId() {
		return fieldId;
	}

	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getJsonName() {
		return jsonName;
	}

	public void setJsonName(String jsonName) {
		this.jsonName = jsonName;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
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
