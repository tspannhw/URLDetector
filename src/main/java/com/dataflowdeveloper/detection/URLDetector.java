/**
 * Created by tspann on 7/8/16.
 */

package com.dataflowdeveloper.detection;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * URL Detector for Hive UDF
 * Apache License 2.0
 * uses LinkedIn's URL-Detector
 * 
 * This is a UDF example
 * 
 * TODO:
 * Simple example, not designed for performance
 * 
 * @author tspann
 * @PaasDev
 * 
 */
@Description(
		  name = "urldetector",
		  value = "_FUNC_(string) - detects urls "
		)
public final class URLDetector extends UDF {

	/**
	 * UDF Evaluation
	 * 
	 * @param s
	 *            Text passed in
	 * @return Text cleaned
	 */
	public Text evaluate(final Text s) {
		if (s == null) {
			return null;
		}
		try {
			String cleaned = Util.detect(s.toString());
			return new Text(cleaned);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
