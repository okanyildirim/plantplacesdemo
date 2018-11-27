package com.okan.plantplaces.model;


import java.util.Objects;

public class Specimen {

    private int SpecimenId;
    private String longitude;
    private String latitude;
    private String description;
    private int plantId;

    public Specimen() {
    }

    public Specimen(int specimenId, String longitude, String latitude, String description) {
        SpecimenId = specimenId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
    }

    public int getSpecimenId() {
        return SpecimenId;
    }

    public void setSpecimenId(int specimenId) {
        SpecimenId = specimenId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Specimen{" +
                "SpecimenId=" + SpecimenId +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specimen specimen = (Specimen) o;
        return SpecimenId == specimen.SpecimenId &&
                plantId == specimen.plantId &&
                Objects.equals(longitude, specimen.longitude) &&
                Objects.equals(latitude, specimen.latitude) &&
                Objects.equals(description, specimen.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(SpecimenId, longitude, latitude, description, plantId);
    }
}
