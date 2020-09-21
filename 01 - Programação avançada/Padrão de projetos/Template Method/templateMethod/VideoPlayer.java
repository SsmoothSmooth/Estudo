/**
 * Base class of social network.
 */
public abstract class VideoPlayer {
    String fileName;
    
    VideoPlayer(String fileName) {
      this.fileName = fileName;
    }

    // template method
    public void playVideo() {
      String content = loadFile();
      String decodedContent = decodeFile(content);
      startPlayer(decodedContent);
    }

    protected String loadFile() {
      return fileName + " content";
    }

    protected abstract String decodeFile(String content);

    protected void startPlayer(String decodedContent) {
      System.out.println("Start playing " + decodedContent);
    }
}