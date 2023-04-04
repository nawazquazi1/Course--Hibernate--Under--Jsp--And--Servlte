package org.studyeasy;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.studyeasy.hibernate.DAO.FilesDAO;
import org.studyeasy.hibernate.entity.Files;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/Upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String path = "c:/images/";

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
//
//		try {
//			List<FileItem> images = upload.parseRequest((HttpServletRequest) request);
//			for (FileItem image : images) {
//				String name = image.getName();
//				try {
//					name = name.substring(name.lastIndexOf("\\") + 1);
//				} catch (Exception e) {
//				}
//				System.out.println(name);
//				new FilesDAO().addFileDetails(new Files(name));
//				image.write(new File(path + name));
//			}
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

}
