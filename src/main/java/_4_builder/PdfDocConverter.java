package _4_builder;

/**
 * Created by Alvin on 2019-07-24.
 */

public class PdfDocConverter implements DocConverter {

    private PdfDocument pdfDocument;
    private Document doc;

    public PdfDocConverter(Document doc) {
        this.doc = doc;
        pdfDocument = new PdfDocument();
    }

    @Override
    public void convertChar() {
        String newCharType = "New Char Type is PDF Char , old is " + doc.getOriginCharType();
        pdfDocument.setCharType(newCharType);
    }

    @Override
    public void convertFont() {
        String newFontType = "New Type is PDF Font, old is " + doc.getOriginFontType();
        pdfDocument.setFontType(newFontType);
    }

    @Override
    public Document parseDoc() {
        return pdfDocument;
    }
}
