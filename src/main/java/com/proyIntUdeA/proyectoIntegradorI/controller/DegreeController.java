package com.proyIntUdeA.proyectoIntegradorI.controller;

import com.proyIntUdeA.proyectoIntegradorI.model.Degree;
import com.proyIntUdeA.proyectoIntegradorI.service.DegreeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class DegreeController {
    private DegreeService degreeService;

    public DegreeController(DegreeService degreeService) {
        this.degreeService = degreeService;
    }

    @PostMapping("/degree")
    public Degree saveDegree(@RequestBody Degree degree) {
        return degreeService.saveDegree(degree);
    }

    @GetMapping("/degree")
    public List<Degree> getAllDegrees() {
        return degreeService.getAllDegree();
    }

    @GetMapping("/degree/{id}")
    public ResponseEntity<Degree> getDegreeById(@PathVariable("id") long id) {
        Degree degree = null;
        degree = degreeService.getDegreeById(id);
        return ResponseEntity.ok(degree);
    }

    @DeleteMapping("degree/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteDegree(@PathVariable("id") long id) {
        boolean deleted = false;
        deleted = degreeService.deleteDegree(id);
        Map<String, Boolean> response= new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/degree/{id}")
    public ResponseEntity<Degree> updateDegree(@PathVariable("id") long id, @RequestBody Degree degree) {
        degree = degreeService.updateDegree(id, degree);
        return ResponseEntity.ok(degree);
    }
}
