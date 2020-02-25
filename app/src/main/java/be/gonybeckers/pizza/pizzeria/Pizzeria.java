package be.gonybeckers.pizza.pizzeria;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"information", "opening", "pizza", "supplements"})
public class Pizzeria {

    @JsonProperty("information")
    private Information information;
    @JsonProperty("opening")
    private List<Opening> opening = null;
    @JsonProperty("pizza")
    private List<Pizza> pizza = null;
    @JsonProperty("supplements")
    private List<Supplement> supplements = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("information")
    public Information getInformation() {
        return information;
    }

    @JsonProperty("information")
    public void setInformation(Information information) {
        this.information = information;
    }

    @JsonProperty("opening")
    public List<Opening> getOpening() {
        return opening;
    }

    @JsonProperty("opening")
    public void setOpening(List<Opening> opening) {
        this.opening = opening;
    }

    @JsonProperty("pizza")
    public List<Pizza> getPizza() {
        return pizza;
    }

    @JsonProperty("pizza")
    public void setPizza(List<Pizza> pizza) {
        this.pizza = pizza;
    }

    @JsonProperty("supplements")
    public List<Supplement> getSupplements() {
        return supplements;
    }

    @JsonProperty("supplements")
    public void setSupplements(List<Supplement> supplements) {
        this.supplements = supplements;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
