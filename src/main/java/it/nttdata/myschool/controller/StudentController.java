package it.nttdata.myschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.nttdata.myschool.repository.StudentRepository;

@Controller
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("title", "Alunni dell'istituto");

        return "students";
    }
    
}