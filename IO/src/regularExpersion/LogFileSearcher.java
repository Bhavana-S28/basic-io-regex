package regularExpersion;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogFileSearcher {

	public void findLogFileByNameOrDate(String directory, String query) {
		File dir = new File(directory);
		File[] files = dir.listFiles();
		Pattern pattern = Pattern.compile(query);

		for (File file : files) {
			Matcher matcher = pattern.matcher(file.getName());
			if (matcher.find()) {
				System.out.println("Found matching log file: " + file.getName());
			} else {
				System.out.println("File not found");
			}
		}
	}
}
