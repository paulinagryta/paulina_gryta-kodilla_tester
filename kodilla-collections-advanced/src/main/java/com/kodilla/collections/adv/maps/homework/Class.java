package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Class {

    private String className;
    private int numberOfStudents;


    public Class(String className, int numberOfStudents){
            this.className = className;
            this.numberOfStudents = numberOfStudents;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }
        public  String getClassName() {
            return className;
        }


        @Override
        public String toString () {
            return "Classes{" +
                    "className='" + className + '\'' +
                    ", numberOfStudents=" + numberOfStudents +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class)) return false;
        Class aClass = (Class) o;
        return Double.compare(aClass.getNumberOfStudents(), getNumberOfStudents()) == 0 && Objects.equals(getClassName(), aClass.getClassName());
    }



        @Override
        public int hashCode () {
            return Objects.hash(className, numberOfStudents);
        }
    }
