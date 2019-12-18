<%@ include file="layout/header.jsp" %>

		<div class="container">
		<div class="row">
			<div class="col-10">
				<c:forEach items="${cars}" var="car">
					<div class="card-header my-2 bg-info">
						<div class="card-title text-white">${car.title}<a
								href="/delete?id=${car.id}"> <i
								class="fa fa-eraser float-right" aria-hidden="true"></i></a> <a
								href="/edit?id=${car.id}"><i
								class="fa fa-pencil-square-o float-right mx-1"
								aria-hidden="true"></i></a>
						</div>
						<div class="card-body">
							<ul class="list-group text-dark">
								<li class="list-group-item">Year: ${car.year}</li>
								<li class="list-group-item">Price: £${car.price}</li>
							</ul>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

	</div>
<%@ include file="layout/footer.jsp" %>
