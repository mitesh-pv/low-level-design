package org.example;

import java.util.Arrays;
import org.example.publisher.NotificationPublisher;
import org.example.subscribers.CEO;
import org.example.subscribers.Department;
import org.example.subscribers.Employee;
import org.example.subscribers.Team;

/**
 *
 * Design a notification system for facebook like application for an organization. Restrictions on
 * who would receive the notifications based on designation of employee.
 * <br><br>
 * For example, all users will receive notifications to a post made by the CEO,
 * a post/comment made by an individual contributor sends notification to his team / department only.
 * Extension - how would you handle the case when an employee goes on sabbatical and opts out of notifications?
 */

public class Main {

  public static void main(String[] args) {
    CEO ceo = new CEO();

    Department department1 = new Department("Department 1", ceo);
    Department department2 = new Department("Department 2", ceo);

    Team team1 = new Team("Team 1", department1);
    Team team2 = new Team("Team 2", department2);

    Employee employee1 = new Employee(team1, "Employee 1");
    Employee employee2 = new Employee(team2, "Employee 2");

    // All the Teams, departments
    ceo.sendNotification("This is a message from the CEO");
    System.out.println();

    employee1.setOptOut(true);
    employee1.sendNotification("This is a message from employee 1");
    System.out.println();

    department1.sendNotification("This is a message from department 1");
  }
}