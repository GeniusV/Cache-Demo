## note

`mybatis-spring` only appropriate for specific version of `spring` and `mybatis`. 

Make sure that the head of `web.xml` is correct, for example:
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://java.sun.com/xml/ns/javaee"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         id="WebApp_ID" version="2.5">
            
</web-app>
```

It's remommended to config cache proptities in Realm beans, or cache may not works as expect.

## Copyright and License
Copyright 2017 GeniusV

Code released under the MIT License.