package org.example.bank.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Alias is required")
    private String alias;

    @NotBlank(message = "Type is required")
    private String type;

    @NotNull(message = "Direction is required")
    @Enumerated(EnumType.STRING)
    private Direction direction;

    private String application;

    @NotNull(message = "Processed Flow Type is required")
    @Enumerated(EnumType.STRING)
    private ProcessedFlowType processedFlowType;

    @NotBlank(message = "Description is required")
    private String description;

    // Getters et Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
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
}
// Enumérations

