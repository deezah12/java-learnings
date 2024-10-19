package com.teamapt.dcir.lib.dtos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;
import java.util.List;

@Converter(autoApply = true)
public class ParticipantConverter implements AttributeConverter<List<ParticipantDto>, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<ParticipantDto> participantRequests) {
        if (participantRequests == null) {
            return null;
        }
        try {
            return objectMapper.writeValueAsString(participantRequests);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting participants list to JSON", e);
        }
    }

    @Override
    public List<ParticipantDto> convertToEntityAttribute(String participantRequestsJson) {
        if (participantRequestsJson == null || participantRequestsJson.isEmpty()) {
            return null;
        }
        try {
            return objectMapper.readValue(participantRequestsJson, new TypeReference<List<ParticipantDto>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Error converting JSON to participants", e);
        }
    }

}
