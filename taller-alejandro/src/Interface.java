public class Interface {

    private String codigoInterface;
    private String mascara;
    private String repositorio;

    public String listarDirectoriosInterface() {
        //////////////// algoritmo de listar directorios en S3///////////////////77
        mascara = "lo que salga de la bd";
        repositorio = "lo que salga de la bd";
        return "listaarchivos";
    }

    public String getCodigoInterface() {

        return codigoInterface;
    }

    public String getMascara() {
        return mascara;
    }

    public String repositorio() {

        return repositorio;
    }

    public void setCodigoInterface(String codigo) {
        codigoInterface = codigo;
    }

    public void setMascara(String masc) {
        mascara = masc;
    }

    public void setRepositorio(String repo) {
        repositorio = repo;
    }

}
