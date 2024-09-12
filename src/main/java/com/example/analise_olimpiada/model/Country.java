package com.example.analise_olimpiada.model;

public class Country {
    private String id;
    private String name;
    private String continent;
    private String flagUrl;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;
    private int totalMedals;
    private int rank;
    private int rankTotalMedals;
    // getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getFlagUrl() {
        return flagUrl;
    }
    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
    public int getGoldMedals() {
        return goldMedals;
    }
    public void setGoldMedals(int goldMedals) {
        this.goldMedals = goldMedals;
    }
    public int getSilverMedals() {
        return silverMedals;
    }
    public void setSilverMedals(int silverMedals) {
        this.silverMedals = silverMedals;
    }
    public int getBronzeMedals() {
        return bronzeMedals;
    }
    public void setBronzeMedals(int bronzeMedals) {
        this.bronzeMedals = bronzeMedals;
    }
    public int getTotalMedals() {
        return totalMedals;
    }
    public void setTotalMedals(int totalMedals) {
        this.totalMedals = totalMedals;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRankTotalMedals() {
        return rankTotalMedals;
    }
    public void setRankTotalMedals(int rankTotalMedals) {
        this.rankTotalMedals = rankTotalMedals;
    }
}
