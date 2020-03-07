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
	
	public CalculationExpression(String userName, String expression) {
		this.userName = userName;
		this.expression = expression;
	}
	
	public CalculationExpression() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	
}
