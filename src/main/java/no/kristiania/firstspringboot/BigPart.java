package no.kristiania.firstspringboot;

import lombok.*;

//@Data -- we don't have to write getters and setters and constructor

@Getter
@Setter
@Builder
public class BigPart {
    private String partName;
    private int partNumber;
    private int numberOfChickens;
}
