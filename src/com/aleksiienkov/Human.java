package com.aleksiienkov;

public class Human {
    private String name;
    private String surname;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Human(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return ""  +getName()+" "+getSurname()+" "+getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if(!(obj instanceof Human)) return false;
        Human human=(Human)obj;
        return human.name==name && human.surname==surname && human.age==age;


    }
}
