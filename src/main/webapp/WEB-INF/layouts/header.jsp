<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container">
        <div class="navbar-inner">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <s:url value="/" var="url_home"/>
            <a class="navbar-brand logo" href="${url_home}"><s:message code="back.welcome"/></a>
            <ul class="nav navbar-nav languages">
                <li><a class="navbar-brand" href="?lang=en_US"><span class="glyphicon glyphicon-th-large"></span>English</a></li>
                <li><a class="navbar-brand" href="?lang=fr_FR"><span class="glyphicon glyphicon-th-large"></span>Francis</a></li>
            </ul>
        </div>
    </div>
</nav>