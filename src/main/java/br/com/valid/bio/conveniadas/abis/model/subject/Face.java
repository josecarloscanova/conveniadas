package br.com.valid.bio.conveniadas.abis.model.subject;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Face {

	@JsonProperty("key")
	private String key;
	@JsonProperty("created")
	private String created;
	@JsonProperty("updated")
	private String updated;
	@JsonProperty("status")
	private String status;
	@JsonProperty("data")
	@Valid
	private List<FormatSourceData> data = null;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Face() {}
	
	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	@JsonProperty("created")
	public String getCreated() {
		return created;
	}

	@JsonProperty("created")
	public void setCreated(String created) {
		this.created = created;
	}

	@JsonProperty("updated")
	public String getUpdated() {
		return updated;
	}

	@JsonProperty("updated")
	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("data")
	public List<FormatSourceData> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<FormatSourceData> data) {
		this.data = data;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Face [key=" + key + ", created=" + created + ", updated=" + updated + ", status=" + status + ", data="
				+ data + ", additionalProperties=" + additionalProperties + "]";
	}

}