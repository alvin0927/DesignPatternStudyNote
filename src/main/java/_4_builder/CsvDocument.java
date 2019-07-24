package _4_builder;

/**
 * Created by Alvin on 2019-07-24.
 */

public class CsvDocument implements Document {

    private String title;
    private String content;

    public CsvDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getOriginFontType() {
        return "CVS Font Type is " + title ;
    }

    @Override
    public String getOriginCharType() {
        return "CVS Char Type is" + content ;
    }
}
