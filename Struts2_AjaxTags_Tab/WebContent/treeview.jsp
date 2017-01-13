<%@taglib uri="/struts-dojo-tags" prefix="sajax"%>

<sajax:head/>

<sajax:tabbedpanel id="main">
	<sajax:div label="Address">
		<sajax:tree label="Durgasoft">
			<sajax:treenode label="Hyderabad">
				<sajax:treenode label="SR Nagar">
					<sajax:treenode label="Near_CanaraBank"/>
					<sajax:treenode label="Near_AndhraBank"/>
				</sajax:treenode>
			</sajax:treenode>
		
			<sajax:treenode label="Bangalore">
				<sajax:treenode label="Marathali">
					<sajax:treenode label="BTM"/>
					<sajax:treenode label="Electronic City"/>
				</sajax:treenode>
			</sajax:treenode>
		</sajax:tree>

	</sajax:div>
</sajax:tabbedpanel>