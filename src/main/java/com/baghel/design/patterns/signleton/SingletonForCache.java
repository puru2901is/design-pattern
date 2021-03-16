package com.baghel.design.patterns.signleton;


/**
 * @author purushottambaghel
 * 
 * Singleton class is used for logging, driver objects, caching and thread pool,database connection
 *
 */
public class SingletonForCache {

	private static SingletonForCache instance;
	
	private SingletonForCache() {}
	
	public static SingletonForCache getInstance() {
		if(instance == null) {
			synchronized (SingletonForCache.class) {
				if(instance == null) {
					instance = new SingletonForCache();
				}
			}
		}
		return instance;
	}
}
