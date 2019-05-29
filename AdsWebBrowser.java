//By Adriano Rosa
//COSC 4426 Final Project
//This code will be tested for quality assurance and bug detection- in AdsWebBrowserTesting- Junit Class
//Code will be deposited into a pipeline repository- It will deposited into Jenkins

import javafx.scene.paint.Color; //for button color
import javafx.application.Application;//for Application
import javafx.scene.web.WebView;	//for webview
import javafx.stage.Stage; //seting the stage of GUI
import javafx.scene.Scene; //the scene
import javafx.scene.layout.VBox; //VBOX for the root node of GUI
import javafx.scene.web.WebEngine; //to enable the functionality of websites
import javafx.scene.control.Button; //panel buttons to click on website button
import javafx.event.EventHandler; //sets the button on action
import javafx.event.ActionEvent; //loads and brings up website content

//Graphic User Interface for the WebBrowser
//will load up from 6-10 different websites
// add suppress warning to solve configure severity warnings that are throughout the program 
@SuppressWarnings("restriction")
public class AdsWebBrowser extends Application{
	
	//main method
	public static void main(String[]args){
		Application.launch(args);
	}
	//start stage method for the webview and web egine implementation
	@Override //override the method 
	public void start (Stage stage)throws Exception{
		WebView WebView = new WebView(); //view of webpage
		WebEngine Engine = WebView.getEngine(); //view of the engine
		//load the web engine
		Engine.loadContent("https//www.bing.com");
		
		//provide the main button
		Button b0 = new Button ("Ads Web Browser");
		//set position of button with x and y coordinates
		b0.setTranslateX (0);
		b0.setTranslateY(0);
		//set text color
		b0.setTextFill(Color.BLUE);
		
		b0.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.loadContent("AdsWebBrowser");
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("Welcomes to Ads Web Browser, feel free to access and search the following sites.");
			}	
		});
		
		//provide the first of 6 buttons 
		Button b1 = new Button("Press Google");
		//set position of button with x and y coordinattes
		b1.setTranslateX(129);
		//sett positon of button with y
		b1.setTranslateY(-25);
		//set text color
		b1.setTextFill(Color.GREEN);
		//set the button on the action event handler and action event
		b1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.load("https://www.google.com"); //load the website
				//website pops up  
				Engine.getUserAgent();
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("Google accessed");
			}	
		});
		
		//provide the second of 6 buttons
		//go to CNN
		Button b2 = new Button("Press CNN");
		//set position of button with x and y coordinates
		b2.setTranslateX(230);
		b2.setTranslateY(-52);
		//set text color
		b2.setTextFill(Color.ORANGE);
		//set the button on the action event handler and action event
		b2.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.load("https://www.cnn.com"); //load the website of CNN
				//website appears on GUI
				Engine.getUserAgent();
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("CNN.com accessed");
			}
		});
		//provide the third of 10 buttons
		//go to ESPN
		Button b3 = new Button("Press ESPN");
		//set position of button with x and y coordinates
				b3.setTranslateX(315);
				b3.setTranslateY(-80);
				
		//set text color
		b3.setTextFill(Color.YELLOW);
		//set the button on the action event handler and action event
		b3.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.load("https://www.espn.com"); //load the website of ESPN
				//website appears on GUI
				Engine.getUserAgent();
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("ESPN.com accessed");
			}
		});
		
		//provide the fourth of 10 buttons
		// go to youtube
		Button b4 = new Button("Press Bing");
		//set position of button with x and y coordinates
		b4.setTranslateX(405);
		b4.setTranslateY(-107);
		
		//set text color
		b4.setTextFill(Color.MEDIUMPURPLE);
		//set the button on the action event handler and action event
		b4.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.load("https://www.bing.com"); //load the website of Youtube
				//website appears on screen
				Engine.getUserAgent();
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("Bing.com accessed");
			}
		});
		
		//provide the fifth of 10 buttons
		//go to sootoday
		Button b5 = new Button("Press Sootoday");
		//set position of button with x and y coordinates
		b5.setTranslateX(513);
		b5.setTranslateY(-135);
		
		//set text color
		b5.setTextFill(Color.SALMON);
		//set the button on the action event handler and action event
		b5.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.load("https://www.sootoday.com"); //load the website of sootday
				//website appears on screen
				Engine.getUserAgent();
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("sootoday.com accessed");
			}
		});
		//provide the sixth of the 10 buttons
		//go to website dogs
		Button b6 = new Button("Press pbs");
		//set position of button with x and y coordinates
		b6.setTranslateX(630);
		b6.setTranslateY(-160);
		//set text color
		b6.setTextFill(Color.CHARTREUSE);
		//set the button on the action event handler and action event
		b6.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent evt){
				Engine.load("https//www.pbs.org");
				//website appears on screen
				Engine.getUserAgent();
				//indiciate as part of the white box testing that the button has been pressed and able to access the site
				System.out.println("pbs.org is having issues being accessed though");
				//white box testing 
				System.out.println("white box testing is succesful!!");
				//indiciate to user that it is on to black box testing
				System.out.println("now unto junit testing: Black Box testing");
			}
		});
		
		//now once you have the butotns set the user agent for the webengine 
		//this is the user agent from my computer 
		Engine.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_40_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.131 Safari 537.36");
		//this will enable the websites to provide the working functionality and commands once pressed
		
		//VBox to get the root node of the GUI
		VBox RootButton = new VBox();
		//conjoin of all the buttons together
		RootButton.getChildren().addAll(WebView,b0, b1, b2, b3, b4, b5, b6);
		//customize buttons
		
		//set the scene
		Scene webscene = new Scene(RootButton, 1500,  1500); //measurements of the graphic user interface
		stage.setScene(webscene); //set the scene
		stage.show(); // show the application
	} 
}
//end of the program

//Written and Tested by Adriano Rosa 
//May 4- 25, 2019
//COSC 4426-Software Testing and Development

