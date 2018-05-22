package edu.usal.util;

import java.util.Properties;
import java.io.*;

public class PropertiesUtil {
	private static Properties config;
	
	public static String getPathPabellon()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathPabellon");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getPathAlumno()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathAlumno");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getPathCarrera()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathCarrera");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNamePabellonStream(){
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("namePabellonStream");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getNamePabellonString(){
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("namePabellonString");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getNameAlumnoString(){
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameAlumnoString");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getNameAlumnoStream(){
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameAlumnoStream");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getNameCarreraString(){
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameCarreraString");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getNameCarreraStream(){
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameCarreraStream");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
}
