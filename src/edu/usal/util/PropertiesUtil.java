package edu.usal.util;

import java.util.Properties;
import java.io.*;

public class PropertiesUtil {
	private static Properties config;
	
	public static String getPathCliente()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathCliente");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNameClienteStream()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileCliente");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getPathLineaAerea()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathLineaAerea");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNameLineaAereaStream()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileLineaAerea");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getPathAlianzas()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathAlianzas");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNameAlianzas()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileAlianzas");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getPathPaises()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathPaises");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNamePaises()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFilePaises");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getPathProvincias()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathProvincias");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNameProvincias()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileProvincias");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
}
