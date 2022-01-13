package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorUpload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-11T12:24:24.322Z")


public class ErrorUpload   {
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

  public ErrorUpload code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique alphanumeric human readable error code.
   * @return code
  **/
  @ApiModelProperty(example = "200", value = "Unique alphanumeric human readable error code.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorUpload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Brief summary of issue reported.
   * @return message
  **/
  @ApiModelProperty(example = "", value = "Brief summary of issue reported.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorUpload level(String level) {
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

  public ErrorUpload description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the issue reported.
   * @return description
  **/
  @ApiModelProperty(example = "", value = "Detailed description of the issue reported.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorUpload language(String language) {
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
    ErrorUpload errorUpload = (ErrorUpload) o;
    return Objects.equals(this.code, errorUpload.code) &&
        Objects.equals(this.message, errorUpload.message) &&
        Objects.equals(this.level, errorUpload.level) &&
        Objects.equals(this.description, errorUpload.description) &&
        Objects.equals(this.language, errorUpload.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, level, description, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorUpload {\n");
    
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

