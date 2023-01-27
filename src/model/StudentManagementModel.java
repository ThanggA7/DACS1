package model;
import view.StudentView;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static config.DataBase.getConnection;

public class StudentManagementModel {
    public static List<StudentModel> findAll() {
        List<StudentModel> studentList = new ArrayList<>();
        String query = "select * from student";
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                StudentModel studentModels = new StudentModel(resultSet.getString("StudentID"), resultSet.getString("FullName"), resultSet.getInt("age"), resultSet.getString("Andress"),
                        resultSet.getString("School"), resultSet.getString("PhoneNumber"), resultSet.getString("money"));
                studentList.add(studentModels);
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return studentList;
    }

    public static void insert(StudentModel studentModel) {
        String query = "insert into student(StudentID,FullName,age,Andress,School,PhoneNumber,money) values(?,?,?,?,?,?,?)";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, studentModel.getStudentID());
            preparedStatement.setString(2, studentModel.getFullName());
            preparedStatement.setInt(3, studentModel.getAge());
            preparedStatement.setString(4, studentModel.getAndress());
            preparedStatement.setString(5, studentModel.getSchool());
            preparedStatement.setString(6, studentModel.getPhoneNumber());
            preparedStatement.setString(7, studentModel.getMoney());
        } catch (Exception e) {
            System.out.println("Error!");
        }


    }
    public static void delete(StudentModel studentModel){
        String query = "delete from student where name='"+studentModel.getFullName()+"'";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println("Error!");
        }
    }



}
