package first_java.design_patterns.factory_method;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DocumentCreator creator = new WordDocumentCreator();
        creator.printDocument(); // Output: Printing Word Document

        creator = new PdfDocumentCreator();
        creator.printDocument(); // Output: Printing PDF Document
    }
}
