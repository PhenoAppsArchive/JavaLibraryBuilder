/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * GermplasmMCPDDonorInfoDonorInstitute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class GermplasmMCPDDonorInfoDonorInstitute {

  @SerializedName("instituteCode")
  private String instituteCode = null;

  @SerializedName("instituteName")
  private String instituteName = null;
  public GermplasmMCPDDonorInfoDonorInstitute instituteCode(String instituteCode) {
    this.instituteCode = instituteCode;
    return this;
  }

  

  /**
  * MCPD (v2.1) (DONORCODE) 22. FAO WIEWS code of the donor institute. Follows INSTCODE standard.
  * @return instituteCode
  **/
  @Schema(description = "MCPD (v2.1) (DONORCODE) 22. FAO WIEWS code of the donor institute. Follows INSTCODE standard.")
  public String getInstituteCode() {
    return instituteCode;
  }
  public void setInstituteCode(String instituteCode) {
    this.instituteCode = instituteCode;
  }
  public GermplasmMCPDDonorInfoDonorInstitute instituteName(String instituteName) {
    this.instituteName = instituteName;
    return this;
  }

  

  /**
  * MCPD (v2.1) (DONORNAME) 22.1  Name of the donor institute (or person). This descriptor should be used only if DONORCODE cannot be filled because the FAO WIEWS code for this institute is not available.
  * @return instituteName
  **/
  @Schema(description = "MCPD (v2.1) (DONORNAME) 22.1  Name of the donor institute (or person). This descriptor should be used only if DONORCODE cannot be filled because the FAO WIEWS code for this institute is not available.")
  public String getInstituteName() {
    return instituteName;
  }
  public void setInstituteName(String instituteName) {
    this.instituteName = instituteName;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmMCPDDonorInfoDonorInstitute germplasmMCPDDonorInfoDonorInstitute = (GermplasmMCPDDonorInfoDonorInstitute) o;
    return Objects.equals(this.instituteCode, germplasmMCPDDonorInfoDonorInstitute.instituteCode) &&
        Objects.equals(this.instituteName, germplasmMCPDDonorInfoDonorInstitute.instituteName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(instituteCode, instituteName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPDDonorInfoDonorInstitute {\n");
    
    sb.append("    instituteCode: ").append(toIndentedString(instituteCode)).append("\n");
    sb.append("    instituteName: ").append(toIndentedString(instituteName)).append("\n");
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
