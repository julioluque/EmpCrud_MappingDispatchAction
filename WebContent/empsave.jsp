<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<h1>CRUD</h1>

<h2>
	<bean:message key="tittle" />
</h2>

<html:form action="empsave">

<pre>
<bean:message key="id" />:<html:text property="id" /> <html:errors property="id" />
<bean:message key="name" />:<html:text property="name" /> <html:errors property="name" />
<bean:message key="email" />:<html:text property="email" /> <html:errors property="email" />
<bean:message key="salary" />:<html:text property="salary" /> <html:errors property="salary" />

<html:submit property="submit"><bean:message key="register" /></html:submit>
</pre>


<html:link action="locale.do?language.es">Español</html:link>
<html:link action="locale.do?language.en">Ingles</html:link>
<html:link action="locale.do?language.br">Portugues</html:link>



</html:form>