<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<sf:form modelAttribute="report">
		<fieldset >
			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0"> Facility Type</legend>
				<div class="col-sm-10">
					<sf:radiobuttons 
					path="category" 
					items="${categories}"
					
					class=""
						checked="${category == '0'}"
						required="required" />
				</div>




			</div>

			<c:if test="${category != '0'}">
				<div class="row">
					<legend class="col-form-label col-sm-2 pt-0">
						${groupOrTypeLable} </legend>
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
					<input type="text" class="form-control datepicker" id="dateTo"
						style="width: 300px;" />

				</div>

			</div>
			<div class="row form-group" style="margin-top: 5px;">
				<label class="col-sm-2 col-form-label"></label>
				<div class="col-sm-4 pull-right">
					<sf:button 
					 type="submit" 
					   class="btn btn-primary form-control">
						View Report
					</sf:button>
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
