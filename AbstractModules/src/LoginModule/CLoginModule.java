package LoginModule;

import java.util.ArrayList;
import java.util.HashMap;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;

import AbstractModules.CAbstractModuleAnonymousDesktop;
import AbstractModules.CModuleDependencies;
import AbstractModules.CUIAbstractModule;

public class CLoginModule extends CAbstractModuleAnonymousDesktop {

	@Override
	public String getModuleName( String strLanguageName ) {

		String strModuleName =  "Security login window";
		
		if ( strLanguageName != null ) {
		
			if ( strLanguageName.equals( "es" ) ) {

				strModuleName =  "Ventana de inicio de sesion";

			}
		
		}
		
		return strModuleName;
		
	}

	@Override
	public String getModuleInternalName() {

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

		CUIAbstractModule Module = new CLoginModule();
		
		System.out.println( "Module name:" + Module.getModuleName( null ) );
		System.out.println( "Module internal name: " + Module.getModuleInternalName() );
		System.out.println( "Module name GUID: " + Module.getModuleNameGUID() );
		System.out.println( "Module version: " + Module.getModuleVersion() );
		System.out.println( "Module description: " + Module.getModuleDescription( null ) );
		System.out.println( "-------" );
		System.out.println( "Dependencies:" );

		ArrayList<CModuleDependencies> ModuleDependencies = Module.getModuleDependencies();
		
		for ( int I=0; I < ModuleDependencies.size(); I++ ) {
			
			System.out.println( "Module name: " + ModuleDependencies.get( I ).strModuleName );
			System.out.println( "Module name GUID: " + ModuleDependencies.get( I ).strModuleNameGUID );
			System.out.println( "Module minimal version: " + ModuleDependencies.get( I ).strMinimalVersion );
			System.out.println( "Module miximal version: " + ModuleDependencies.get( I ).strMaximalVersion );
			System.out.println( "-------" );
			System.out.println( "Only this versions:" );
			
			ArrayList<String> strOnlyThisVersions = ModuleDependencies.get( I ).strOnlyThisVersions;
			
			for ( int J=0; J < strOnlyThisVersions.size(); J++ ) {   
			
			    System.out.println( "Version: " + strOnlyThisVersions.get( J ) );
			
			}
		}
		
		System.out.println( "-------" );
		System.out.println( "Icons path:" );

		String strIconSizes[] = { "16x16", "24x24", "32x32", "64x64" };
		
		//16x16 24x24 32x32 64x64
		for ( int I=0; I < strIconSizes.length; I++ ) {
		
			System.out.println( "Icon size: " + strIconSizes[ I ] );
			System.out.println( "Icon path: " + Module.getIconPath( strIconSizes[ I ] ) );
			
			
		}
		
	}

				
}
