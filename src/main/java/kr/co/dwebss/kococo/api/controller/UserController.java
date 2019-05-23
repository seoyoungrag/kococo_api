package kr.co.dwebss.kococo.api.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.dwebss.kococo.api.entities.User;
import kr.co.dwebss.kococo.api.entities.repository.UserRepository;

@RestController("/api")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
    @GetMapping(value = "/userappid")
    public ResponseEntity<User> getUserAppId() {
    	UUID id = UUID.randomUUID();
		int cnt = 0;
		while (cnt == 10) {
			cnt ++;
			if (userRepository.findById(String.valueOf(id)).isPresent()) {
				id = UUID.randomUUID();
			} else {
				User userForSave = new User(String.valueOf(id));
				userRepository.save(userForSave);
				return ResponseEntity.status(HttpStatus.OK).body(userForSave);
			}
		}
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

    }
}
