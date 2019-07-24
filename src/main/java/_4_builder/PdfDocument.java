package _4_builder;

/**
 * Created by Alvin on 2019-07-24.
 */

public class PdfDocument implements Document {

    private String fontType;
    private String charType;

    /**
     * @return the {@link #fontType}
     */
    public String getFontType() {
        return fontType;
    }

    /**
     * @param fontType the {@link #fontType} to set
     */
    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    /**
     * @return the {@link #charType}
     */
    public String getCharType() {
        return charType;
    }

    /**
     * @param charType the {@link #charType} to set
     */
    public void setCharType(String charType) {
        this.charType = charType;
    }

    @Override
    public String getOriginFontType() {
        return "PDF Font Type";
    }

    @Override
    public String getOriginCharType() {
        return "PDF Char Type";
    }

    @Override
    public String toString() {
        return "PdfDocument{" +
                "fontType='" + fontType + '\'' +
                ", charType='" + charType + '\'' +
                '}';
    }
}
