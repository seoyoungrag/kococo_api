package kr.co.dwebss.kococo.api.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import kr.co.dwebss.kococo.api.entities.Record;

@RepositoryRestResource(collectionResourceRel = "record", path = "record")
public interface RecordRepository extends JpaRepository<Record,Integer>{
}
