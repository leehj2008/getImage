<h1>class testURL.Main</h1>

<br>
Main main = new Main();<br>
		String url="http://www.chinadaily.com.cn/hqjs/zggf/201603/85ba3ed21d39490667173f91ecedf6c9.jpg";<br>
		int r = main.getImageAndSave(url, "tmp/a.jpg");<br>
		if(r!=0)<br>
			System.out.println("Error");<br>
		else<br>
			System.out.println("Success");<br>