package first_java.design_patterns.factory_method;

abstract class DocumentCreator {
    public abstract Document createDocument();

    public void printDocument() {
        Document doc = createDocument();
        doc.print();
    }
}

class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

