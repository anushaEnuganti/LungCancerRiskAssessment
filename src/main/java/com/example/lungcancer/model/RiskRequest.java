
package com.example.lungcancer.model;

public class RiskRequest {
    private int age;
    private String smoker;
    private String cough;
    private String chestPain;
    private String breath;
    private String fatigue;
    private String coughingBlood;
    private String familyHistory;
    private String gender;


    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSmoker() { return smoker; }
    public void setSmoker(String smoker) { this.smoker = smoker; }

    public String getCough() { return cough; }
    public void setCough(String cough) { this.cough = cough; }

    public String getChestPain() { return chestPain; }
    public void setChestPain(String chestPain) { this.chestPain = chestPain; }

    public String getBreath() { return breath; }
    public void setBreath(String breath) { this.breath = breath; }
    public String getFatigue() {
        return fatigue;
    }

    public void setFatigue(String fatigue) {
        this.fatigue = fatigue;
    }

    public String getCoughingBlood() {
        return coughingBlood;
    }

    public void setCoughingBlood(String coughingBlood) {
        this.coughingBlood = coughingBlood;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
