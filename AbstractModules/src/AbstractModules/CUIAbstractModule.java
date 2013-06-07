package AbstractModules;

import java.util.HashMap;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;

public abstract class CUIAbstractModule implements IAbstractModule {

	protected String strIconSet = "";
	
	public void setIconSet( String strIconSet ) {
		
		this.strIconSet = strIconSet;
		
	}
	
	public enum DesktopPosition { Top, Left, Bottom, Right, Center, Overlap };
	
    public abstract Component getUIComponents( Execution CurrentExecution, Component Parent, @SuppressWarnings("rawtypes") HashMap Args );

    public abstract String getMainIconPath( String strIconSize );
    
    public abstract DesktopPosition getDesktopPosition();
    
    public abstract String getTranslateLabel( String strLabel );
    
    public abstract String getImagePath( String strIconName );
    
}
