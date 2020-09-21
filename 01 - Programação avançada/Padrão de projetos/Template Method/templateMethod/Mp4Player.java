public class Mp4Player extends VideoPlayer {
    public Mp4Player (String filename) {
        super(filename);
    }

    public String decodeFile(String fileContent) {
      String decodedContent = fileContent + " Mp4 Decoded";
      return decodedContent;
    }
}