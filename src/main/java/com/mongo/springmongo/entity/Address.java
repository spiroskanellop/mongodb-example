package com.mongo.springmongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor @AllArgsConstructor
@Document
public class Address {
    @Id
    private static String id;
    private String country;
    private String city;
    private String postCode;
}
