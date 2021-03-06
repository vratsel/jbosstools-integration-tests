package org.jboss.tools.bpel.ui.bot.test.suite;

import junit.framework.TestSuite;

import org.jboss.tools.bpel.ui.bot.test.ActivityModelingTest;
import org.jboss.tools.bpel.ui.bot.test.AssignActivityTest;
import org.jboss.tools.bpel.ui.bot.test.AssociateRuntimeTest;
import org.jboss.tools.bpel.ui.bot.test.ExampleTest;
import org.jboss.tools.bpel.ui.bot.test.FaultModelingTest;
import org.jboss.tools.bpel.ui.bot.test.SimpleDeployTest;
import org.jboss.tools.bpel.ui.bot.test.WizardTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({
	SimpleDeployTest.class,
	WizardTest.class,
	ActivityModelingTest.class,
	AssociateRuntimeTest.class,
	AssignActivityTest.class,
	FaultModelingTest.class,
	ExampleTest.class
})
@RunWith(BPELSuite.class)
public class AllTests extends TestSuite {

}
