package model;

public class Parent {
    private int age;
    private boolean gender;

    public Parent(int age, boolean gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
