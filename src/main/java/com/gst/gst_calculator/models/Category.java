package com.gst.gst_calculator.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="gst_rate")
    private Double gstRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGstRate() {
        return gstRate;
    }

    public void setGstRate(Double gstRate) {
        this.gstRate = gstRate;
    }

}
