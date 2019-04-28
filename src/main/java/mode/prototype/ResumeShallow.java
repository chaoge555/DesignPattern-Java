package mode.prototype;

public class ResumeShallow implements Cloneable {
    private String skill;
    private PersonalInfo personalInfo;
    private WorkExperience workExperience;

    public ResumeShallow(String skill, PersonalInfo personalInfo, WorkExperience workExperience) {
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

    public ResumeShallow clone() {
        ResumeShallow resumeShallow = null;
        try {
            resumeShallow = (ResumeShallow) super.clone();
        } catch (CloneNotSupportedException e) {
        /*    System.out.println(e.getMessage());*/
            e.printStackTrace();
        }
        return resumeShallow;

    }

    public void Display() {
        System.out.println("个人信息："+personalInfo.getName()+" "
                +personalInfo.getSex()+" "+personalInfo.getAge());
        System.out.println("工作经历："+workExperience.getTimeArea()
                +" "+workExperience.getCompany());
        System.out.println("技能："+skill);
    }
}
