package com.galaxemovietheater.service;

import java.util.List;

import com.galaxemovietheater.entity.Viewer;

public interface ViewerService {
	public List<Viewer> getViewer();

	public String deleteViewer();

	public String saveViewer(Viewer viewer);

	public Viewer getViewer(int viewerId);

	public String editViewer(Viewer viewer);

	public String deleteViewer(int viewerId);

	public boolean isViewerExists(int viewerId);

	public boolean isViewerExists(String viewerUsername);

	public List<Viewer> loginPageCheck(String username, String confirmPassword);

//	public boolean isUsernameExists(String username);

//	public Viewer forgotPasswordPageCheck(String newPassword, String confirmPassword);

//	public String updateViewerPassword(Viewer viewer);

}
