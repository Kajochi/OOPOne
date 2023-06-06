package model;

import java.util.Objects;

public class Students{
    private int iD;
    private String name;


    public Students(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public Students() {

    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return getiD() == students.getiD() && Objects.equals(getName(), students.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getiD(), getName());
    }

    @Override
    public String toString() {
        return "Students{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                '}';
    }
}