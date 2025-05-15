package com.example.TestData.domain;

import com.example.TestData.domain.constant.MockDataType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MockData {

    private MockDataType mockDataType;
    private String mockDataValue;

}