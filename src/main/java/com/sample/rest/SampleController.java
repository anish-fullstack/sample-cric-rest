package com.sample.rest;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {

	@GetMapping(value = "/players/{pid}")
	public ResponseEntity<DTO> createUser(@PathVariable String pid) {
		String url = "https://cricapi.com/api/playerStats?apikey=cJqU9Vqj3vbwM11mvlrV1vNwl5k2&pid=" + pid;
		String json = new RestTemplate().getForEntity(url, String.class).getBody();
		JSONObject obj = new JSONObject(json);
		DTO dto = createCustomData(obj);
		return ResponseEntity.ok(dto);
	}

	private DTO createCustomData(JSONObject object) {
		DTO dto = new DTO();
		dto.setProfile(object.getString("profile"));
		dto.setImageURL(object.getString("imageURL"));
		dto.setBattingStyle(object.getString("battingStyle"));
		dto.setBowlingStyle(object.getString("bowlingStyle"));
		dto.setMajorTeams(object.getString("majorTeams"));
		return dto;
	}

}
