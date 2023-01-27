package model;

public class StudentModel {
    private String StudentID;
    private String FullName;
    private int age;
    private String Andress;
    private String School;
    private String PhoneNumber;
    private String Money;



    public StudentModel(){

    }

    public StudentModel(String studentID, String fullName, int age, String andress, String school, String phoneNumber, String money) {
        this.StudentID = studentID;
        this.FullName = fullName;
        this.age = age;
        this.Andress = andress;
        this.School = school;
        this.PhoneNumber = phoneNumber;
        this.Money = money;
    }


    public String getStudentID(){
        return this.StudentID;
    }

    public String getFullName() {
        return this.FullName;
    }

    public int getAge(){
        return this.age;
    }
    public String getAndress(){
        return this.Andress;
    }
    public String getSchool(){
        return this.School;
    }
    public String getPhoneNumber(){
        return this.PhoneNumber;
    }
    public String getMoney() {
        return this.Money;
    }

    public void setStudentID(String studentid){
        this.StudentID = studentid;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAndress(String andress) {
        this.Andress = andress;
    }

    public void setSchool(String school) {
        this.School = school;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public void setMoney(String money) {
        this.Money = money;
    }
}
