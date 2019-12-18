<%@ include file="layout/header.jsp" %>

	<div class="container">
		<div class="row">
			<div class="col-10">
			</div>
		</div>
<form method="post" action="/edit">
					<fieldset>
						<legend>Update Car Form</legend>
						<input type="hidden" name="id" value="${car.id}"> 
						<div class="form-group">
							<label for="title">Title</label> <input type="text" name="title" value="${car.title}"
								class="form-control">
						</div>
						<div class="form-group">
							<label for="year">Year</label> <input type="text"
								name="year" value="${car.year}" class="form-control">
						</div>
						<div class="form-group">
							<label for="price">Price</label> <input type="text" name="price" value="${car.price}"
								class="form-control">
						</div>

						<button type="submit" class="btn btn-primary">Submit</button>
					</fieldset>
				</form>

	</div>
<%@ include file="layout/footer.jsp" %>