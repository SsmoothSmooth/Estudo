class Main {
    public static void main(String[] args) {
    
      try {
        // Get the only object available
        MyFile object = MyFile.getInstance();
  
        // Read the file
        String content = object.readFile();
  
        // Update content and write to file
        System.out.println(content);
        content += "(NOVO)";
        object.writeFile(content);
  
        // REad the file again print content
        content = object.readFile();
        System.out.println(content);
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }