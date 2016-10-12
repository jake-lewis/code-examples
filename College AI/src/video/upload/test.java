package video.upload;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisionServiceClient test = new VisionServiceClient("bf21298c5aa449a5bfd84b45fd0df61b");
		test.analizeImage("cat.jpg", VisionServiceClient.toGet.DESCRIPTION);
	}

}
