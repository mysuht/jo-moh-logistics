<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<sf:form modelAttribute="report">
		<fieldset class="form-group">
			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0"> Facility Type</legend>
				

				<div class="custom-control custom-radio">
					<sf:radiobutton 
					path="category" 
					class="custom-control-input" 	
					checked="true" 
					id="customControlValidation2" 
					name="radio-stacked" 
					required="required" /> 
					
						
					
					<label class="custom-control-label" for="customControlValidation2">
						All - Facilities </label>

				</div>
				&nbsp;&nbsp;
				<div class="custom-control custom-radio mb-3">
					<sf:radiobutton 
					path="category" 
					class="custom-control-input"
						id="customControlValidation1" 
						name="radio-stacked" 
						required="required" />
					
					<label class="custom-control-label" for="customControlValidation1">

						GROUP - Facilities </label>
					<div class="invalid-feedback">GROUP - Facilities</div>

				</div>
				&nbsp;&nbsp;
				<div class="custom-control custom-radio mb-3">
					<sf:radiobutton
					 path="category"  
					 class="custom-control-input" 
					 id="customControlValidation3"						
						name="radio-stacked" 
						required="required" />
					
					<label class="custom-control-label" for="customControlValidation3">
						TYPE - Facilities </label>
					<div class="invalid-feedback">TYPE - Facilities</div>

				</div>



			</div>
			
			
			<c:if test="${category != '0'}">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0"> ${groupOrTypeLable} </legend>
					<div class="col-sm-10">
						<select class="form-control" id="typeOrGroupSelect">
						</select>
					</div>
				</div>
			</c:if>

			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0"> Facility/ies</legend>

				<div class="col-sm-10">
					<select multiple class="form-control" id="facilitiySelectList">
					</select>
				</div>
			</div>

			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0"> Product/s </legend>
				<div class="col-sm-10">
					<select multiple class="form-control" id="productSelectList">
					</select>
				</div>
			</div>

			<div class="row ">
				<legend class="col-form-label col-sm-2 pt-0"> Period </legend>

				<div class="col-sm-4">
<!-- 					<legend class="col-form-label col-sm-4 pt-0"> Date From </legend> -->
					<input type="text" class="form-control datepicker" id="dateFrom"
						style="width: 300px;" />
				</div>
				<div class="col-sm-4">
<!-- 					<legend class="col-form-label col-sm-4 pt-0"> Date To</legend> -->
					<input type="text" class="form-control datepicker" id="dateTo" style="width: 300px;" />
						
				</div>

			</div>
			<div class="row form-group" style="margin-top: 5px;">
				<label class="col-sm-2 col-form-label"></label>
				<div class="col-sm-4 pull-right">
					<input type="button" type="submit"
						class="btn btn-primary form-control" value="View Report" />
				</div>

			</div>
	</div>
	</div>
</fieldset>



</sf:form>
</div>
<script type="text/javascript">
	$('.datepicker').datepicker({
		/* startDate: '-3d',
		viewMode: 'years' */
		minViewMode : 1,
		format : 'mm-yyyy'
	});
</script>
