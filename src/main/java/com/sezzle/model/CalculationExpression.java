/**
 * 
 */
package com.sezzle.model;

/**
 * @author umesh
 *
 */
public class CalculationExpression {
	String userName;
	String expression;
	long timeStamp;
	
	public CalculationExpression(String _userName, String _expression) {
		userName = _userName;
		expression = _expression;
		timeStamp = System.currentTimeMillis();
	}
	
}
