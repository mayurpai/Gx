package com.training.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @GetMapping("/message/{empName}") // localhost:9090/message/Mayur
    public String getEmployeeMessageName(@PathVariable("empName") String eName) {
        return "Hi " + eName + "!";
    }

    @GetMapping("/message/{numberOne}/and/{numberTwo}") // localhost:9090/message/12/and/14
    public String getEmployeeSum(@PathVariable("numberOne") Integer numberOne,
            @PathVariable("numberTwo") Integer numberTwo) {
        return "Sum: " + (numberOne + numberTwo);
    }

    @GetMapping("/message/{eName}/{place}") // localhost:9090/message/Mayur/Bangalore
    public String getEmployeeSum(@PathVariable("eName") String eName,
            @PathVariable("place") String place) {
        return eName + " You Are Based Out Of " + place;
    }

    // You Can Have "/message" Everywhere But With Different Annotations

    @GetMapping("/message") // localhost:9090/message
    public String getEmployeeMessage(@RequestBody Employee employee) {
        return "Hi " + employee.getEmployeeName() + "! Your Record: " + employee;
    }

    @PostMapping("/message") // localhost:9090/employee/message
    // @RequestBody Is Used To Pass Object As A Parameter (JSON)
    // It Won't Work Unless JSON Is Returned
    public String postEmployeeMessage(@RequestBody Employee employee) {
        return "Hi " + employee.getEmployeeName() + ", Your Records Have Been Successfully Created!";
    }

    @PutMapping("/message") // localhost:9090/message
    public String putEmployeeMessage() {
        return "Hi Employee! - PUT";
    }

    @DeleteMapping("/message") // localhost:9090/message
    public String delEmployeeMessage() {
        return "Hi Employee! - DELETE";
    }

}
