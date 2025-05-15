package com.example.TestData.domain;

import com.example.TestData.domain.constant.MockDataType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SchemaField {

    private String fieldName;
    private MockDataType mockDataType;
    private Integer fieldOrder;
    private Integer blackPercent;
    private String typeOptionJson;
    private String forceValue;

}
