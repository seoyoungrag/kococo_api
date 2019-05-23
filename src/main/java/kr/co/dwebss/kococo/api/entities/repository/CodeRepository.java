package kr.co.dwebss.kococo.api.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import kr.co.dwebss.kococo.api.entities.Code;

@RepositoryRestResource(collectionResourceRel = "code", path = "code")
public interface CodeRepository extends JpaRepository<Code,Integer>{
}
