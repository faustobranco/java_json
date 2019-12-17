# Java Reading JSON Files

  
Java project with examples for reading JSON files.

  ## Getting Started
  
The project, done in Java 8 using IntelliJ 2019.3 and Maven, simply shows 3 ways of reading JSON files **only for reference**:

 - Load simple Json and Array Json into JsonNode Object.
 - Load simple Json and Array Json into immutable class.
 - Load Json file with properties that not exist into class.

### Maven:

    <dependencies>  
        <dependency> 
            <groupId>com.fasterxml.jackson.core</groupId>  
            <artifactId>jackson-databind</artifactId>  
            <version>2.9.9</version>  
        </dependency> 
        <dependency>  
            <groupId>com.fasterxml.jackson.dataformat</groupId>  
            <artifactId>jackson-dataformat-yaml</artifactId>  
            <version>2.9.9</version>  
        </dependency> 
    </dependencies>  
    <build>  
        <plugins> 
            <plugin> 
                <groupId>org.apache.maven.plugins</groupId>  
                <artifactId>maven-compiler-plugin</artifactId>  
                <configuration> 
                    <source>1.8</source>  
                    <target>1.8</target>  
                </configuration> 
            </plugin> 
        </plugins>
    </build>



### JSON Files

Location: /src/main/resources

|JSON File  |Description  |
|--|--|
|contact.yaml| Simple JSON. |
|contact_array.yaml|Simple JSON array.|
|contact_missing.yaml  | Used to simulate, for example, a Json file that does not contain all the information the class expects. |


## Authors

-   **Fausto Branco** - _Initial work_ - [Git faustobranco](https://github.com/faustobranco)
