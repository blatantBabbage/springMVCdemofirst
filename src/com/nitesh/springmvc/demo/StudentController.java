package com.nitesh.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        //create a new student object
        Student theStudent = new Student();

        //add student object as model attribute
        theModel.addAttribute("student",theStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // logging the data
        System.out.println("theStudent : " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
