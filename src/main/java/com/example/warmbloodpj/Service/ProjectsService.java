package com.example.warmbloodpj.Service;


import com.example.warmbloodpj.Dto.CategoryRequestDto;
import com.example.warmbloodpj.Dto.ProjectRequestDto;
import com.example.warmbloodpj.Dto.ProjectResponseDto;
import com.example.warmbloodpj.Dto.ResponseDto;
import com.example.warmbloodpj.Model.ErrorCode;
import com.example.warmbloodpj.Model.Projects;
import com.example.warmbloodpj.Model.Tag;
import com.example.warmbloodpj.Repository.ProjectsRepository;
import com.example.warmbloodpj.Repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectsService {

    private final ProjectsRepository projectsRepository;
    private final TagRepository tagRepository;

    public ResponseDto<?> getAllprojects()
    {
        List<Projects> projectlist = projectsRepository.findAll();
        List<ProjectResponseDto> projectResponseDtos=new ArrayList<>();

        for(Projects projects:projectlist)
        {
            List<Tag> tagList=projects.getTags();
            List<String> tagName=new ArrayList<>();

            for(Tag tags:tagList)
            {
                tagName.add(tags.getTagName());
            }

            projectResponseDtos.add(ProjectResponseDto.builder()
                            .id(projects.getId())
                            .name(projects.getName())
                            .dealClosingDate(projects.getDealClosingDate())
                            .dueDate(projects.getDueDate())
                            .price(projects.getPrice())
                            .location(projects.getLocation())
                            .tags(tagName)
                            .build());
        }

        return ResponseDto.is_Success(projectResponseDtos);
    }

    @Transactional
    public ResponseDto<?> addProjects(ProjectRequestDto projectRequestDto)
    {
        if(projectRequestDto.getName().length()>100)
        {
            return ResponseDto.is_Fail(ErrorCode.INVALID_LENGTH);
        }

        Projects projects=new Projects(projectRequestDto);
        for(int i=0;i<projectRequestDto.getTags().size();i++)
        {
            Tag tag=Tag.builder().
                    tagName(projectRequestDto.getTags().get(i)).
                    projects(projects).
                    build();
            tagRepository.save(tag);
        }
        projectsRepository.save(projects);

        return ResponseDto.is_Success("Saved");
    }

    @Transactional
    public ResponseDto<?> updateProject(Long projectId,ProjectRequestDto projectRequestDto)
    {
        Optional<Projects> optionalProjects=projectsRepository.findById(projectId);
        Projects projects=optionalProjects.get();

        projects.update(projectRequestDto);

        return ResponseDto.is_Success("Update complete");
    }

    public ResponseDto<?> getFromCategory(CategoryRequestDto categoryRequestDto){
        List<Projects> projectsList1;
        List<ProjectResponseDto> responseDtos =new ArrayList<>();

        /*if(categoryRequestDto.getDealCate().equals(null))
        {
            projectsList1=projectsRepository.findAll();
        }
        else {

            for(Projects projects1:projectsList1)
            {


            }
        }*/
        //딜 카테고리?? 금융 유형??



        return ResponseDto.is_Success(responseDtos);
    }

}
