/**
 * 
 */
package com.dataflowdeveloper.detection;

/**
 * @author tspann
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		String phraseUnderTest = null;
		
		if ( args.length >0 && args[0] != null ) {
			phraseUnderTest = args[0];
		}
		else {
			phraseUnderTest = "Bad url http://url.com <a href=\"http://linkedin.com/abc\"&gt;linkedin.com&lt;/a>  mailto:stuff";
		}

		System.out.println(Util.detect(phraseUnderTest));
	}

}
