package com.proyIntUdeA.proyectoIntegradorI.controller;
import com.proyIntUdeA.proyectoIntegradorI.model.Subject;
import com.proyIntUdeA.proyectoIntegradorI.service.SubjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {
    private SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/")
    public Subject saveSubject(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }

    @GetMapping("/")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubject();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable("id") long id) {
        Subject subject = null;
        subject = subjectService.getSubjectById(id);
        return ResponseEntity.ok(subject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteSubject(@PathVariable("id") long id) {
        boolean deleted = false;
        deleted = subjectService.deleteSubject(id);
        Map<String, Boolean> response= new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subject> updateSubject(@PathVariable("id") long id, @RequestBody Subject subject) {
        subject = subjectService.updateSubject(id, subject);
        return ResponseEntity.ok(subject);
    }
}
