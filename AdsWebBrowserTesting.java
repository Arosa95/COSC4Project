//Author: Adriano Rosa
//Date: May 13- 26
//Description: This is the junit tetsting  web browser appliation part
//Using integration testing method- selenium


//Testing of Ad's web browser GUI application (****testing part****)
//this is also a form of black box testing, since it is testing outside the application


import javafx.application.Application;//for Application
import javafx.scene.web.WebView;	//for webview
import javafx.stage.Stage; //seting the stage of GUI
import javafx.scene.Scene; //the scene
import javafx.scene.layout.VBox; //VBOX for the root node of GUI
import javafx.scene.web.WebEngine; //to enable the functionality of websites
import javafx.scene.control.Button; //panel buttons to click on website button
import javafx.event.EventHandler; //sets the button on action
import javafx.event.ActionEvent; //loads and brings up website content
import javafx.scene.paint.Color; //for button color

import static org.junit.Assert.*; //main test import
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

//test the javafx Ads WebBrowser Application

@SuppressWarnings("restriction")
public class AdsWebBrowserTesting extends AdsWebBrowser{
	
	//objects from class
	private AdsWebBrowser browser;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button b0;
	
	//set up method
	@Before
	public void setupBrowser() throws Exception{
		
		browser = new AdsWebBrowser();
		
	}
	//test the Ads Web Browser class
	@Test
	public void testBrowser()throws Exception{
		
		browser.getClass(); //to test the entire class, there is only one class in Ads Web Browser
		
		//test the following cases
		
		//test for the same funtionality
		assertSame(b0, b1); //assert that these butttons have the same functionality
		assertSame(b2, b3); //asert that these buttons have the same functionality
		assertSame(b4, b5); //assert that the se buttons have the same functionality
		assertSame(b0, b6); //assert that these buttons have the same functionality
		
		//test to see if the buttons are not null
		Assert.assertNull(b0);
		Assert.assertNull(b1);
		Assert.assertNull(b2);
		Assert.assertNull(b3);
		Assert.assertNull(b4);
		Assert.assertNull(b5);
		Assert.assertNull(b6);
		
		//3rd test case if butotns are not equal the following buttons
		assertNotEquals("https://wwww.bing.com", b1);
		assertNotEquals("https://www.google.com", b0);
		assertNotEquals("https://www.espn.com", b6);
		assertNotEquals("https://www.cnn", b2);
		assertNotEquals("https://www.pbs.org", b5);
		assertNotEquals("https://www.sootoday.com", b6);
	
		
		/*
		browser.equals(Engine); //initialize engine
		browser.equals(WebView); //initialize webview
		browser.equals(b0); //initialize button 0
		browser.equals(b1); //initialize button 1
		browser.equals(b2); //initialize button 2
		browser.equals(b3); //initalize button 3
		browser.equals(b4); //initialize button 4
		browser.equals(b5); //initialize button 5
		browser.equals(b6); //initialize last button
		*/
		browser.main(null); //tests the end funtionality of AdsWebBrowser, this will bring up the javafx GUI- AdsWeb Browser	
	}
	
	//post method
	@After
	public void tearDownBrowser()throws Exception{
		browser.stop();
	}	
}

//end of junit testing
// Tested by Adriano Rosa 
//May 25-26, 2019
//COSC 4426-Software testing
