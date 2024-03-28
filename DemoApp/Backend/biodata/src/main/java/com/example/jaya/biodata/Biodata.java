package com.example.jaya.biodata;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;


// @Value
// @Builder
// @JsonDeserialize(builder = Biodata.BiodataBuilder.class)
@Getter
@Setter
@Document(collection = "biodata")
public class Biodata {
    @Id
    private int id;
    private String name;
    private String age;
    private String contactno;

    // @JsonPOJOBuilder(withPrefix = "")
    // @JsonIgnoreProperties(ignoreUnknown = true)
    // public static class BiodataBuilder{

    // }
}
