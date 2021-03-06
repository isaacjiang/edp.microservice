package com.edp.business.models;

import com.edp.system.Utilities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "actions")
public class Actions {
    @Id
    private String id;
    private String category;
    private String name;
    private String companyType;
    private int periodStart;
    private int periodOccurs;
    private double cost;
    private double associatedCost;
    private double stressIndex;
    private double legitimacyIndex;
    private double competenceIndex;
    private double adaptabilityIndex;
    private int cosChange;



    public Actions(){
        setId(Utilities.GenerateId());
    }

    public String getId() {
        return id;
    }

    public Actions setId(String id) {
        this.id = id;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Actions setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getName() {
        return name;
    }

    public Actions setName(String name) {
        this.name = name;
        return this;
    }

    public String getCompanyType() {
        return companyType;
    }

    public Actions setCompanyType(String companyType) {
        this.companyType = companyType;
        return this;
    }

    public int getPeriodStart() {
        return periodStart;
    }

    public Actions setPeriodStart(int periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    public int getPeriodOccurs() {
        return periodOccurs;
    }

    public Actions setPeriodOccurs(int periodOccurs) {
        this.periodOccurs = periodOccurs;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public Actions setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public double getAssociatedCost() {
        return associatedCost;
    }

    public Actions setAssociatedCost(double associatedCost) {
        this.associatedCost = associatedCost;
        return this;
    }

    public double getStressIndex() {
        return stressIndex;
    }

    public Actions setStressIndex(double stressIndex) {
        this.stressIndex = stressIndex;
        return this;
    }

    public double getLegitimacyIndex() {
        return legitimacyIndex;
    }

    public Actions setLegitimacyIndex(double legitimacyIndex) {
        this.legitimacyIndex = legitimacyIndex;
        return this;
    }

    public double getCompetenceIndex() {
        return competenceIndex;
    }

    public Actions setCompetenceIndex(double competenceIndex) {
        this.competenceIndex = competenceIndex;
        return this;
    }

    public double getAdaptabilityIndex() {
        return adaptabilityIndex;
    }

    public Actions setAdaptabilityIndex(double adaptabilityIndex) {
        this.adaptabilityIndex = adaptabilityIndex;
        return this;
    }

    public int getCosChange() {
        return cosChange;
    }

    public Actions setCosChange(int cosChange) {
        this.cosChange = cosChange;
        return this;
    }
}
