package regularExpersion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOexpression {
	public void createLogFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
		} else {
			System.out.println("File already exists.");
		}
	}

	public void moveLogFile(String source, String destination) throws IOException {
		Files.move(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
	}

	public void deleteLogFile(String fileName) {
		File file = new File(fileName);
		if (file.delete()) {
			System.out.println("Deleted the file: " + file.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}

	public static void main(String[] args) {
		// Creation, moving and deletion of files
		IOexpression expression = new IOexpression();
		String filename = "C:\\Users\\bhava\\Desktop\\logs\\" + "file.txt";
		String charFilename = "C:\\Users\\bhava\\Desktop\\logs\\" + "charFile.txt";
		String bytesFilename = "C:\\Users\\bhava\\Desktop\\logs\\" + "bytesFile.txt";
		String destDirec = "C:\\Users\\bhava\\Desktop\\logs\\destdirectory\\";

		LogMetaData metaData = new LogMetaData();
		metaData.setFileName("file1.txt");
		metaData.setFilePath("C:\\Users\\bhava\\Desktop\\logs");

		try {
			expression.createLogFile(filename);
			expression.createLogFile(metaData.getFilePath() + metaData.getFileName());
			expression.moveLogFile(filename, destDirec);
			expression.deleteLogFile(destDirec);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Creation and deletion of log file of charging stations and energy sources
		LogFileCreator logCreator = new LogFileCreator();

		String[] chargingStations = { "Station1", "Station2", "Station3" };
		String[] energySources = { "Solar", "Wind", "Hydro" };

		logCreator.createDailyLogs(chargingStations, energySources);

		// Log file search using regex

		LogFileSearcher searcher = new LogFileSearcher();

		String logDirectory = System.getProperty("user.home") + "\\Desktop\\logs\\";

		new File(logDirectory).mkdirs();

		searcher.findLogFileByNameOrDate(logDirectory, "Station1");
		searcher.findLogFileByNameOrDate(logDirectory, "20241009");

		// Bytes and Character streams simulation

		DataExchangeSimulator simulator = new DataExchangeSimulator();
		try {
			simulator.byteStreamExample(bytesFilename);
			simulator.characterStreamExample(charFilename, "Writing character stream into the file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
