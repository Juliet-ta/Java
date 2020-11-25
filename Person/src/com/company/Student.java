package com.company;

enum TypeStudent {bachelor, master}

class Student extends Person {
    private TypeStudent type;
    private CourseWork CourseWork;

    public Student(int id) {
        super(id);
        this.type = TypeStudent.bachelor;
    }

    public Student(String name, int id) {
        super(name, id);
    }

    public TypeStudent getType() {
        return type;
    }

    public void setCourseWork(String name, String description) {
        this.CourseWork = new CourseWork(name, description);
    }

    public void setType(TypeStudent type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return  super.toString() +
                ", Student {" +
                "type = " + type +
                ", " + CourseWork.toString() +
                "}}";
    }
}
