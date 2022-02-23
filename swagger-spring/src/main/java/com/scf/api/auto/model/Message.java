package com.scf.api.auto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * error details
 */
@ApiModel(description = "error details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-11T12:24:24.322Z")


public class Message   {
  /**
   * error type
   */
  public enum CriticalityEnum {
    INFO("INFO"),
    
    WARNING("WARNING"),
    
    ERROR("ERROR"),
    
    FATAL("FATAL");

    private String value;

    CriticalityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CriticalityEnum fromValue(String text) {
      for (CriticalityEnum b : CriticalityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("criticality")
  private CriticalityEnum criticality = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("description")
  private String description = null;

  public Message criticality(CriticalityEnum criticality) {
    this.criticality = criticality;
    return this;
  }

  /**
   * error type
   * @return criticality
  **/
  @ApiModelProperty(example = "ERROR", value = "error type")


  public CriticalityEnum getCriticality() {
    return criticality;
  }

  public void setCriticality(CriticalityEnum criticality) {
    this.criticality = criticality;
  }

  public Message code(String code) {
    this.code = code;
    return this;
  }

  /**
   * identifier code
   * @return code
  **/
  @ApiModelProperty(example = "10002", value = "identifier code")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Message alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * alias
   * @return alias
  **/
  @ApiModelProperty(example = "invalidParameter", value = "alias")


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Message description(String description) {
    this.description = description;
    return this;
  }

  /**
   * details
   * @return description
  **/
  @ApiModelProperty(example = "Invalid parameters", value = "details")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.criticality, message.criticality) &&
        Objects.equals(this.code, message.code) &&
        Objects.equals(this.alias, message.alias) &&
        Objects.equals(this.description, message.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticality, code, alias, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

