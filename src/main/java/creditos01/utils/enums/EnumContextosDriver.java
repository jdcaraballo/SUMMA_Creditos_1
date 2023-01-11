package creditos01.utils.enums;

public enum EnumContextosDriver {
  NATIVA("NATIVE"),
  WEBVIEW("WEBVIEW");

  private final String contexto;

  EnumContextosDriver(String contexto) {
    this.contexto = contexto;
  }

  public String getContexto() {
    return contexto;
  }
}
