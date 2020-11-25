package com.company;

enum TypeTeacher{professor, associate, assistant}

class Teacher extends Person {
    private TypeTeacher type;
    private int limit = 0;
    private int finallimit;
    private PersonList studentList;

    public Teacher(int id){
        super(id);
        studentList = new PersonList();
    }
    public Teacher(String name, int id) {
        super(name, id);
        studentList = new PersonList();
    }
    public Teacher(int id, int limit){
        super(id);
        studentList = new PersonList();
        this.limit = limit;
        this.finallimit = limit;
    }
    public Teacher(String name, int id, int limit) {
        super(name, id);
        studentList = new PersonList();
        this.limit = limit;
        this.finallimit = limit;
    }
    public TypeTeacher getType(){
        return type;
    }
    public void setType(TypeTeacher type) {
        this.type = type;
    }
    public void setLimit(int limit) {
        this.limit = limit;
        this.finallimit = limit;
    }
    public void Request(Student student){
        Student no = new Student("No student", 0);
        limit -= 1;
        if (limit >= 0)
            studentList.AddPerson(student);
        else
            studentList.AddPerson(no);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Teacher {" +
                "type = " + type +
                ", limit = " + finallimit +
                ", studentList" + studentList.getList() +
                "}}";
    }
}
