package com.example.Monolithic.controller;



import com.example.Monolithic.request.CreateStudentRequest;
import com.example.Monolithic.response.CreateStudentResponse;
import com.example.Monolithic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public CreateStudentResponse createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
        return studentService.createStudent(createStudentRequest);
    }

    @GetMapping("getById/{id}")
    public CreateStudentResponse getById (@PathVariable long id) {
        return studentService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public long deleteById (@PathVariable long id) {
        return studentService.deleteById(id);
    }

}
