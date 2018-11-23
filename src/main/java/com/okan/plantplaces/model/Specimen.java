package com.okan.plantplaces.model;


public class Specimen {

    private int SpecimenId;
    private String longitude;
    private String latitude;
    private String description;

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
}
