package EngenhariadeSoftwareIII.Facade.Codigos;

public class RealizaConversao {
    private Converte PNG;
    private Converte JPG;
    private Converte JPEG;

    public RealizaConversao() {
        PNG = new ConverterPNG();
        JPG = new ConverterJPG();
        JPEG = new ConverterJPEG();
    }

    public void convertendoPNG() {
        PNG.converter();
    }

    public void convertendoJPG() {
        JPG.converter();
    }

    public void convertendoJPEG() {
        JPEG.converter();
    }
}