package io.swagger.exception;

import java.util.HashMap;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

/**
 * Error response.
 */
@ApiModel(description = "Error response.")
@Validated

public class ResponseError extends HashMap<String, Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("errors")
	private ErrorsList errors = null;

	public ResponseError errors(ErrorsList errors) {
		this.errors = errors;
		return this;
	}

	public ErrorsList getErrors() {
		return errors;
	}

	public void setErrors(ErrorsList errors) {
		this.errors = errors;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ResponseError responseError = (ResponseError) o;
		return Objects.equals(this.errors, responseError.errors) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(errors, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ResponseError {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}