package org.jboss.ide.eclipse.as.ui.bot.test.eap4;

import org.jboss.ide.eclipse.as.ui.bot.test.template.DeployJSPProjectTemplate;
import org.jboss.ide.eclipse.as.ui.bot.test.template.UndeployJSPProjectTemplate;
import org.jboss.tools.ui.bot.ext.config.Annotations.Require;
import org.jboss.tools.ui.bot.ext.config.Annotations.Server;
import org.jboss.tools.ui.bot.ext.config.Annotations.ServerState;
import org.jboss.tools.ui.bot.ext.config.Annotations.ServerType;

/**
 * @see UndeployJSPProjectTemplate
 * @author Lucia Jelinkova
 *
 */
@Require(server=@Server(type=ServerType.EAP, version="4.3", state=ServerState.Running), clearProjects=false, clearWorkspace=false)
public class UndeployJSPProjectEAP4Server extends UndeployJSPProjectTemplate {

	@Override
	protected String getConsoleMessage() {
		return "undeploy, ctxPath=/" + DeployJSPProjectTemplate.PROJECT_NAME;
	}
}
