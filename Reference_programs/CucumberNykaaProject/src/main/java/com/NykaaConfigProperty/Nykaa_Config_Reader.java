package com.NykaaConfigProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Nykaa_Config_Reader {
	public static Properties p;
	public Nykaa_Config_Reader() throws IOException {
		File f=new File("F:\\sana_workspace\\CucumberNykaaProject\\src\\main\\java\\com\\NykaaPropertyFile\\NykaaPropertyFile.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		p.load(fis);
	}
public String getUrl() {
String url = p.getProperty("url");
return url;
}
public String getVerifyMobileNo() {
	String verifyMobileNo = p.getProperty("verifyMobileNo");
	return verifyMobileNo;
}
public String getArea() {
	String area = p.getProperty("area");
	return area;
}
public String getHouseNo() {
	String houseNo = p.getProperty("houseNo");
	return houseNo;
}
public String getPincode() {
	String pincode = p.getProperty("pincode");
	return pincode;
}public String getEmail() {
	String email = p.getProperty("email");
	return email;
}public String getName() {
	String name = p.getProperty("name");
	return name;
}public String getMobileNo() {
	String mobileNo = p.getProperty("mobileNo");
	return mobileNo;
}
}
