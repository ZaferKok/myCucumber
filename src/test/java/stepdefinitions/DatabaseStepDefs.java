package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;

public class DatabaseStepDefs {

    String url = ConfigReader.getProperty("db_url");
    String username = ConfigReader.getProperty("db_username");
    String password = ConfigReader.getProperty("db_password");

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("user connects to the database")
    public void userConnectsToTheDatabase() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    @When("user connects to the student table")
    public void userConnectsToTheStudentTable() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM students");
    }

    @Then("print the total row count and verify")
    public void printTheTotalRowCountAndVerify() throws SQLException {

        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        System.out.println("Total row count: " + rowCount);
        Assert.assertEquals(rowCount, 5);

    }

    @Then("print first student name and verify")
    public void printFirstStudentNameAndVerify() throws SQLException {

        resultSet.first();
        String studentName = resultSet.getString("student_name");

        System.out.println("Actual studentName = " + studentName);
        Assert.assertEquals(studentName, "ahmet");

    }

    @Then("print last student name and verify")
    public void printLastStudentNameAndVerify() throws SQLException {

        resultSet.last();
        int studentAge = resultSet.getInt("student_age");

        System.out.println("studentAge = " + studentAge);
        Assert.assertEquals(studentAge, 12);
    }

    @Then("print spesific student name and verify")
    public void printSpesificStudentNameAndVerify() throws SQLException {

        resultSet.absolute(2);
        String studentName = resultSet.getString("student_name");

        System.out.println("Actual specific studentName = " + studentName);
        Assert.assertTrue(studentName.equals("sedat"));

    }
}
