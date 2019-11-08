class testURL.Main
Main main = new Main();
		String url="http://www.chinadaily.com.cn/hqjs/zggf/201603/85ba3ed21d39490667173f91ecedf6c9.jpg";
		int r = main.getImageAndSave(url, "tmp/a.jpg");
		if(r!=0)
			System.out.println("Error");
		else
			System.out.println("Success");