# Filepath_Java
Javaのファイルパスの扱いについて

## 実行

``` sh
mvn clean compile exec:java
```

## 実行結果

``` txt
toString() : .
isAbsolute() : false
toAbsolutePath() : /home/ittimfn/environment/Filepath_Java/.
toAbsolutePath().normalize() : /home/ittimfn/environment/Filepath_Java
toAbsolutePath().isAbsolute() : true
toAbsolutePath().getFileName() : .
toFile().isDirectory() : true
toAbsolutePath().normalize().getFileName() : Filepath_Java
Directory is Filepath_Java
----
toString() : ./README.md
isAbsolute() : false
toAbsolutePath() : /home/ittimfn/environment/Filepath_Java/./README.md
toAbsolutePath().normalize() : /home/ittimfn/environment/Filepath_Java/README.md
toAbsolutePath().isAbsolute() : true
toAbsolutePath().getFileName() : README.md
toFile().isDirectory() : false
toAbsolutePath().normalize().getFileName() : README.md
Directory is Filepath_Java
----
```