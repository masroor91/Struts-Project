package controller;

import java.io.File;

import javax.activation.MimeType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DownloadAction;

public class FileDownloadController extends DownloadAction {

	@Override
	protected StreamInfo getStreamInfo(ActionMapping am, ActionForm af, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		
		String filename=req.getParameter("filename");
		StreamInfo info= null;
		if (filename.contains("strutsbook")) {
			File book= new File("D:/New folder/Wiley.Java.In.60.Minutes.A.Day.May.2003.ISBN.0471423149.pdf");
			info= new FileStreamInfo("application/pdf", book);
			resp.setContentType("application/pdf");
			resp.setHeader("Content-Disposition", "attachment;filename=javabook.pdf"); //when application downloads the file then file name is given javabook.pdf as name
		}
		if (filename.contains("pkmovie")) {
			File book= new File("D:/New folder/Wildlife.wmv");
			info= new FileStreamInfo("application/wmv", book);
			resp.setContentType("application/wmv");
			resp.setHeader("Content-Disposition", "attachment;filename=pkmovie.wmv");
			
		}
		if (filename.contains("myimage")) {
			File book= new File("D:/New folder/Paytm_statement-May-2016.jpg");
			info= new FileStreamInfo("application/jpeg", book);
			resp.setContentType("application/jpeg");
			resp.setHeader("Content-Disposition", "attachment;filename=paytm.jpg"); 
	
		}
		
		return info;
	}

}
