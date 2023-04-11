package loja.http;

import java.util.Map;
import java.net.URL;
import java.net.URLConnection;

public class javaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			URL urlApi = new URL(url);
			URLConnection connection = urlApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			throw new RuntimeException("eeeoasc aqdqw", e);
		}

	}

}
