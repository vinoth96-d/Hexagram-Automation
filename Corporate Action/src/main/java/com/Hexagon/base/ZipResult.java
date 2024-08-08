package com.Hexagon.base;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;

public class ZipResult extends BasePage {
	
	public static void zipFile() {
	    // Specify the source folder to be compressed
	    String sourceFolder = System.getProperty("user.dir") + "/extentreports";
	    // Specify the path for the final zip file
	    String zipFile = System.getProperty("user.dir") + "/extentreports.zip";

	    try {
	        // Call the method to zip the folder
	        zipFolder(sourceFolder, zipFile);
	        // Print a success message
	        System.out.println("Folder successfully compressed to a zip file.");
	    } catch (IOException e) {
	        // Print the stack trace if an exception occurs
	        e.printStackTrace();
	    }
	}

	public static void zipFolder(String sourceFolder, String zipFilePath) throws IOException {
	    // Create FileOutputStream for the final zip file
	    FileOutputStream fos = new FileOutputStream(zipFilePath);
	    // Create ZipOutputStream to write to the final zip file
	    ZipOutputStream zos = new ZipOutputStream(fos);

	    // Create a File object for the source folder
	    File folder = new File(sourceFolder);
	    // Call the method to zip files and folders recursively
	    zipFiles(folder, folder.getName(), zos);

	    // Close the ZipOutputStream and FileOutputStream
	    zos.close();
	    fos.close();
	}

	private static void zipFiles(File folder, String parentFolder, ZipOutputStream zos) throws IOException {
	    // Iterate over each file or folder in the source folder
	    for (File file : folder.listFiles()) {
	        // Check if it is a directory
	        if (file.isDirectory()) {
	            // If it's a directory, recursively call the method for its content
	            zipFiles(file, parentFolder + "/" + file.getName(), zos);
	            // Continue to the next iteration
	            continue;
	        }

	        // Create a new ZipEntry for the current file
	        ZipEntry zipEntry = new ZipEntry(parentFolder + "/" + file.getName());
	        // Put the entry into the ZipOutputStream
	        zos.putNextEntry(zipEntry);

	        // Create FileInputStream to read the contents of the file
	        FileInputStream fis = new FileInputStream(file);
	        // Buffer for reading and writing data
	        byte[] buffer = new byte[4096];
	        int length;
	        // Read and write bytes to zip the file
	        while ((length = fis.read(buffer)) > 0) {
	            zos.write(buffer, 0, length);
	        }

	        // Close the FileInputStream and close the current entry in the ZipOutputStream
	        fis.close();
	        zos.closeEntry();
	    }
	}


// Clear the contents of the screenshots folder
public static void clearScreenshots() {
	try {
		String screenshotsPath = System.getProperty("user.dir") + "/extentreports/screenshots";
		File screenshotsFolder = new File(screenshotsPath);
		// Use FileUtils.cleanDirectory to delete the contents of the folder
		FileUtils.cleanDirectory(screenshotsFolder);
		System.out.println("Screenshot folder cleared successfully.");
	} catch (Exception e) {
		// Print the stack trace if an exception occurs
		e.printStackTrace();
	}
}

}
