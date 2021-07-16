package sample.path;

import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * Javaのパスの扱いを確認する。
 */
public class App {
  public static void main( String[] args ) {
    Path home = Paths.get(".");
    print(home);

    Path readme = Paths.get("./README.md");
    print(readme);
  }

  public static void print(Path path){
    System.out.println("toString() : " + path.toString());
    System.out.println("isAbsolute() : " + path.isAbsolute());
    System.out.println("toAbsolutePath() : " + path.toAbsolutePath());
    System.out.println("toAbsolutePath().normalize() : " + path.toAbsolutePath().normalize());
    System.out.println("toAbsolutePath().isAbsolute() : " + path.toAbsolutePath().isAbsolute());
    System.out.println("toAbsolutePath().getFileName() : " + path.toAbsolutePath().getFileName());
    System.out.println("toFile().isDirectory() : " + path.toFile().isDirectory());
    System.out.println("toAbsolutePath().normalize().getFileName() : " + path.toAbsolutePath().normalize().getFileName());

    // ディレクトリ名を取得したい場合、インスタンスが指しているものがファイルかディレクトリかで異なる。
    if(path.toFile().isDirectory()){
      System.out.println("Directory is " + path.toAbsolutePath().normalize().getFileName());
    } else {
      System.out.println("Directory is " + path.getParent().toAbsolutePath().normalize().getFileName());
    }
    System.out.println("----");
  }
}
