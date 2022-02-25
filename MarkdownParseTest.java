import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

//Windows:
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
//catcat
//Linux:
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest


public class MarkdownParseTest {
    @Test
    public void meowMeow(){
	assertEquals("Meow", "Meow");
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void basicTest() throws IOException{
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }
    @Test
    public void basicTest2() throws IOException{
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    }
    public void basicTest3() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }
    @Test
    public void basicTest4() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }
    public void basicTest5() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }
    @Test
    public void basicTest6() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    }
    public void basicTest7() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    }
    @Test
    public void basicTest8() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    }
    @Test
    public void noLinkFile() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("noLinkFile.md"))));
    }
    @Test
    public void fakeLink() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("fakeLink.md"))));
    }
    @Test
    public void imageTest() throws IOException{
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("imageTest.md"))));
    }
    @Test
    public void backSlashTest() throws IOException {
        assertEquals(List.of("meow.com", "meow.com", "meow.com"), MarkdownParse.getLinks(Files.readString(Path.of("backSlashTest.md"))));
    }
    @Test
    public void snippet1Test() throws IOException {
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(Files.readString(Path.of("snippet1.md"))));
    }
    @Test
    public void snippet2Test() throws IOException {
        assertEquals(List.of("a.com", "a.com(())", "example.com"), MarkdownParse.getLinks(Files.readString(Path.of("snippet2.md"))));
    }
    @Test
    public void snippet3Test() throws IOException {
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), MarkdownParse.getLinks(Files.readString(Path.of("snippet3.md"))));
    }
}
