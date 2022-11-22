package com.example.warmbloodpj.Repository;

import com.example.warmbloodpj.Model.Projects;
import com.example.warmbloodpj.Model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>
{


}
