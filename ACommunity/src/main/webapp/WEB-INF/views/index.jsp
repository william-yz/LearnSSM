<html>
    <%--<jsp:include page="common.jsp" />--%>
    <%@include file="common.jsp"%>
    <body>
        <form action="/ac/index/login" method="POST">
            <input type="text" name="userId">
            <input type="submit">
        </form>
    </body>


    <%@include file="allResouces.jsp"%>
</html>
