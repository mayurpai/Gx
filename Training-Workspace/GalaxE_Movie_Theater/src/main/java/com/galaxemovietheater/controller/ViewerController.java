package com.galaxemovietheater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxemovietheater.entity.Viewer;
import com.galaxemovietheater.service.ViewerService;

@RestController
@RequestMapping("/viewer")
@CrossOrigin(origins = "*")
public class ViewerController {

	@Autowired
	Viewer viewer;

	@Autowired
	ViewerService viewerService;

	public ViewerController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping()
	public ResponseEntity<List<Viewer>> GET() {
		List<Viewer> viewer = viewerService.getViewer();
		ResponseEntity<List<Viewer>> responseEntity;
		if (viewer.isEmpty()) {
			responseEntity = new ResponseEntity<List<Viewer>>(viewer, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Viewer>>(viewer, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("{viewerId}")
	public ResponseEntity<Viewer> GET(@PathVariable("viewerId") Integer viewerId) {
		ResponseEntity<Viewer> responseEntity;
		if (viewerService.isViewerExists(viewerId)) {
			viewer = viewerService.getViewer(viewerId);
			responseEntity = new ResponseEntity<Viewer>(viewer, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Viewer>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@DeleteMapping("{viewerId}")
	public ResponseEntity<String> DELETE(@PathVariable("viewerId") Integer viewerId) {
		ResponseEntity<String> responseEntity;
		if (viewerService.isViewerExists(viewerId)) {
			String message = viewerService.deleteViewer(viewerId);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {
			String errorMessage = "No Such Viewer ID Exists";
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@DeleteMapping
	public ResponseEntity<String> DELETE() {
		ResponseEntity<String> responseEntity;
		String message = viewerService.deleteViewer();
		responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		return responseEntity;
	}

	@PostMapping()
	public ResponseEntity<String> POST(@RequestBody Viewer viewer) {
		ResponseEntity<String> responseEntity;
		int vId = viewer.getId();
		if (viewerService.isViewerExists(vId)) {
			responseEntity = new ResponseEntity<String>("Viewer With Viewer ID: " + vId + " Already Exists",
					HttpStatus.CONFLICT);
		} else {
			String message = viewerService.saveViewer(viewer);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PutMapping()
	public ResponseEntity<String> PUT(@RequestBody Viewer viewer) {
		ResponseEntity<String> responseEntity;
		int vId = viewer.getId();
		if (!viewerService.isViewerExists(vId)) {
			responseEntity = new ResponseEntity<String>("Viewer With Viewer ID: " + vId + " Doesn't Exist",
					HttpStatus.NOT_FOUND);
		} else {
			String message = viewerService.saveViewer(viewer);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("loginCheck/{username}And{password}")
	public ResponseEntity<List<Viewer>> getLoginCredentials(@PathVariable("username") String username,
			@PathVariable("password") String password) {

		ResponseEntity<List<Viewer>> responseEntity;
		List<Viewer> viewer = viewerService.loginPageCheck(username, password);
		if (viewer.isEmpty()) {
			responseEntity = new ResponseEntity<List<Viewer>>(viewer, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Viewer>>(viewer, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PutMapping("forgotPasswordCheck/{username}And{newPassword}And{confirmPassword}")
	public ResponseEntity<String> getLoginCredentialsForgotPassword(@PathVariable("username") String username,
			@PathVariable("newPassword") String newPassword, @PathVariable("confirmPassword") String confirmPassword) {

		ResponseEntity<String> responseEntity;
		Viewer viewer = fetchViewer(username, newPassword, confirmPassword);
//		System.out.println(viewer);
		if (!viewerService.isViewerExists(username) || viewer == null) {
			responseEntity = new ResponseEntity<String>("Viewer With Viewer ID: " + username + " Doesn't Exist",
					HttpStatus.NO_CONTENT);
		} else {
			String message = viewerService.editViewer(viewer);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;

	}

	public Viewer fetchViewer(String username, String newPassword, String confirmPassword) {
		List<Viewer> viewers = viewerService.getViewer();

		for (int i = 0; i < viewers.size(); i++) {
			if (viewers.get(i).getUsername().equals(username)) {
//				System.out.println(viewers.get(i));
				Viewer viewer = viewers.get(i);
				viewer.setConfirmPassword(confirmPassword);
				viewer.setNewPassword(newPassword);
				return viewer;
			}
		}
		return null;
	}

//	@PutMapping("loginCheck/{username}And{newPassword}And{confirmPassword}")
//	public ResponseEntity<List<Viewer>> getLoginCredentialsForgo(@PathVariable("username") String username,
//			@PathVariable("password") String password) {
//
//		ResponseEntity<List<Viewer>> responseEntity;
//		List<Viewer> viewer = viewerService.loginPageCheck(username, password);
//		if (viewer.isEmpty()) {
//			responseEntity = new ResponseEntity<List<Viewer>>(viewer, HttpStatus.NO_CONTENT);
//		} else {
//			responseEntity = new ResponseEntity<List<Viewer>>(viewer, HttpStatus.OK);
//		}
//		return responseEntity;
//	}

}
