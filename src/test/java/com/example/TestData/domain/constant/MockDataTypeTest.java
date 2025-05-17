package com.example.TestData.domain.constant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[Domain] 테스트 데이터 자료형 테스트")
class MockDataTypeTest {

    @DisplayName("자료형이 주어지면, 해당 원소의 이름을 리턴한다.")
    @Test
    void givenMockDataType_whenReading_thenReturnsEnumElementName() {
        // given
        MockDataType mockDataType = MockDataType.STRING;

        // when
        // 기본적으로 Enum.toString()은 Enum.name()을 반환
        // Enum에서 toString()을 재정의하지 않으면, 기본적으로 name()을 반환
        String elementName = mockDataType.toString();

        // then
        assertThat(elementName).isEqualTo(MockDataType.STRING.name());
    }

    @DisplayName("자료형이 주어지면, 해당 원소의 데이터를 리턴한다.")
    @Test
    void givenMockDataType_whenReading_thenReturnsEnumElementObject() {
        // Given
        MockDataType mockDataType = MockDataType.STRING;

        // When
        MockDataType.MockDataTypeObject result = mockDataType.toObject();

        // Then
        // contains()는 문자열이 특정 단어를 포함하고 있는지 검사하는 메서드
        assertThat(result.toString()).contains("name", "requiredOptions", "baseType");
    }

}