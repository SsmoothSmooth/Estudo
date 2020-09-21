public class MkvPlayer extends VideoPlayer {
    public MkvPlayer (String filename) {
        super(filename);
    }

    public String decodeFile(String fileContent) {
      String decodedContent = fileContent + " Mkv Decoded";
      return decodedContent;
    }
}