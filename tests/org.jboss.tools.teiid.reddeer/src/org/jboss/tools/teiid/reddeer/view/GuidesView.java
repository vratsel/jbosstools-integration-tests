package org.jboss.tools.teiid.reddeer.view;

import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.jboss.reddeer.swt.impl.tree.DefaultTreeItem;
import org.jboss.reddeer.swt.util.Bot;
import org.jboss.reddeer.swt.wait.TimePeriod;
import org.jboss.reddeer.swt.wait.WaitWhile;
import org.jboss.tools.teiid.reddeer.condition.IsInProgress;

public class GuidesView {

	private int ACTION_SETS_TREE_INDEX = 2;//TODO hardcoded index; 0 - model explorer view, 1 - model actions, 2 - other 
	
	/*public void openGuides(){//presun nekam jinam - vytvorit nejaky GuidesView
		Bot.get().cTabItem("Guides").activate();
		Bot.get().comboBox().setSelection("Model JDBC Source");
		SWTBotTree t = Bot.get().tree(2).select("Define Teiid Model Project");//index hardcoded!
		t.getTreeItem("Define Teiid Model Project").doubleClick();
		Bot.get().button("New...").click();
		//jak zvysit index page...? - to asi nejde, tak zkusim zmenit matcher...
	}*/
	
	/**
	 * Choose specific action from action set.
	 * @param actionSet 
	 * @param action
	 */
	public void chooseAction(String actionSet, String action){
		Bot.get().cTabItem("Guides").activate();
		Bot.get().comboBox().setSelection(actionSet);
		SWTBotTree t = Bot.get().tree(ACTION_SETS_TREE_INDEX).select(action);//index hardcoded!
		t.getTreeItem(action).doubleClick();
	}
	
	/**
	 * Preview data (table) via guides action
	 * @param calledFirstTime true - sets up display property of unresolvable SQL results
	 * @param path to table (e.g. "ProjectName", "ModelName", "TABLE")
	 */
	public void previewData(boolean calledFirstTime, String... path){
		new GuidesView().chooseAction("Model JDBC Source", "Preview Data");
		Bot.get().button("...").click();
		new DefaultTreeItem(path).select();
		Bot.get().button("OK").click();
		Bot.get().button("OK").click();
		//setup display property; only 1st time
		if (calledFirstTime){
			Bot.get().activeShell().bot().button("Yes").click();
		}
		new WaitWhile(new IsInProgress(), TimePeriod.LONG);
	}
}
