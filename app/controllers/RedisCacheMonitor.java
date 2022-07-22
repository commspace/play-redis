package controllers;

import play.cache.Cache;
import play.modules.redis.RedisCacheImpl;
import play.modules.redis.RedisPlugin;
import play.mvc.Controller;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RedisCacheMonitor extends Controller {
	
	public static void cacheClientInfo() {
		if (RedisPlugin.isRedisCacheEnabled()) {
			String clientInfo = RedisCacheImpl.getInstance().info();
			
			// Poor man's JSON conversion... 
			// Surround keys/values with quotes
			clientInfo = clientInfo.replaceAll("([^\\s:]+)", "\"$1\"");
			
			 // Replace CRLF with comma
			clientInfo = clientInfo.replaceAll("([\\s]+)", ",");
			
			// Drop last comma
			if (clientInfo.endsWith(",")) {
				clientInfo = clientInfo.substring(0, clientInfo.length() - 1);
			}
			
			renderJSON("{" + clientInfo + "}");
		}
	}
	
	public static void cacheContents() {
		if (RedisPlugin.isRedisCacheEnabled()) {
			Set<String> keys = RedisCacheImpl.getInstance().keys("*");
			
			Map<String, Object> cacheContents = new TreeMap<String, Object>(Cache.get(keys.toArray(new String[keys.size()])));
			renderJSON(cacheContents);
		}
		
	}
}