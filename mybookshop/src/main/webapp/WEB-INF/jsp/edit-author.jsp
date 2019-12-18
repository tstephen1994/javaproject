<%@ include file="layout/header.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col-10">
				<form method="post" action="/edit-author">
				<fieldset>
				<legend>Update Author Form</legend>
					<input type="hidden" name="id" value="${author.id}">
					<div class="form-group">
						<label for="name">Name</label> <input type="text" name="name" value=${author.name}
							class="form-control">
					</div>
					<div class="form-group">
						<label for="email">Email</label> <input type="text"
							name="email"  value="${author.email}"class="form-control">
					</div>

					<div class="form-group">
						<label for="phone">Phone</label> <input type="text" name="phone" value="${author.phone}"
							class="form-control">
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</fieldset>
				</form>

			</div>
		</div>
	</div>
	<%@ include file="footer.jsp" %>