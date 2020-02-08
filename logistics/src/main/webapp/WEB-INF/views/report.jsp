<%--  <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> --%>
<div class="container">
	<form>
		<fieldset class="form-group">
			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0"> Facility Type
				</legend>
				<!--
       <div class="col-sm-10"> 
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
          <label class="form-check-label" for="gridRadios1">
            First radio
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
          <label class="form-check-label" for="gridRadios2">
            Second radio
          </label>
        </div>
        <div class="form-check disabled">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3" >
          <label class="form-check-label" for="gridRadios3">
            Third disabled radio
          </label>
        </div>
      -->

				<div class="custom-control custom-radio">
					<input type="radio" class="custom-control-input" checked=true
						id="customControlValidation2" name="radio-stacked" required>
					<label class="custom-control-label" for="customControlValidation2">
						All - Facilities </label>
				</div>
				&nbsp;
				<div class="custom-control custom-radio mb-3">
					<input type="radio" class="custom-control-input"
						id="customControlValidation3" name="radio-stacked" required>
					<label class="custom-control-label" for="customControlValidation3">
						TYPE - Facilities </label>
					<div class="invalid-feedback">TYPE - Facilities</div>
				</div>
				&nbsp;

				<div class="custom-control custom-radio mb-3">
					<input type="radio" class="custom-control-input"
						id="customControlValidation1" name="radio-stacked" required>
					<label class="custom-control-label" for="customControlValidation1">
						GROUP - Facilities </label>
					<div class="invalid-feedback">GROUP - Facilities</div>
				</div>
			</div>
</div>
</fieldset>
</form>
</div>
<%-- <div class="row">
	<div class="col-lg-12">

		 <c:if test="${userClickReport == true}"> 
			<ol class="breadcrumb">
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
</div> --%>

<%-- 	<div class="row">
		<div class="col-lg-12">
			<h1>Report Name</h1>
			<c:if test="${periodReport == true }">
			USER-DEFINED Period
			</c:if>

			<c:if test="${monthlyReport == true }">
			Monthly Period
			</c:if>
		</div>
	</div>
</div> --%>
