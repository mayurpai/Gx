package com.galaxemovietheater.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxemovietheater.entity.Viewer;
import com.galaxemovietheater.exception.ExceptionTry;
import com.galaxemovietheater.repository.ViewerRepository;

@Service
public class ViewerServiceImpl implements ViewerService {

	@Autowired
	ViewerRepository viewerRepository;

	public ViewerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Viewer> getViewer() {
		return (List<Viewer>) viewerRepository.findAll();
	}

	@Override
	public String saveViewer(Viewer viewer) {
		if (firstNameValidator(viewer)) {
			return "Please enter a valid first name";
//			return throw new ExceptionTry();
		} else if (lastNameValidator(viewer)) {
			return "Please enter a valid last name";
		} else if (genderValidator(viewer)) {
			return "";
		} else if (birthdayValidator(viewer)) {
			return "";
		} else if (homePhoneValidator(viewer)) {
			return "Homephone must contain more than 8 numbers";
		} else if (mobilePhoneValidator(viewer)) {
			return "Homephone must contain exactly 10 numbers";
		} else if (usernameValidator(viewer)) {
			return "Username must contain uppercase or lowercase or numerical characters";
		} else if (emailAddressValidator(viewer)) {
			return "Email Address must contain a single @";
		} else if (newPasswordValidator(viewer)) {
			return "Password must contain uppercase, lowercase, numerical and special characters about 8-20 in length";
		} else if (confirmPasswordValidator(viewer)) {
			return "Password must contain uppercase, lowercase, numerical and special characters about 8-20 in length";
		} else if (matchingPasswordValidator(viewer)) {
			return "Please check the passwords you've typed";
		}
		viewerRepository.save(viewer);
		return "Success";
	}

//	public String updateViewerPassword(Viewer viewer) {
//		viewerRepository.save(viewer);
//		return "Password Successfully Updated!";
//
//	}

	private static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count = count + 1;
		}
		return count;
	}

	private static boolean firstNameValidator(Viewer viewer) {
		return ((viewer.getFirstName() == "") || (!viewer.getFirstName().matches("^[a-zA-Z]*$")));
	}

	private static boolean lastNameValidator(Viewer viewer) {
		return ((viewer.getLastName() == "") || (!viewer.getLastName().matches("^[a-zA-Z]*$")));
	}

	private static boolean birthdayValidator(Viewer viewer) {
		return false;
	}

	private static boolean genderValidator(Viewer viewer) {
		return false;
	}

	private static boolean homePhoneValidator(Viewer viewer) {
		return (!(countDigit(viewer.getHomePhone()) >= 8));
	}

	private static boolean mobilePhoneValidator(Viewer viewer) {
		return ((countDigit(viewer.getMobilePhone()) != 10));
	}

	private static boolean usernameValidator(Viewer viewer) {
		return ((viewer.getUsername() == "") || (!viewer.getUsername().matches("^[a-zA-Z0-9]*$")));
	}

	private static boolean emailAddressValidator(Viewer viewer) {
		return ((viewer.getEmailAddress() == "")
				|| (!viewer.getEmailAddress().matches("^[A-Za-z0-9_!#$%&'*+\\/=?`{|}~^.-]+@[A-Za-z0-9.-]+$")));
	}

	private static boolean newPasswordValidator(Viewer viewer) {
		return ((viewer.getNewPassword() == "") || (!viewer.getNewPassword()
				.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")));
	}

	private static boolean confirmPasswordValidator(Viewer viewer) {
		return ((viewer.getConfirmPassword() == "") || (!viewer.getConfirmPassword()
				.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")));
	}

	private static boolean matchingPasswordValidator(Viewer viewer) {
		return (!(viewer.getNewPassword().equals(viewer.getConfirmPassword())));
	}

	@Override
	public Viewer getViewer(int viewerId) {
		Optional<Viewer> viewer = viewerRepository.findById(viewerId);
		return viewer.get();
	}

	@Override
	public String editViewer(Viewer viewer) {
		if (newPasswordValidator(viewer)) {
			return "Password must contain uppercase, lowercase, numerical and special characters about 8-20 in length";
		} else if (confirmPasswordValidator(viewer)) {
			return "Password must contain uppercase, lowercase, numerical and special characters about 8-20 in length";
		} else if (matchingPasswordValidator(viewer)) {
			return "Please check the passwords you've typed";
		}
		viewerRepository.save(viewer);
		return "Password reset successful!";
	}

	@Override
	public String deleteViewer(int viewerId) {
		viewerRepository.deleteById(viewerId);
		String message = "Deleted";
		return message;
	}

	@Override
	public boolean isViewerExists(int viewerId) {
		Optional<Viewer> viewer = viewerRepository.findById(viewerId);
		return viewer.isPresent();
	}

	@Override
	public String deleteViewer() {
		viewerRepository.deleteAll();
		String message = "Deleted";
		return message;
	}

	@Override
	public List<Viewer> loginPageCheck(String username, String confirmPassword) {
		return viewerRepository.findByUsernameAndConfirmPassword(username, confirmPassword);
	}

//	@Override
//	public Viewer forgotPasswordPageCheck(String newPassword, String confirmPassword) {
//		return viewerRepository.findByNewPasswordAndConfirmPassword(newPassword, confirmPassword);
//	}

	@Override
	public boolean isViewerExists(String viewerUsername) {
		Optional<Viewer> viewer = viewerRepository.findByUsername(viewerUsername);
		return viewer.isPresent();
	}

//	@Override
//	public boolean isUsernameExists(String username) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
