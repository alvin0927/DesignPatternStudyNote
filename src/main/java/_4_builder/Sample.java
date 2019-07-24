package _4_builder;

/**
 * Created by Alvin on 2019-07-24.
 */

public class Sample {

    public static void main(String[] args) {

        //GoF Builder
        Document doc = new CsvDocument("csv title " , "csv content");

        PdfDocConverter converter = new PdfDocConverter(doc);
        DocReader docReader = new DocReader(converter);
        PdfDocument pdfDocument = (PdfDocument) docReader.parseDoc();
        System.out.println(pdfDocument.toString());


        //non GoF Builder
        BaoZi baoZi = BaoZi.BaoZiBuilder.getInstance("Flour" , "Red Bean")
                .addingEgg(true)
                .addingMilk(true)
                .build();
        System.out.println(baoZi.toString());
    }
}
