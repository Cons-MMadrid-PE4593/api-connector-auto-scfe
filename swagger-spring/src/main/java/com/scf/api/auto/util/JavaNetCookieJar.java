package com.scf.api.auto.util;

import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.internal.Internal;
import static okhttp3.internal.Util.delimiterOffset;
import static okhttp3.internal.Util.trimSubstring;

public class JavaNetCookieJar implements CookieJar {
	private final CookieHandler cookieHandler;

	public JavaNetCookieJar(CookieHandler cookieHandler) {
		this.cookieHandler = cookieHandler;
	}

	@Override
	public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cookie> loadForRequest(HttpUrl url) {
		Map<String, List<String>> headers = Collections.emptyMap();
		Map<String, List<String>> cookieHeaders;
		try {
			cookieHeaders = cookieHandler.get(url.uri(), headers);
		} catch (IOException e) {
//			Internal.logger.log(WARNING, "Loading cookies failed for " + url.resolve("/..."), e);
			return Collections.emptyList();
		}

		List<Cookie> cookies = null;
		for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
			String key = entry.getKey();
			if (("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
				for (String header : entry.getValue()) {
					if (cookies == null)
						cookies = new ArrayList<>();
					cookies.addAll(decodeHeaderAsJavaNetCookies(url, header));
				}
			}
		}

		return cookies != null ? Collections.unmodifiableList(cookies) : Collections.<Cookie>emptyList();
	}
	
	 private List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl url, String header) {
		    List<Cookie> result = new ArrayList<>();
		    for (int pos = 0, limit = header.length(), pairEnd; pos < limit; pos = pairEnd + 1) {
		      pairEnd = delimiterOffset(header, pos, limit, ";,");
		      int equalsSign = delimiterOffset(header, pos, pairEnd, '=');
		      String name = trimSubstring(header, pos, equalsSign);
		      if (name.startsWith("$")) continue;

		      // We have either name=value or just a name.
		      String value = equalsSign < pairEnd
		          ? trimSubstring(header, equalsSign + 1, pairEnd)
		          : "";

		      // If the value is "quoted", drop the quotes.
		      if (value.startsWith("\"") && value.endsWith("\"")) {
		        value = value.substring(1, value.length() - 1);
		      }

		      result.add(new Cookie.Builder()
		          .name(name)
		          .value(value)
		          .domain(url.host())
		          .build());
		    }
		    return result;
		  }
	

}
