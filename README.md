# cim4j

Java classes for CIM / CGMES

Supported CIM / CGMES versions:

- CGMES_2.4.15_27JAN2020
- CGMES_3.0.0

## Install dependencies (Ubuntu)

```bash
apt install maven openjdk-17-jdk
```

## Build jar files (including tests)

```bash
mvn verify
```

## Run simple test program

Read RDF files and write the data to RDF files separated by profiles.

### Run with CIM / CGMES 2.4.15

```bash
cd CGMES_2.4.15_27JAN2020
java -jar target/cim4j*.jar <rdf_file> [<rdf_file> ...] <output_path_stem>
```

### Run with CIM / CGMES 3.0.0

```bash
cd CGMES_3.0.0
java -jar target/cim4j*.jar <rdf_file> [<rdf_file> ...] <output_path_stem>
```
