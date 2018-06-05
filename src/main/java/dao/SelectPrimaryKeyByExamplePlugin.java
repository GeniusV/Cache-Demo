package dao;

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

    public static Method generateMethod(String methodName, JavaVisibility visibility, FullyQualifiedJavaType returnType, Parameter... parameters) {
        Method method = new Method(methodName);
        method.setVisibility(visibility);
        method.setReturnType(returnType);
        if (parameters != null) {
            for (Parameter parameter : parameters) {
                method.addParameter(parameter);
            }
        }

        return method;
    }

    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
//      <select id="selectPrimaryKeyByExample" parameterType="dao.model.RoleExample" resultType="java.lang.Long">
        XmlElement select = new XmlElement("select");
        select.addElement(new TextElement("<!-- WARNING - @mbg.generated -->"));
        select.addAttribute(new Attribute("id", "selectPrimaryKeyByExample"));
        select.addAttribute(new Attribute("resultType", introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType().toString()));
        select.addAttribute(new Attribute("parameterType", introspectedTable.getExampleType()));

//        select
        select.addElement(new TextElement("select"));

//        <if test = "distinct" >
//        distinct
//        </if>
        XmlElement ifDinstinct = new XmlElement("if");
        ifDinstinct.addAttribute(new Attribute("test", "distinct != null"));
        ifDinstinct.addElement(new TextElement("distinct"));
        select.addElement(ifDinstinct);

//      id from v_role
        select.addElement(new TextElement(introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName() + " from " + introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime()));

//        <if test = "_parameter != null" >
//        <include refid = "Example_Where_Clause" / >
//        </if>
        XmlElement ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "_parameter != null"));
        XmlElement includeElement = new XmlElement("include");
        includeElement.addAttribute(new Attribute("refid",
                introspectedTable.getExampleWhereClauseId()));
        ifElement.addElement(includeElement);
        select.addElement(ifElement);

//        <if test="orderByClause != null">
//        order by ${orderByClause}
//        </if>
        ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "orderByClause != null"));  //$NON-NLS-2$
        ifElement.addElement(new TextElement("order by ${orderByClause}"));
        select.addElement(ifElement);

//         <cache type="org.mybatis.caches.redis.RedisCache" />
        XmlElement cacheElement = new XmlElement("cache");
        cacheElement.addAttribute(new Attribute("type", "org.mybatis.caches.redis.RedisCache"));
        cacheElement.addElement(new TextElement("<!-- WARNING - @mbg.generated -->"));


//        selectPrimaryKeyLimitedByExample
        XmlElement selectPrimaryKeyLimitedByExample = generateSelectLimitedPrimaryKeyByExample(introspectedTable);


        //add all elements
        XmlElement parentElement = document.getRootElement();
        parentElement.addElement(select);
        parentElement.addElement(cacheElement);
        parentElement.addElement(selectPrimaryKeyLimitedByExample);


        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // add selectPrimaryKeyByExample
        FullyQualifiedJavaType returnType = new FullyQualifiedJavaType("java.util.List<" + introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType() + ">");
        Method method = generateMethod("selectPrimaryKeyByExample", JavaVisibility.DEFAULT, returnType, new Parameter(new FullyQualifiedJavaType(introspectedTable.getExampleType()), "example"));
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* @mbg.generated");
        method.addJavaDocLine("*/");
        interfaze.addMethod(method);

//        selectPrimaryKeyLimitedByExample
        Method selectPrimaryKeyLimitedByExample = new Method();
        selectPrimaryKeyLimitedByExample.setName("selectPrimaryKeyLimitedByExample");
        selectPrimaryKeyLimitedByExample.setVisibility(JavaVisibility.DEFAULT);
        selectPrimaryKeyLimitedByExample.setReturnType(returnType);
        Parameter offset = new Parameter(new FullyQualifiedJavaType("Long"), "offset", "@Param(\"offset\")");
        Parameter num = new Parameter(new FullyQualifiedJavaType("Long"), "num", "@Param(\"num\")");
        Parameter example = new Parameter(new FullyQualifiedJavaType(introspectedTable.getExampleType()), "example", "@Param(\"example\")");
        selectPrimaryKeyLimitedByExample.addParameter(offset);
        selectPrimaryKeyLimitedByExample.addParameter(num);
        selectPrimaryKeyLimitedByExample.addParameter(example);
        selectPrimaryKeyLimitedByExample.addJavaDocLine("/**");
        selectPrimaryKeyLimitedByExample.addJavaDocLine("* @mbg.generated");
        selectPrimaryKeyLimitedByExample.addJavaDocLine("*/");
        interfaze.addMethod(selectPrimaryKeyLimitedByExample);

        //add @Repository
        interfaze.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));
        interfaze.addAnnotation("@Repository");
        return true;
    }

    public XmlElement generateSelectLimitedPrimaryKeyByExample(IntrospectedTable introspectedTable) {
//          <select id="selectPrimaryKeyLimitedByExample" parameterType="map" resultType="java.lang.Long">
        XmlElement select = new XmlElement("select");
        select.addElement(new TextElement("<!-- WARNING - @mbg.generated -->"));
        select.addAttribute(new Attribute("id", "selectPrimaryKeyLimitedByExample"));
        select.addAttribute(new Attribute("parameterType", "map"));
        select.addAttribute(new Attribute("resultType", introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType().toString()));

        //        select
        select.addElement(new TextElement("select"));

//          <if test="example.distinct != null">
//          distinct
//           </if>
        XmlElement ifDinstinct = new XmlElement("if");
        ifDinstinct.addAttribute(new Attribute("test", "example.distinct != null"));
        ifDinstinct.addElement(new TextElement("distinct"));
        select.addElement(ifDinstinct);

//      id from v_role
        select.addElement(new TextElement(introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName() + " from " + introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime()));

//    <if test="_parameter != null">
//      <include refid="Update_By_Example_Where_Clause" />
//    </if>
        XmlElement ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "_parameter != null"));
        XmlElement includeElement = new XmlElement("include");
        includeElement.addAttribute(new Attribute("refid",
                introspectedTable.getMyBatis3UpdateByExampleWhereClauseId()));
        ifElement.addElement(includeElement);
        select.addElement(ifElement);

//    <if test="example.orderByClause != null">
//                order by ${example.orderByClause}
//    </if>
        ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "example.orderByClause != null"));  //$NON-NLS-2$
        ifElement.addElement(new TextElement("order by ${example.orderByClause}"));
        select.addElement(ifElement);

//    <if test="offset != null and num != null">
//                limit #{offset}, #{num}
//    </if>
        ifElement = new XmlElement("if");
        ifElement.addAttribute(new Attribute("test", "offset != null and num != null"));  //$NON-NLS-2$
        ifElement.addElement(new TextElement("limit #{offset}, #{num}"));
        select.addElement(ifElement);

        return select;
    }


}
