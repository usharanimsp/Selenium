package com.NykaaConfigProperty;

import java.io.IOException;

public class Nykaa_Config_Manager {
	private Nykaa_Config_Manager() {
	}
public Nykaa_Config_Reader getInstanceConfifReader() throws IOException {
Nykaa_Config_Reader cr=new Nykaa_Config_Reader();
return cr;
}
public static Nykaa_Config_Manager getInstanceManager() {
Nykaa_Config_Manager cm=new Nykaa_Config_Manager();
return cm;
}
}
