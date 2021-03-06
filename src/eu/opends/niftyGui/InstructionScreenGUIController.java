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

package eu.opends.niftyGui;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import eu.opends.basics.SimulationBasics;


/**
 * This class handles display and user interaction with the key mapping 
 * and graphic settings window generated by nifty-gui.
 * 
 * @author Rafael Math
 */
public class InstructionScreenGUIController implements ScreenController 
{
	//private SimulationBasics sim;
	//private Nifty nifty;
	private InstructionScreenGUI instructionScreenGUI;
	
	
	/**
	 * Creates a new controller instance for the key mapping and graphic 
	 * settings nifty-gui.
	 * 
	 * @param sim
	 * 			Simulator.
	 * 
	 * @param instructionScreenGUI
	 * 			Instance of the key mapping and graphic settings GUI.
	 */
	public InstructionScreenGUIController(SimulationBasics sim, InstructionScreenGUI instructionScreenGUI) 
	{
		//this.sim = sim;
		this.instructionScreenGUI = instructionScreenGUI;
		//this.nifty = instructionScreenGUI.getNifty();
	}

	
	@Override
	public void bind(Nifty arg0, Screen arg1) 
	{
		
	}

	
	/**
	 * Will be called when GUI is closed.
	 */
	@Override
	public void onEndScreen() 
	{

	}

	
	/**
	 * Will be called when GUI is started.
	 */
	@Override
	public void onStartScreen() 
	{

	}
	
	public void clickStartButton()
	{
		instructionScreenGUI.hideDialog();
	}

}
