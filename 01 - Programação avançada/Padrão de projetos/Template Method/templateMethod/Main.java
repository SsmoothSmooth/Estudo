import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        VideoPlayer videoPlayer = null;
        System.out.print("Input file name: ");
        String filename = reader.readLine();

        if (filename.indexOf("mkv") > 0) {
          videoPlayer = new MkvPlayer(filename);
        } else if (filename.indexOf("mp4") > 0) {
          videoPlayer = new Mp4Player(filename);
        } else {
          throw new IllegalArgumentException(filename + " type not supported");
        }


        videoPlayer.playVideo();
  }
}