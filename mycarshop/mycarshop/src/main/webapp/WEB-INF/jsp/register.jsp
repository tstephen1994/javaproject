<%@ include file="layout/header.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col-10">
				<form method="post" action="/register">
					<fieldset>
						<legend>Car Registration Form</legend>
						<div class="form-group">
							<label for="title">Title</label> <input type="text" name="title"
								class="form-control" placeholder="Enter title">
						</div>
						<div class="form-group">
							<label for="year">Year</label> <input type="text"
								name="year" class="form-control" placeholder="Enter year">
						</div>
						<div class="form-group">
							<label for="price">Price</label> <input type="text" name="price"
								class="form-control" placeholder="Enter price">
						</div>

						<button type="submit" class="btn btn-primary">Submit</button>
					</fieldset>
				</form>
			</div>
		</div>

	</div>
<%@ include file="layout/footer.jsp" %>