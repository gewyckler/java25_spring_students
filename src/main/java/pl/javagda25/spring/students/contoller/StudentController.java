package pl.javagda25.spring.students.contoller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.javagda25.spring.students.model.Student;
import pl.javagda25.spring.students.service.StudentService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/student/")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/add")
    public String add() {
        return "student-add";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("students", studentList);

        return "student-list";
    }
}
