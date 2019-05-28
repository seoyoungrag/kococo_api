package kr.co.dwebss.kococo.api.entities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import kr.co.dwebss.kococo.api.entities.Record;

@RepositoryRestResource(collectionResourceRel = "record", path = "record")
public interface RecordRepository extends JpaRepository<Record,Integer>{
    List findByUserAppId(@Param("userAppId") String userAppId);
}
