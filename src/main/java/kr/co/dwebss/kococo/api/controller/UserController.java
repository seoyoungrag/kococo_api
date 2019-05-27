package kr.co.dwebss.kococo.api.controller;
/*
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
*/
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dwebss.kococo.api.entities.User;
import kr.co.dwebss.kococo.api.entities.repository.UserRepository;

@RestController
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class UserController implements ResourceProcessor<RepositoryLinksResource> {

	@Autowired
	UserRepository userRepository;
	
    private RepositoryEntityLinks entityLinks;
    
    public UserController(RepositoryEntityLinks entityLinks) {
        this.entityLinks = entityLinks;
    }
	
    @RequestMapping(value="/api/userappid", method=RequestMethod.POST, produces = { "application/hal+json" })
    public Resource<User> getUserAppId() {
    	UUID id = UUID.randomUUID();
		int cnt = 0;
		while (cnt < 10) {
			cnt ++;
			if (userRepository.findById(String.valueOf(id)).isPresent()) {
				id = UUID.randomUUID();
			} else {
				User user = userRepository.save(new User(String.valueOf(id)));

				Link selfLink = entityLinks.linkToSingleResource(User.class, String.valueOf(id));
				
	            user.add(selfLink);
		        Resource<User> resource = new Resource<User>(user);

				return resource;
			}
		}
        return null;

    }

	@Override
	public RepositoryLinksResource process(RepositoryLinksResource resource) {
	    resource.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(UserController.class).getUserAppId()).withRel("userappid"));
	    return resource;
	    }
}
