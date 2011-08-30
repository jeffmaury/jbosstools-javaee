package org.jboss.tools.cdi.ui.test.search;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.jboss.tools.cdi.ui.test.TCKUITest;
import org.jboss.tools.jst.web.kb.refactoring.ELReferencesQueryParticipant;
import org.jboss.tools.jst.web.kb.test.QueryParticipantTestUtils;
import org.jboss.tools.jst.web.kb.test.QueryParticipantTestUtils.MatchStructure;

public class ELReferencesQueryParticipantTest extends TCKUITest{
	
	public void testELReferencesQueryParticipantForType() throws CoreException{
		ArrayList<MatchStructure> matches = new ArrayList<MatchStructure>();
		
		matches.add(new MatchStructure("/tck/WebContent/test.jsp", "sheep"));
		matches.add(new MatchStructure("/tck/WebContent/el/integration/JSFTestPage.jsp", "sheep"));
		matches.add(new MatchStructure("/tck/WebContent/tests/lookup/el/integration/JSFTestPage.jsp", "sheep"));
		
		QueryParticipantTestUtils.testSearchParticipant(tckProject,
				"JavaSource/org/jboss/jsr299/tck/tests/lookup/el/integration/Sheep.java",
				QueryParticipantTestUtils.TYPE_SEARCH,
				"Sheep",
				"",
				new ELReferencesQueryParticipant(),
				matches);
	}
	
	public void testELReferencesQueryParticipantForMethod() throws CoreException{
		ArrayList<MatchStructure> matches = new ArrayList<MatchStructure>();
		
		matches.add(new MatchStructure("/tck/WebContent/test.jsp", "name"));
		matches.add(new MatchStructure("/tck/WebContent/el/integration/JSFTestPage.jsp", "name"));
		matches.add(new MatchStructure("/tck/WebContent/tests/lookup/el/integration/JSFTestPage.jsp", "name"));
		
		QueryParticipantTestUtils.testSearchParticipant(tckProject,
				"JavaSource/org/jboss/jsr299/tck/tests/lookup/el/integration/Sheep.java",
				QueryParticipantTestUtils.METHOD_SEARCH,
				"getName",
				"",
				new ELReferencesQueryParticipant(),
				matches);
	}
	
	public void testELReferencesQueryParticipantForType2() throws CoreException{
		ArrayList<MatchStructure> matches = new ArrayList<MatchStructure>();
		
		matches.add(new MatchStructure("/tck/WebContent/search.jsp", "mySearchableBean"));
		
		QueryParticipantTestUtils.testSearchParticipant(tckProject,
				"JavaSource/org/jboss/jsr299/tck/tests/jbt/search/MySearchableBean.java",
				QueryParticipantTestUtils.TYPE_SEARCH,
				"MySearchableBean",
				"",
				new ELReferencesQueryParticipant(),
				matches);
	}
	
	public void testELReferencesQueryParticipantForMethod2() throws CoreException{
		ArrayList<MatchStructure> matches = new ArrayList<MatchStructure>();
		
		matches.add(new MatchStructure("/tck/WebContent/search.jsp", "sFoo1"));
		
		QueryParticipantTestUtils.testSearchParticipant(tckProject,
				"JavaSource/org/jboss/jsr299/tck/tests/jbt/search/MySearchableBean.java",
				QueryParticipantTestUtils.METHOD_SEARCH,
				"sFoo1",
				"",
				new ELReferencesQueryParticipant(),
				matches);
	}

	public void testELReferencesQueryParticipantForField() throws CoreException{
		ArrayList<MatchStructure> matches = new ArrayList<MatchStructure>();
		
		matches.add(new MatchStructure("/tck/WebContent/search.jsp", "sFoo"));
		
		QueryParticipantTestUtils.testSearchParticipant(tckProject,
				"JavaSource/org/jboss/jsr299/tck/tests/jbt/search/MySearchableBean.java",
				QueryParticipantTestUtils.FIELD_SEARCH,
				"sFoo",
				"",
				new ELReferencesQueryParticipant(),
				matches);
	}

}