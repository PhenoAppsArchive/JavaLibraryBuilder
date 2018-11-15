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
import io.swagger.client.model.Method;
import io.swagger.client.model.OntologyRefernce;
import io.swagger.client.model.Scale;
import io.swagger.client.model.Trait;
import io.swagger.client.model.VariableBaseClass;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * GermplasmAttributeDef
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class GermplasmAttributeDef extends VariableBaseClass {

  @SerializedName("attributeCategoryDbId")
  private String attributeCategoryDbId = null;

  @SerializedName("attributeDbId")
  private String attributeDbId = null;

  @SerializedName("attributeName")
  private String attributeName = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("datatype")
  private String datatype = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("values")
  private String values = null;
  public GermplasmAttributeDef attributeCategoryDbId(String attributeCategoryDbId) {
    this.attributeCategoryDbId = attributeCategoryDbId;
    return this;
  }

  

  /**
  * General category for the attribute. very similar to Trait class.
  * @return attributeCategoryDbId
  **/
  @Schema(description = "General category for the attribute. very similar to Trait class.")
  public String getAttributeCategoryDbId() {
    return attributeCategoryDbId;
  }
  public void setAttributeCategoryDbId(String attributeCategoryDbId) {
    this.attributeCategoryDbId = attributeCategoryDbId;
  }
  public GermplasmAttributeDef attributeDbId(String attributeDbId) {
    this.attributeDbId = attributeDbId;
    return this;
  }

  

  /**
  * The ID which uniquely identifies this attribute within the given database server
  * @return attributeDbId
  **/
  @Schema(required = true, description = "The ID which uniquely identifies this attribute within the given database server")
  public String getAttributeDbId() {
    return attributeDbId;
  }
  public void setAttributeDbId(String attributeDbId) {
    this.attributeDbId = attributeDbId;
  }
  public GermplasmAttributeDef attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  

  /**
  * A human readable name for this attribute
  * @return attributeName
  **/
  @Schema(required = true, description = "A human readable name for this attribute")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }
  public GermplasmAttributeDef code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - see \&quot;this.trait.alternativeAbbreviations\&quot;
  * @return code
  **/
  @Schema(description = "DEPRECATED in v1.3 - see \"this.trait.alternativeAbbreviations\"")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public GermplasmAttributeDef datatype(String datatype) {
    this.datatype = datatype;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - see \&quot;this.scale.dataType\&quot;
  * @return datatype
  **/
  @Schema(description = "DEPRECATED in v1.3 - see \"this.scale.dataType\"")
  public String getDatatype() {
    return datatype;
  }
  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }
  public GermplasmAttributeDef description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * A human readable description of this attribute
  * @return description
  **/
  @Schema(description = "A human readable description of this attribute")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public GermplasmAttributeDef name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - Use \&quot;this.attributeName\&quot;
  * @return name
  **/
  @Schema(description = "DEPRECATED in v1.3 - Use \"this.attributeName\"")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public GermplasmAttributeDef uri(String uri) {
    this.uri = uri;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - see \&quot;this.xref\&quot;
  * @return uri
  **/
  @Schema(description = "DEPRECATED in v1.3 - see \"this.xref\"")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }
  public GermplasmAttributeDef values(String values) {
    this.values = values;
    return this;
  }

  

  /**
  * DEPRECATED in v1.3 - see \&quot;this.scale.validValues\&quot;
  * @return values
  **/
  @Schema(description = "DEPRECATED in v1.3 - see \"this.scale.validValues\"")
  public String getValues() {
    return values;
  }
  public void setValues(String values) {
    this.values = values;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmAttributeDef germplasmAttributeDef = (GermplasmAttributeDef) o;
    return Objects.equals(this.attributeCategoryDbId, germplasmAttributeDef.attributeCategoryDbId) &&
        Objects.equals(this.attributeDbId, germplasmAttributeDef.attributeDbId) &&
        Objects.equals(this.attributeName, germplasmAttributeDef.attributeName) &&
        Objects.equals(this.code, germplasmAttributeDef.code) &&
        Objects.equals(this.datatype, germplasmAttributeDef.datatype) &&
        Objects.equals(this.description, germplasmAttributeDef.description) &&
        Objects.equals(this.name, germplasmAttributeDef.name) &&
        Objects.equals(this.uri, germplasmAttributeDef.uri) &&
        Objects.equals(this.values, germplasmAttributeDef.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(attributeCategoryDbId, attributeDbId, attributeName, code, datatype, description, name, uri, values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributeCategoryDbId: ").append(toIndentedString(attributeCategoryDbId)).append("\n");
    sb.append("    attributeDbId: ").append(toIndentedString(attributeDbId)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
