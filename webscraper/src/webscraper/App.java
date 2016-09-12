package webscraper;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Connection.Response loginForm = Jsoup.connect("https://www.quora.com/?unh=d6b07378700dbc75b54ff2beda663ad4&uid=19389719&time=1461608321057075")
	            .method(Connection.Method.POST)
	            .execute();

	    Document document = Jsoup.connect("https://www.quora.com/?unh=d6b07378700dbc75b54ff2beda663ad4&uid=19389719&time=1461608321057075")
	            .data("cookieexists", "true")
	            .data("email", "awantikdas@gmail.com")
	            .data("password", "abhijit421")
	            .data("__w2_HfsDnmi_submit", "Login")
	            .cookies(loginForm.cookies())
	            .post();
	    
	    System.out.println(document.text());


	}

}
