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
	public static String getPathVenta()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathVenta");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNameVenta()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileVenta");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	public static String getPathVuelo()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("pathVuelo");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getNameVuelo()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileVuelo");
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
	
	public static String getNameLineaAerea()throws IOException, FileNotFoundException{
		try{
			config = new Properties();
			config.load(new FileReader("config.properties"));
			return config.getProperty("nameFileLineaAerea");
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
}
