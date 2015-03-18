   <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="input">
                       Home
                    </a>
                </li>
                <li>
                   <s:url id="url" action="FetchStudentInfoAction"></s:url>
					<s:a href="%{url}" >Personal Information</s:a>
				</li>
                <li>
                   		<s:a href="grade.jsp" >Grade</s:a>
                </li>
                <li>
         <s:url id="url" action="LibraryAction">

					</s:url>
					<s:a href="%{url}" >Library</s:a>
                </li>
                <li>
                       
					<s:a href="CourseCatalog.jsp" >Course Catalog</s:a>
                </li>
                <li>
                
                   <s:url id="url" action="examdownload">

					</s:url>
					<s:a href="%{url}" >Exam Schedule</s:a>
                
              
                </li>
                  <li>
                 <s:url id="url" action="Financial">

					</s:url>
					<s:a href="%{url}" >Financial</s:a>
                </li>
                <li>
                <s:url id="url" action="friend"></s:url>
					<s:a href="%{url}" >Friend</s:a>
                </li>
                <li>
                    <a href="logout">Logout</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>Student Information System</h1>
                        
                    </div>
                </div>
            </div>
            <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Menu</a>