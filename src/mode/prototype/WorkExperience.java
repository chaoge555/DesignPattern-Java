package mode.prototype;

import java.io.Serializable;

public class WorkExperience implements Serializable {
    private String timeArea;
    private String company;

    public WorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
