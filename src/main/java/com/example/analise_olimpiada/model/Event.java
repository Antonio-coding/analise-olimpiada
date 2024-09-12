package com.example.analise_olimpiada.model;

public class Event {
    private int id;
    private String day;
    private String disciplineName;
    private String disciplinePictogram;
    private String venueName;
    private String eventName;
    private String detailedEventName;
    private String startDate;
    private String endDate;
    private String status;
    private int isMedalEvent;
    private int isLive;
    private String genderCode;
    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getDisciplineName() {
        return disciplineName;
    }
    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }
    public String getDisciplinePictogram() {
        return disciplinePictogram;
    }
    public void setDisciplinePictogram(String disciplinePictogram) {
        this.disciplinePictogram = disciplinePictogram;
    }
    public String getVenueName() {
        return venueName;
    }
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getDetailedEventName() {
        return detailedEventName;
    }
    public void setDetailedEventName(String detailedEventName) {
        this.detailedEventName = detailedEventName;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getIsMedalEvent() {
        return isMedalEvent;
    }
    public void setIsMedalEvent(int isMedalEvent) {
        this.isMedalEvent = isMedalEvent;
    }
    public int getIsLive() {
        return isLive;
    }
    public void setIsLive(int isLive) {
        this.isLive = isLive;
    }
    public String getGenderCode() {
        return genderCode;
    }
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }
}
