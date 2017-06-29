package com.tpg.assignment1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

public class IPValidationRegex {

	static String IPADDRESS_PAT = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	static Pattern pattern = Pattern.compile(IPADDRESS_PAT);
	private static Matcher matcher;

	public static void main(String[] args) throws IOException {

		try {

			File file = new File("src/IPAddess.txt");

			List<String> ipAddressess = FileUtils.readLines(file, "UTF-8");

			for (String ipAddress : ipAddressess) {
				matcher = pattern.matcher(ipAddress);
				System.out.println("Is " +ipAddress +" a valid IP: "+matcher.matches());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
