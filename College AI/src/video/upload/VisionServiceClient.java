package video.upload;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;

public class VisionServiceClient {

	private static final String WEB_ADDRESS = "https://api.projectoxford.ai/vision/v1.0/analyze?";
	private static final String SUB_KEY_PREFIX = "&subscription-key=";
	
	private final String apiKey;
	
	public VisionServiceClient(final String yourApiKey)
	{
		this.apiKey = yourApiKey;
	}
	
	public String analyzeImage(final String imagePath, final toGet infoToGet)
	{
		try {
			return this.analyzeImage(ImageIO.read(new File(imagePath)), infoToGet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String analyzeImage(final BufferedImage image, final toGet infoToGet)
	{
		try
		{
			URL url = new URL(infoToGet.getURL(this.apiKey));
			final HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/octet-stream");
			connection.setRequestProperty("Content-Length", String.valueOf(0));
			connection.setDoOutput(true);
			
			//Send request
		    DataOutputStream wr = new DataOutputStream (
		        connection.getOutputStream());
		    ImageIO.write(image, "jpg", wr);
		    wr.close();

		    //Get Response  
		    InputStream is = connection.getInputStream();
		    BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		    StringBuffer response = new StringBuffer();
		    String line;
		    while ((line = rd.readLine()) != null) {
		      response.append(line);
		      response.append('\r');
		    }
		    rd.close();
		    System.out.println(response.toString());
		    return response.toString();
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public enum toGet
	{
		TAGS("visualFeatures=Tags"),
		DESCRIPTION("visualFeatures=Description"),
		TAGS_AND_DESCRIPTION("visualFeatures=Description,Tags");
		
		final String urlPostFix;
		
		toGet(final String urlPostFix)
		{
			this.urlPostFix = urlPostFix;
		}
		
		public String getURL(final String apiKey)
		{
			return new StringBuilder(WEB_ADDRESS)
					.append(this.urlPostFix)
					.append(SUB_KEY_PREFIX)
					.append(apiKey)
					.toString();
		}
	}
}
