# Drop2Inventory API
## Maven repository
You can use maven to add the Drop2Inventory API as a dependency to your Spigot-Plugin:

```xml
<repositories>
    <repository>
        <id>jeff-media-public</id>
        <url>https://hub.jeff-media.com/nexus/repository/jeff-media-public</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>de.jeff_media</groupId>
        <artifactId>Drop2InventoryAPI</artifactId>
        <version>1.0.0-SNAPSHOT</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```

You must also add Drop2InventoryPlus as `depend` or `softdepend`
to your plugin.yml. If you only softdepend on it, you should shade the API
into your plugin:

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
- [Drop2InventoryAPI Javadocs](https://hub.jeff-media.com/javadocs/drop2inventoryapi).
