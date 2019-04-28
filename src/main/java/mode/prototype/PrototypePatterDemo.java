package mode.prototype;

import java.io.Serializable;

public class PrototypePatterDemo implements Serializable {
    public static void main(String[] args) {
        PersonalInfo personalInfoOne = new PersonalInfo("小明", "男", 20);
        WorkExperience workExperienceOne = new WorkExperience("2010-2012", "xxx公司");
        ResumeShallow resumeShallow = new ResumeShallow("游泳", personalInfoOne, workExperienceOne);

        ResumeShallow resumeShallowCopy = resumeShallow.clone();
        resumeShallowCopy.setSkill("跳高");
        resumeShallowCopy.getPersonalInfo().setName("小红");
        resumeShallowCopy.getPersonalInfo().setSex("女");
        resumeShallowCopy.getPersonalInfo().setAge(18);
        resumeShallowCopy.getWorkExperience().setTimeArea("2011-2032");
        resumeShallowCopy.getWorkExperience().setCompany("YYY公司");

        System.out.println("浅拷贝输出对比：");
        resumeShallow.Display();
        System.out.println("拷贝后：");
        resumeShallowCopy.Display();
        System.out.println("");

        PersonalInfo personalInfoTwo = new PersonalInfo("小黑", "男", 30);
        WorkExperience workExperienceTwo = new WorkExperience("2015-2018", "AAA公司");
        ResumeDeep resumeDeep = new ResumeDeep("羽毛球", personalInfoTwo, workExperienceTwo);

        ResumeDeep resumeDeepCopy = resumeDeep.clone();
        resumeDeepCopy.setSkill("乒乓球");
        resumeDeepCopy.getPersonalInfo().setName("小美");
        resumeDeepCopy.getPersonalInfo().setSex("女");
        resumeDeepCopy.getPersonalInfo().setAge(27);
        resumeDeepCopy.getWorkExperience().setTimeArea("2016-2019");
        resumeDeepCopy.getWorkExperience().setCompany("BBB公司");

        System.out.println("深拷贝输出对比：");
        resumeDeep.Display();
        System.out.println("拷贝后：");
        resumeDeepCopy.Display();
    }
}
