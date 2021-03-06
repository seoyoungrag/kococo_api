package kr.co.dwebss.kococo.api.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import kr.co.dwebss.kococo.api.entities.Analysis;

@RepositoryRestResource(collectionResourceRel = "analysisDetails", path = "analysisDetails", exported = false)
public interface AnalysisDetailRepository extends JpaRepository<Analysis,Integer>{
}
