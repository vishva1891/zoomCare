package config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.codehaus.plexus.util.FileUtils;

import commons.Commons;

public class FileHelper extends Commons {
    public static String directoryName;

    @SuppressWarnings("resource")
    public static File fileHelper(String resource) {
	File file = null;
	URL res = FileHelper.class.getResource(resource);
	if (res.toString().startsWith("jar:")) {
	    try {
		InputStream input = FileHelper.class.getResourceAsStream(resource);
		file = File.createTempFile("tempfile", ".tmp");
		OutputStream out = new FileOutputStream(file);
		int read;
		byte[] bytes = new byte[1024];

		while ((read = input.read(bytes)) != -1) {
		    out.write(bytes, 0, read);
		}
		file.deleteOnExit();
	    } catch (IOException ex) {
		ex.printStackTrace();
	    }
	} else {
	    file = new File(res.getFile());
	}
	if (file != null && !file.exists()) {
	    throw new RuntimeException("Error: File " + file + " not found!");
	}
	return file;
    }

    public static void createFolder(String suite) throws IOException {
	directoryName = System.getProperty("user.home") + "\\Desktop\\" + suite + "-" + dtf.format(now);
	File file = new File(directoryName);
	if (!file.exists()) {
	    file.mkdir();
	}
	FileUtils.cleanDirectory(directoryName);
    }
}
