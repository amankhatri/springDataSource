package Restful;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;  
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;  

@Path("/product")  
public class HelloService{  
	
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
    @POST  
    @Path("/add")  
    public Response addUser(  
        @FormParam("id") int id,  
        @FormParam("name") String name,  
        @FormParam("price") float price) {  
   
        return Response.status(200)  
            .entity(" Product added successfuly!<br> Id: "+id+"<br> Name: " + name+"<br> Price: "+price)  
            .build();  
    }  
    
    private static final String FILE_PATH = "D:\\bangalorecoach.jpg";  
    @GET  
    @Path("/txt")  
    @Produces("text/plain")  
    public Response getFile() {  
        File file = new File(FILE_PATH);  
   
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"bangalorecoach.jpg\"");  
        return response.build();  
   
    }  
    
    	@POST
    	@Path("/upload")
    	@Consumes(MediaType.MULTIPART_FORM_DATA)
    	public Response uploadFile(
    			@FormDataParam("file") InputStream uploadedInputStream,
    			@FormDataParam("file") FormDataContentDisposition fileDetail) {

    		String uploadedFileLocation = "d://uploaded/"
    				+ fileDetail.getFileName();

    		// save it
    		writeToFile(uploadedInputStream, uploadedFileLocation);

    		String output = "File uploaded to : " + uploadedFileLocation;

    		return Response.status(200).entity(output).build();

    	}

    	// save uploaded file to new location
    	private void writeToFile(InputStream uploadedInputStream,
    			String uploadedFileLocation) {

    		try {
    			OutputStream out = new FileOutputStream(new File(
    					uploadedFileLocation));
    			int read = 0;
    			byte[] bytes = new byte[1024];

    			out = new FileOutputStream(new File(uploadedFileLocation));
    			while ((read = uploadedInputStream.read(bytes)) != -1) {
    				out.write(bytes, 0, read);
    			}
    			out.flush();
    			out.close();
    		} catch (IOException e) {

    			e.printStackTrace();
    		}

    	}
    
 }  
