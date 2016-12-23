package com.School.hibernate.bean;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by root on 16-12-14.
 */
public class Grade implements Serializable {
    private Long gid;

    private String gradeDesc;

    private int gradeId;

    private Set<Clazz> classes;

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getGradeDesc() {
        return gradeDesc;
    }

    public void setGradeDesc(String gradeDesc) {
        this.gradeDesc = gradeDesc;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public Set<Clazz> getClasses() {
        return classes;
    }

    public void setClasses(Set<Clazz> classes) {
        this.classes = classes;
    }
}
