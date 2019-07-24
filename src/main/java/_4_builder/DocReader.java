package _4_builder;

/**
 * Created by Alvin on 2019-07-24.
 */

public class DocReader {

    private DocConverter converter;

    public DocReader(DocConverter converter) {
        this.converter = converter;
        converter.convertChar();
        converter.convertFont();
    }

    public Document parseDoc(){
        return converter.parseDoc();
    }
}
