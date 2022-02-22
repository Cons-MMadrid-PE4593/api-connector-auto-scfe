package io.swagger.exception;

import java.util.HashMap;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Object that contains error information.
 */
@ApiModel(description = "Object that contains error information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-11T12:24:24.322Z")


public class Error extends HashMap<String, Object>  {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("level")
  private String level = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("language")
  private String language = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique alphanumeric human readable error code.
   * @return code
  **/
  @ApiModelProperty(example = "400", value = "Unique alphanumeric human readable error code.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Brief summary of issue reported.
   * @return message
  **/
  @ApiModelProperty(example = "Bad Request", value = "Brief summary of issue reported.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Different issue level: INFO, WARNING, ERROR, FATAL.
   * @return level
  **/
  @ApiModelProperty(example = "INFO", value = "Different issue level: INFO, WARNING, ERROR, FATAL.")


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the issue reported.
   * @return description
  **/
  @ApiModelProperty(example = "Request is malformed or there are missing mandatory parameters.", value = "Detailed description of the issue reported.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Detailed of the language
   * @return language
  **/
  @ApiModelProperty(example = "", value = "Detailed of the language")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.level, error.level) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.language, error.language) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, level, description, language, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
