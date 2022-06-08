package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.BadMathOpException;

@RestController
public class MathController {
	

	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!Validation.isNumeric(numberOne) || !Validation.isNumeric(numberTwo)) {
			throw new BadMathOpException("Please set a numeric value");
		}
		Double sum = Validation.convertToDouble(numberOne) + Validation.convertToDouble(numberTwo);
		return sum;
		
		
	}

	@RequestMapping(value="/minus/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double minus(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!Validation.isNumeric(numberOne) || !Validation.isNumeric(numberTwo)) {
			throw new BadMathOpException("Please set a numeric value");
		}
		Double minus = Validation.convertToDouble(numberOne) - Validation.convertToDouble(numberTwo);
		return minus;
		
		
	}

	@RequestMapping(value="/times/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double times(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!Validation.isNumeric(numberOne) || !Validation.isNumeric(numberTwo)) {
			throw new BadMathOpException("Please set a numeric value");
		}
		Double times = Validation.convertToDouble(numberOne) * Validation.convertToDouble(numberTwo);
		return times;
		
		
	}

	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!Validation.isNumeric(numberOne) || !Validation.isNumeric(numberTwo)) {
			throw new BadMathOpException("Please set a numeric value");
		}
		Double division = Validation.convertToDouble(numberOne) / Validation.convertToDouble(numberTwo);
		return division;
		
		
	}

	@RequestMapping(value="/average/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!Validation.isNumeric(numberOne) || !Validation.isNumeric(numberTwo)) {
			throw new BadMathOpException("Please set a numeric value");
		}
		Double average = (Validation.convertToDouble(numberOne) + Validation.convertToDouble(numberTwo))/2;
		return average;
		
		
	}

	@RequestMapping(value="/root/{numberOne}", method=RequestMethod.GET)
	public Double root(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!Validation.isNumeric(numberOne)) {
			throw new BadMathOpException("Please set a numeric value");
		}
		Double root = Math.sqrt(Validation.convertToDouble(numberOne));
		return root;
		
		
	}

	

}


