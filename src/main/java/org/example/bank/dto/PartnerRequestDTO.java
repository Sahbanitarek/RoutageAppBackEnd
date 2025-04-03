package org.example.bank.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.example.bank.entities.Direction;
import org.example.bank.entities.ProcessedFlowType;
import org.springframework.data.domain.Sort;

// DTO pour la requête
public class PartnerRequestDTO {
    @NotBlank
    private String alias;
    @NotBlank
    private String type;
    @NotNull
    private Direction direction;
    private String application;
    @NotNull
    private ProcessedFlowType processedFlowType;
    @NotBlank
    private String description;

    // Getters et Setters

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public ProcessedFlowType getProcessedFlowType() {
        return processedFlowType;
    }

    public void setProcessedFlowType(ProcessedFlowType processedFlowType) {
        this.processedFlowType = processedFlowType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}