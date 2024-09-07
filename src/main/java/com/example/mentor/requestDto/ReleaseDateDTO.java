package com.example.mentor.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class ReleaseDateDTO {
    @JsonProperty("Japan")
    public String japan;
    @JsonProperty("NorthAmerica")
    public String northAmerica;
    @JsonProperty("Europe")
    public String europe;
    @JsonProperty("Australia")
    public String australia;
}
