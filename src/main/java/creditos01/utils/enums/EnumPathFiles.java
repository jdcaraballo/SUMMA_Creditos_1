package creditos01.utils.enums;

public enum EnumPathFiles {
  FILE_VALID("C:\\Users\\2462952\\OneDrive - TCS COM PROD\\Documents\\Agile Benefits\\Sprint_13\\PlantillaAuxilios Septiembre M.xlsx"),
  FILE_INVALID("WEBVIEW");

  private final String path;

  EnumPathFiles(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }
}
