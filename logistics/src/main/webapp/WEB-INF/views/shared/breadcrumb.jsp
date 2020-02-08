<!--  Adding breadcrumb component -->
<header>
<div class="container">
<div class="row">
	<div class="col-lg-12">

		 <c:if test="${userClickReport == true}"> 
			<ol class="breadcrumb" style="margin-top:30px;">
				<li><a href="${contextRoot}/home">Home</a></li> &nbsp; / &nbsp;
				<li>Report</li> &nbsp; / &nbsp;
				<c:if test="${reportId == '1'}"> 
				<li class="active">Non-Reporting Facility Report</li>
				</c:if>
				<c:if test="${reportId == '2'}"> 
				<li class="active">CYP - Report</li>
				</c:if>
			</ol>
		</c:if>
	</div>
</div>
</div>
</header>

