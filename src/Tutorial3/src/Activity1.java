package Tutorial3.src;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
public class Activity1 {
    public static void main(String[] args) {
        String progText = "class Hello {"
               + "public static void main(String[] args) {"
                +"System.out.println(\"Hello world!\");"
                + "}"
                + "}";
        CompilationUnit codeUnit = JavaParser.parse(progText);
        System.out.println(codeUnit);
    }
}
