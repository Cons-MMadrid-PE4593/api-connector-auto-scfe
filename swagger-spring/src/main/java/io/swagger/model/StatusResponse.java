package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StatusResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-11T12:24:24.322Z")


public class StatusResponse   {
  @JsonProperty("Return")
  private String _return = null;

  @JsonProperty("StatusId")
  private String statusId = null;

  @JsonProperty("ErrorDesc")
  private String errorDesc = null;

  public StatusResponse _return(String _return) {
    this._return = _return;
    return this;
  }

  /**
   * Get _return
   * @return _return
  **/
  @ApiModelProperty(value = "")


  public String getReturn() {
    return _return;
  }

  public void setReturn(String _return) {
    this._return = _return;
  }

  public StatusResponse statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")


  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  public StatusResponse errorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    return this;
  }

  /**
   * Get errorDesc
   * @return errorDesc
  **/
  @ApiModelProperty(value = "")


  public String getErrorDesc() {
    return errorDesc;
  }

  public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponse statusResponse = (StatusResponse) o;
    return Objects.equals(this._return, statusResponse._return) &&
        Objects.equals(this.statusId, statusResponse.statusId) &&
        Objects.equals(this.errorDesc, statusResponse.errorDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return, statusId, errorDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResponse {\n");
    
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    errorDesc: ").append(toIndentedString(errorDesc)).append("\n");
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

