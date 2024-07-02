package first_java.design_patterns.factory_method;

abstract class Document {
    public abstract void print();
}

class WordDocument extends Document {
    @Override
    public void print() {
        System.out.println("Printing Word Document");
    }
}

class PdfDocument extends Document {
    @Override
    public void print() {
        System.out.println("Printing PDF Document");
    }
}
