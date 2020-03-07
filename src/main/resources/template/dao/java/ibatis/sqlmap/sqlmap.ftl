<#include "../ibatisbase.ftl">
<?xml version="1.0" encoding="UTF-8" ?>

<!DOCTYPE sqlMap      
    PUBLIC "-//ibatis.apache.org//DTD SQL Map 2.0//EN"      
    "http://ibatis.apache.org/dtd/sql-map-2.dtd">
    
<sqlMap namespace="${name}">
<#assign capturedOutput>
	<#list orm.methodSpecification as method>
		<#include "method/${method}.ftl">				
	</#list>
</#assign>	
<@aliasStatements/>
${capturedOutput}
</sqlMap>