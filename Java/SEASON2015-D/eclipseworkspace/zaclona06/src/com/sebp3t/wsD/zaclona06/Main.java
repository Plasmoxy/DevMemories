package com.sebp3t.wsD.zaclona06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONObject chleb = (JSONObject) new JSONParser().parse(new FileReader("chleb.json"));
		
		String a = (String) (
				( (JSONObject)
						((JSONObject)
								((JSONObject)
										chleb
								).get("a")
						).get("b")
				).get("c")
		);
		
		System.out.println(a);

	}

}
