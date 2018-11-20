package xyz.vaith.bean;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String phone;
    private Date birthday;
    private String hobby;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Student() {
    }

    public Student(int id, String name, String gender, String phone, Date birthday, String hobby, String desc) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.birthday = birthday;
        this.hobby = hobby;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", hobby='" + hobby + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
