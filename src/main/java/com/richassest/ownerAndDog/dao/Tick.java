package com.richassest.ownerAndDog.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Document(collection = "ticks")
public class Tick {
    String instrument;
    String price;
}