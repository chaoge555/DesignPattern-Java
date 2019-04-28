package mode.prototype;

import java.io.*;

public class ResumeDeep implements Cloneable, Serializable {
    private String skill;
    private PersonalInfo personalInfo;
    private WorkExperience workExperience;

    public ResumeDeep(String skill, PersonalInfo personalInfo, WorkExperience workExperience) {
        this.skill = skill;
        this.personalInfo = personalInfo;
        this.workExperience = workExperience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public ResumeDeep clone() {
        ResumeDeep resumeDeep = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            resumeDeep = (ResumeDeep) objectInputStream.readObject();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return resumeDeep;

    }

    public void Display() {
        System.out.println("个人信息："+personalInfo.getName()+" "
                +personalInfo.getSex()+" "+personalInfo.getAge());
        System.out.println("工作经历："+workExperience.getTimeArea()
                +" "+workExperience.getCompany());
        System.out.println("技能："+skill);
    }
}
