package com.example.warmbloodpj.Controller;


import com.example.warmbloodpj.Dto.CategoryRequestDto;
import com.example.warmbloodpj.Dto.ProjectRequestDto;
import com.example.warmbloodpj.Dto.ResponseDto;
import com.example.warmbloodpj.Service.ProjectsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectsService projectsService;

    @GetMapping("/projects")
    public ResponseDto<?> getAllProject()
    {

        return projectsService.getAllprojects();
    }

    @PostMapping("/projects")
    public ResponseDto<?> addProject(@RequestBody ProjectRequestDto projectRequestDto)
    {

        return projectsService.addProjects(projectRequestDto);
    }

    @PutMapping("/projects/{projectId}")
    public ResponseDto<?> updateProject(@PathVariable Long projectId,@RequestBody ProjectRequestDto projectRequestDto)
    {
        return projectsService.updateProject(projectId,projectRequestDto);
    }

    @GetMapping("/categories")
    public ResponseDto<?> getFromCategory(@RequestBody CategoryRequestDto categoryRequestDto)
    {
        return projectsService.getFromCategory(categoryRequestDto);
    }


}
