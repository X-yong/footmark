package com.xy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionDealController {
	
	@ExceptionHandler({RuntimeException.class})
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException (RuntimeException e) {
		ModelAndView mode = new ModelAndView();
		mode.addObject("exception",e.getMessage());
		mode.setViewName("error/400");
		System.out.println("运行异常");
		return mode;
	   
   }
	@ExceptionHandler({Exception.class})
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException (Exception e) {
		ModelAndView mode = new ModelAndView();
		mode.addObject("exception",e.getMessage());
		mode.setViewName("error/500");
		System.out.println("异常了");
		return mode;
		
	}
}