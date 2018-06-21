package dao; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** 
* SelectPrimaryKeyByExamplePlugin Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 6, 2017</pre> 
* @version 1.0 
*/ 
public class MappersGenerateTest {
    private File configFile;

    @Before
    public void before() {
        configFile = new File("/Users/GeniusV/Documents/Java/IdeaProjects/Cache-Demo/src/main/resources/generatorConfig.xml");

    }

    @Test
    public void test() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}


