package dao;

import org.apache.log4j.spi.LoggerFactory;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
 * Created by GeniusV on 8/6/17.
 */
public class SelectPrimaryKeyByExamplePlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        XmlElement select = new XmlElement("select");
        select.addAttribute(new Attribute("id", "selectPrimaryKeyByExample"));
        select.addAttribute(new Attribute("resultType", introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType().toString()));
        select.addAttribute(new Attribute("parameterType", introspectedTable.getExampleType()));
        select.addElement(new TextElement("select "+ introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName() +" from " + introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime()));

//        example
        XmlElement ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "_parameter != null"));
        XmlElement includeElement = new XmlElement("include");
        includeElement.addAttribute(new Attribute("refid",
                introspectedTable.getExampleWhereClauseId()));
        ifElement.addElement(includeElement);
        select.addElement(ifElement);

        ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "orderByClause != null"));  //$NON-NLS-2$
        ifElement.addElement(new TextElement("order by ${orderByClause}"));
        select.addElement(ifElement);

        XmlElement cacheElement = new XmlElement("cache");
        cacheElement.addAttribute(new Attribute("type", "org.mybatis.caches.redis.RedisCache"));

        XmlElement parentElement = document.getRootElement();

        parentElement.addElement(select);
        parentElement.addElement(cacheElement);


        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType returnType = new FullyQualifiedJavaType("java.util.List<"+introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType()+">");
        Method method = generateMethod("selectPrimaryKeyByExample", JavaVisibility.DEFAULT, returnType, new Parameter(new FullyQualifiedJavaType(introspectedTable.getExampleType()), "example"));
        interfaze.addMethod(method);
        interfaze.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));
        interfaze.addAnnotation("@Repository");
        return true;
    }

    public static Method generateMethod(String methodName, JavaVisibility visibility, FullyQualifiedJavaType returnType, Parameter ... parameters){
        Method method = new Method(methodName);
        method.setVisibility(visibility);
        method.setReturnType(returnType);
        if (parameters != null){
            for (Parameter parameter: parameters) {
                method.addParameter(parameter);
            }
        }

        return method;
    }


}
