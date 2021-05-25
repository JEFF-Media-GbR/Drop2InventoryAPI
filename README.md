# Drop2Inventory API
## Maven repository
You can use maven to add the Drop2Inventory API as a dependency to your Spigot-Plugin:

```xml
<repositories>
	<repository>
		<id>jeff-media-repo</id>
		<url>https://repo.jeff-media.de/maven2</url>
	</repository>
</repositories>
<dependencies>
	<dependency>
		<groupId>de.jeff_media</groupId>
		<artifactId>Drop2InventoryAPI</artifactId>
		<version>1.0.0</version>
        	<scope>compile</scope>
	</dependency>
</dependencies>
```

Note that you must also shade the API into your .jar file to use it:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.1.0</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
``` 

## Accessing the API
You can access all API methods statically via the public class `de.jeff_media.drop2inventory.Drop2InventoryAPI`.

## Javadocs
- [Drop2InventoryAPI Javadocs](https://repo.jeff-media.de/javadocs/Drop2InventoryAPI).