package testURL;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public int getImageAndSave(String url, String fileName) {
		if(fileName.contains("/")) {
			String path = fileName.substring(0, fileName.lastIndexOf("/"));
			new File(path).mkdirs();
		}
		try {
			URL u = new URL(url);
			InputStream is = u.openStream();
			byte[] tmp = new byte[1024];
			FileOutputStream fos = new FileOutputStream(new File(fileName));
			int len = -1;
			while ((len = is.read(tmp)) != -1) {
				fos.write(tmp, 0, len);
			}
			fos.flush();
			fos.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -2;
		}
		return 0;
	}

	public static void main(String[] args) {
		Main main = new Main();
		String url="http://www.chinadaily.com.cn/hqjs/zggf/201603/85ba3ed21d39490667173f91ecedf6c9.jpg";
		int r = main.getImageAndSave(url, "tmp/a.jpg");
		if(r!=0)
			System.out.println("Error");
		else
			System.out.println("Success");
		try {
			Runtime.getRuntime().exec("open tmp/a.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
