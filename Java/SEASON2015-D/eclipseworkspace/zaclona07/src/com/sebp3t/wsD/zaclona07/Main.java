package com.sebp3t.wsD.zaclona07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONObject rodina = (JSONObject) new JSONParser().parse(new FileReader("rodina.json"));
		
		JSONObject mama = (JSONObject) rodina.get("mama");
		String meno_mamy = (String) mama.get("meno");
		BigDecimal vek_mamy = new BigDecimal( (String)mama.get("vek") );
		
		JSONObject otec = (JSONObject) rodina.get("otec");
		String meno_otca = (String) otec.get("meno");
		BigDecimal vek_otca = new BigDecimal( (String)otec.get("vek") );
		
		System.out.println("mama : " + meno_mamy + " : " + vek_mamy.toString());
		System.out.println("otec : " + meno_otca + " : " + vek_otca.toString());

	}

}
