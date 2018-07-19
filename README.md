Banco de Dados

<font face="Courier New" size="2">
<font color = "blue">CREATE</font>&nbsp;<font color = "blue">DATABASE</font>&nbsp;<font color = "maroon">usuariodb</font><font color = "silver">;</font>
<br/>
<br/><font color = "blue">USE</font>&nbsp;<font color = "maroon">usuariodb</font><font color = "silver">;</font>
<br/>
<br/><font color = "blue">CREATE</font>&nbsp;<font color = "blue">TABLE</font>&nbsp;<font color = "maroon">usuario</font>
<br/>&nbsp;&nbsp;<font color = "maroon">(</font>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "maroon">id</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "black"><i>INT</i></font>&nbsp;<font color = "maroon">auto_increment</font><font color = "silver">,</font>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "maroon">nome</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "black"><i>VARCHAR</i></font><font color = "maroon">(</font><font color = "black">45</font><font color = "maroon">)</font><font color = "silver">,</font>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "maroon">login</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "black"><i>VARCHAR</i></font><font color = "maroon">(</font><font color = "black">45</font><font color = "maroon">)</font><font color = "silver">,</font>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "maroon">senha</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "black"><i>VARCHAR</i></font><font color = "maroon">(</font><font color = "black">45</font><font color = "maroon">)</font><font color = "silver">,</font>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "maroon">nascimento</font>&nbsp;<font color = "black"><i>DATE</i></font><font color = "silver">,</font>
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color = "blue">PRIMARY</font>&nbsp;<font color = "blue">KEY</font><font color = "maroon">(</font><font color = "maroon">id</font><font color = "maroon">)</font>
<br/>&nbsp;&nbsp;<font color = "maroon">)</font><font color = "silver">;</font>&nbsp;
</font>
