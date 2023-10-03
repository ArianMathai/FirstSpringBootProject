package no.kristiania.firstspringboot;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public record Part (
        // @JsonProperty("navn") // overrides the json properties coming in. This will now receive json prop "navn".
        String name
){

}
