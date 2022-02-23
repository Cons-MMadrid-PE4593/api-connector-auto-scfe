package com.scf.api.auto.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProposalResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-11T12:24:24.322Z")


public class ProposalResponse   {
  @JsonProperty("Return")
  private String _return = null;

  @JsonProperty("ProposalId")
  private String proposalId = null;

  @JsonProperty("Token")
  private String token = null;

  public ProposalResponse _return(String _return) {
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

  public ProposalResponse proposalId(String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * Get proposalId
   * @return proposalId
  **/
  @ApiModelProperty(value = "")


  public String getProposalId() {
    return proposalId;
  }

  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }

  public ProposalResponse token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProposalResponse proposalResponse = (ProposalResponse) o;
    return Objects.equals(this._return, proposalResponse._return) &&
        Objects.equals(this.proposalId, proposalResponse.proposalId) &&
        Objects.equals(this.token, proposalResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return, proposalId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProposalResponse {\n");
    
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

