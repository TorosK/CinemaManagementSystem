package com.Cinema.CinemaManagerSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {  // Toros

    @Autowired
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // for reference:
    // int employeeID, String employeeName, String employeeTel, String employeeEmail

    // methods:
    // insertNewEmployee
    // deleteEmployeeByID
    // downloadOneEmployeeByName
    // downloadOneEmployeeByID

    @GetMapping("/insertNewEmployee")
    public void insertNewEmployee(@RequestParam(value = "employee_ID", defaultValue = "-1") int employeeID, @RequestParam(value = "employee_name", defaultValue = "noEmployeeName") String employeeName, @RequestParam(value = "employee_tel", defaultValue = "noEmployeeTel") String employeeTel, @RequestParam(value = "employee_email", defaultValue = "noEmployeeEmail") String employeeEmail) {
        employeeService.insertNewEmployee(employeeID, employeeName, employeeTel, employeeEmail);
    }

    @GetMapping("/deleteEmployeeByID")
    public void deleteEmployeeByID(@RequestParam(value = "employee_ID", defaultValue = "-1") int employeeID) {
        employeeService.deleteEmployeeByID(employeeID);
    }

    @GetMapping("/downloadOneEmployeeByName")
    public String downloadOneEmployeeByName(@RequestParam(value = "employee_ID", defaultValue = "-1") int employeeID, @RequestParam(value = "employee_name", defaultValue = "noEmployeeName") String employeeName, @RequestParam(value = "employee_tel", defaultValue = "noEmployeeTel") String employeeTel, @RequestParam(value = "employee_email", defaultValue = "noEmployeeEmail") String employeeEmail) {
        return employeeService.downloadOneEmployeeByName(employeeName);
    }

    @GetMapping("/downloadOneEmployeeByID")
    public String downloadOneEmployeeByID(@RequestParam(value = "employee_ID", defaultValue = "-1") int employeeID, @RequestParam(value = "employee_name", defaultValue = "noEmployeeName") String employeeName, @RequestParam(value = "employee_tel", defaultValue = "noEmployeeTel") String employeeTel, @RequestParam(value = "employee_email", defaultValue = "noEmployeeEmail") String employeeEmail) {
        return employeeService.downloadOneEmployeeByID(employeeID);
    }





























}
