package org.hsc.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.hsc.model.ENumber;

public class CicotUtils {
	public static List<ENumber> loadENumberFromCSV(String csvFile) throws FileNotFoundException{
		List<ENumber> eNumberList = new ArrayList<ENumber>();
		
		Scanner scanner = new Scanner(new File(csvFile));
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			StringTokenizer lineToken = new StringTokenizer(line, "|");
			int status = Integer.parseInt(lineToken.nextToken());
			String code = lineToken.nextToken();
			String name = lineToken.nextToken();
			String desc = lineToken.nextToken();
			eNumberList.add(new ENumber(code, name, desc, status, null));
		}
		return eNumberList;
	}

	public static String replaceNullWithEmptyString(String val) {
		// TODO Auto-generated method stub
		return (val == null)?"":val;
	}
}
