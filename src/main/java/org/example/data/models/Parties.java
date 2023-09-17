package org.example.data.models;

import lombok.*;
@Getter

@AllArgsConstructor
@NoArgsConstructor

public enum Parties {
    APC("APC"),
    PDP("PDP"),
    ANPP("ANPP"),
    LP("LP"),
    APGA("APGA"),
    APP("APP"),
    YDP("YDP"),
    NNPP("NNPP"),
    ADC("ADC"),
    ;

    private String partyName;

}
