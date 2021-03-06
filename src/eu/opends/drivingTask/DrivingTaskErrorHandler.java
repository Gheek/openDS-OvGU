/*
*  This file is part of OpenDS (Open Source Driving Simulator).
*  Copyright (C) 2013 Rafael Math
*
*  OpenDS is free software: you can redistribute it and/or modify
*  it under the terms of the GNU General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  (at your option) any later version.
*
*  OpenDS is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU General Public License for more details.
*
*  You should have received a copy of the GNU General Public License
*  along with OpenDS. If not, see <http://www.gnu.org/licenses/>.
*/

package eu.opends.drivingTask;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


/**
 * This class represents an error handler for the validation 
 * process of the driving task XML-file.
 * 
 * @author Rafael Math
 */
public class DrivingTaskErrorHandler implements ErrorHandler 
{
	private String drivingTaskFileName;
	
	
	/**
	 * Creates a new error handler by saving the file name of the 
	 * driving task.
	 * 
	 * @param drivingTaskFileName
	 * 			Name of the related driving task file.
	 */
	public DrivingTaskErrorHandler(String drivingTaskFileName)
	{
		this.drivingTaskFileName = drivingTaskFileName;
	}
	

	/**
	 * This method will print a message to the console if an error 
	 * occurred while validating the driving task.
	 */
	public void error(SAXParseException arg0) throws SAXException 
	{
		System.err.println("ERROR while validating driving task: " + arg0.getMessage() + 
				"(File: \"" + drivingTaskFileName + "\", line " + arg0.getLineNumber() + ")");
		throw arg0;
	}

	
	/**
	 * This method will print a message to the console if a fatal 
	 * error occurred while validating the driving task.
	 */
	public void fatalError(SAXParseException arg0) throws SAXException 
	{
		System.err.println("FATAL ERROR while validating driving task: " + arg0.getMessage() + 
				"(File: \"" + drivingTaskFileName + "\", line " + arg0.getLineNumber() + ")");
		throw arg0;
	}

	
	/**
	 * This method will print a message to the console if a warning 
	 * occurred while validating the driving task.
	 */
	public void warning(SAXParseException arg0) throws SAXException 
	{
		System.err.println("WARNING while validating driving task: " + arg0.getMessage() + 
				"(File: \"" + drivingTaskFileName + "\", line " + arg0.getLineNumber() + ")");
	}

}
