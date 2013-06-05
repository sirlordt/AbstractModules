package LoginModule;

import java.util.ArrayList;
import java.util.HashMap;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;

import AbstractModules.CAbstractModuleAnonymousDesktop;
import AbstractModules.CModuleDependencies;

public class CLoginModule extends CAbstractModuleAnonymousDesktop {

	@Override
	public String getModuleName() {

		return "Security.Login";
		
	}

	@Override
	public String getModuleNameGUID() {

		return "aa4725f4-b01d-46b0-8f7d-4f8d476e44b5";
		
	}

	@Override
	public String getModuleDescription( String strLanguageName ) {
		
		String strModuleDescription =  "Allow to security login in system";
		
		if ( strLanguageName != null ) {
		
			if ( strLanguageName.equals( "es" ) ) {

				strModuleDescription =  "Permite iniciar sesión en el sistema";

			}
		
		}
		
		return strModuleDescription;
		
	}

	@Override
	public String getModuleVersion() {

		return "1.0.0.0";
		
	}


	@Override
	public ArrayList<CModuleDependencies> getModuleDependencies() {

		// this module no has dependencies 
		return new ArrayList<CModuleDependencies>();
		
	}

	@Override
	public String getIconPath( String strSize ) {

		return null;
		
	}

	@Override
    public Component getUIComponents( Execution CurrentExecution, Component Parent, @SuppressWarnings("rawtypes") HashMap Args ) {

	    Component UIComponent = null;
	    
	    if ( CurrentExecution != null ) 
	    	UIComponent = CurrentExecution.createComponents( "~./LoginModule/uiviews/login.window.zul", Parent, Args );

	    return UIComponent;
	
	}

	@Override
	public DesktopPosition getDesktopPosition() {

		return DesktopPosition.Center;
		
	}

	@Override
	public int InitModule() {

		return 1; //Ok
		
	}

	@Override
	public boolean ModuleActivated() {
	
		return true;

	}			

	public static void main(String[] args) {

		
		
	}

				
}
