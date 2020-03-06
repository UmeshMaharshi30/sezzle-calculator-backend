/**
 * 
 */
package com.sezzle.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.sezzle.model.CalculationExpression;

/**
 * @author umesh
 *
 */
@Controller
public class MessageController {

	@MessageMapping("/calculation")
	@SendTo("/channel/calculations")
	public CalculationExpression greeting(CalculationExpression calculationSubmitted) throws Exception {
		return calculationSubmitted;
	}

}
