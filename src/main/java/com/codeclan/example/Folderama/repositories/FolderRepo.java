package com.codeclan.example.Folderama.repositories;

import com.codeclan.example.Folderama.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Long> {
}


