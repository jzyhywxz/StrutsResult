<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title><s:text name="indexPage"/></title>
</head>
<body>
  <s:form method="post" action="result" namespace="/zzw">
    <s:textfield name="message" key="message"/>
    <s:submit key="dispatcher" method="dispatcher"/>
    <s:submit key="plainText" method="plainText"/>
    <s:submit key="redirect" method="redirect"/>
    <s:submit key="redirectAction" method="redirectAction"/>
  </s:form>
</body>
</html>