package kr.co.dwebss.kococo.api.common.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import kr.co.dwebss.kococo.api.entities.Analysis;
import kr.co.dwebss.kococo.api.entities.AnalysisDetails;
import kr.co.dwebss.kococo.api.entities.Code;
import kr.co.dwebss.kococo.api.entities.Record;
import kr.co.dwebss.kococo.api.entities.User;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Code.class);
        config.exposeIdsFor(User.class);
        config.exposeIdsFor(Record.class);
        config.exposeIdsFor(Analysis.class);
        config.exposeIdsFor(AnalysisDetails.class);
    }
    
}
